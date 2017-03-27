package cym.ssm.po;

public class PurchaseDetail {
    private Integer id;

    private Integer purchaseId;

    private Integer goodsId;

    private Integer goodsNum;

    private Double goodsInprice;

    private Integer goodsSumPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Double getGoodsInprice() {
        return goodsInprice;
    }

    public void setGoodsInprice(Double goodsInprice) {
        this.goodsInprice = goodsInprice;
    }

    public Integer getGoodsSumPrice() {
        return goodsSumPrice;
    }

    public void setGoodsSumPrice(Integer goodsSumPrice) {
        this.goodsSumPrice = goodsSumPrice;
    }
}