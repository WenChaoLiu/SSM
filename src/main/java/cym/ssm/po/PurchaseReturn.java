package cym.ssm.po;

import java.util.Date;

public class PurchaseReturn {
    private Integer id;

    private Date purchaseReturnTime;

    private Integer userId;

    private Integer purchaseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPurchaseReturnTime() {
        return purchaseReturnTime;
    }

    public void setPurchaseReturnTime(Date purchaseReturnTime) {
        this.purchaseReturnTime = purchaseReturnTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }
}