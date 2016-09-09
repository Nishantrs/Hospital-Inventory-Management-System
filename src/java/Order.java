
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrimaghosh
 */
public class Order {
    
    int oId;
 String orderedBy;
int vendorIdinOrder;

int doctorIdinOrder;
int productIdinOrder;
int patientIdinOrder;





float orderPrice; 


Date orderDate;

    Date OrderCompExp;

    boolean dispatched;

    boolean cancelled ;

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    public int getVendorIdinOrder() {
        return vendorIdinOrder;
    }

    public void setVendorIdinOrder(int vendorIdinOrder) {
        this.vendorIdinOrder = vendorIdinOrder;
    }

    public int getDoctorIdinOrder() {
        return doctorIdinOrder;
    }

    public void setDoctorIdinOrder(int doctorIdinOrder) {
        this.doctorIdinOrder = doctorIdinOrder;
    }

    public int getProductIdinOrder() {
        return productIdinOrder;
    }

    public void setProductIdinOrder(int productIdinOrder) {
        this.productIdinOrder = productIdinOrder;
    }

    public int getPatientIdinOrder() {
        return patientIdinOrder;
    }

    public void setPatientIdinOrder(int patientIdinOrder) {
        this.patientIdinOrder = patientIdinOrder;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderCompExp() {
        return OrderCompExp;
    }

    public void setOrderCompExp(Date OrderCompExp) {
        this.OrderCompExp = OrderCompExp;
    }

    public boolean isDispatched() {
        return dispatched;
    }

    public void setDispatched(boolean dispatched) {
        this.dispatched = dispatched;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    
}
