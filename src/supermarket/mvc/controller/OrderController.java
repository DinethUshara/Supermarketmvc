/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.mvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import supermarket.mvc.db.DBConnection;
import supermarket.mvc.model.OrderDetailModel;
import supermarket.mvc.model.OrderModel;

/**
 *
 * @author USHARA
 */
public class OrderController {
    public String placeOrder(OrderModel orderModel,ArrayList <OrderDetailModel> orderDetailModels) throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
       try{ 
        connection.setAutoCommit(false);
        String orderQuery="INSERT INTO orders VALUES(?,?,?)";
        PreparedStatement statementForOrder = connection.prepareStatement(orderQuery);
        statementForOrder.setString(1, orderModel.getOrderId());
        statementForOrder.setString(2, orderModel.getOrderDate());
        statementForOrder.setString(3, orderModel.getCustomerId());
        if(statementForOrder.executeUpdate() > 0){
            
            boolean isOrderDetailSaved=true;
            String orderDetailQuery="INSERT INTO orderdetail VALUES(?,?,?,?)";
            PreparedStatement statementForOrderDetail = connection.prepareStatement(orderDetailQuery);
            for(OrderDetailModel orderModelDetail:orderDetailModels){
                statementForOrderDetail.setString(1, orderModel.getOrderId());
                statementForOrderDetail.setString(2, orderModelDetail.getItemCode());
                statementForOrderDetail.setInt(3, orderModelDetail.getQty());
                statementForOrderDetail.setDouble(4, orderModelDetail.getDiscount());
            
                if(!(statementForOrderDetail.executeUpdate()>1)){
                    isOrderDetailSaved=false;
                }
                
            }
            
            if(isOrderDetailSaved){
                boolean isItemUpdated=true;
                String itemQuery="UPDATE item SET QtyOnHand = QtyOnHand-? WHERE ITEMCODE = ?";
                PreparedStatement statementForItem = connection.prepareStatement(itemQuery);
                for(OrderDetailModel orderModelDetail:orderDetailModels){
                    statementForItem.setInt(1, orderModelDetail.getQty());
                    statementForItem.setString(2, orderModelDetail.getItemCode());
                    if(!(statementForItem.executeUpdate()>1)){
                    isItemUpdated=false;}
                    
                }
                
                if(isItemUpdated){
                    connection.commit();
                    return "Success";}
                else{
                    connection.rollback();
                    return "Item Update Error";
                }
            }else{
                connection.rollback();
                return "Order Detail Save Error";
            }
          
            
            
        } else{
            connection.rollback();
            return "Order Save Error";
        }
       
       }catch(Exception ex){
           connection.rollback();
           ex.printStackTrace();
           return ex.getMessage();
       }
       finally{
           connection.setAutoCommit(true);
       }
        
    }

    
}
