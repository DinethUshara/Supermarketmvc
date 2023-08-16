/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.mvc.model;

/**
 *
 * @author USHARA
 */
public class OrderDetailModel {
    private String orderId;
    private String itemCode;
    private int qty;
    private Double Discount;

    public OrderDetailModel() {
    }

    public OrderDetailModel(String orderId, String itemCode, int qty, Double Discount) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.Discount = Discount;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the Discount
     */
    public Double getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(Double Discount) {
        this.Discount = Discount;
    }

    @Override
    public String toString() {
        return "OrderDetailModel{" + "orderId=" + orderId + ", itemCode=" + itemCode + ", qty=" + qty + ", Discount=" + Discount + '}';
    }
    
    
    
}
