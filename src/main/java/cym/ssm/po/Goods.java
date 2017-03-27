package cym.ssm.po;

public class Goods {
    private Integer id;

    private String goodsName;

    private Integer goodsMaxNum;

    private Integer goodsMinNum;

    private Double goodsPrice;

    private Integer categoryId;

    private String goodsUnit;

    private Integer goodsAmnout;

    private Boolean goodsIsdelete;

    private String goodsImgpath;

    private String goodsDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsMaxNum() {
        return goodsMaxNum;
    }

    public void setGoodsMaxNum(Integer goodsMaxNum) {
        this.goodsMaxNum = goodsMaxNum;
    }

    public Integer getGoodsMinNum() {
        return goodsMinNum;
    }

    public void setGoodsMinNum(Integer goodsMinNum) {
        this.goodsMinNum = goodsMinNum;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    public Integer getGoodsAmnout() {
        return goodsAmnout;
    }

    public void setGoodsAmnout(Integer goodsAmnout) {
        this.goodsAmnout = goodsAmnout;
    }

    public Boolean getGoodsIsdelete() {
        return goodsIsdelete;
    }

    public void setGoodsIsdelete(Boolean goodsIsdelete) {
        this.goodsIsdelete = goodsIsdelete;
    }

    public String getGoodsImgpath() {
        return goodsImgpath;
    }

    public void setGoodsImgpath(String goodsImgpath) {
        this.goodsImgpath = goodsImgpath == null ? null : goodsImgpath.trim();
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription == null ? null : goodsDescription.trim();
    }
}