package cym.ssm.po;

import java.util.Date;

public class OrderReturn {
    private Integer id;

    private Integer userId;

    private Integer orderId;

    private Integer clientId;

    private Date orderReturnDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Date getOrderReturnDate() {
        return orderReturnDate;
    }

    public void setOrderReturnDate(Date orderReturnDate) {
        this.orderReturnDate = orderReturnDate;
    }
}