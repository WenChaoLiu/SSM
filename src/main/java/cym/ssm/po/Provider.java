package cym.ssm.po;

public class Provider {
    private Integer id;

    private String providerName;

    private String providerAddress;

    private String providerLinkmale;

    private String providerTel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName == null ? null : providerName.trim();
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress == null ? null : providerAddress.trim();
    }

    public String getProviderLinkmale() {
        return providerLinkmale;
    }

    public void setProviderLinkmale(String providerLinkmale) {
        this.providerLinkmale = providerLinkmale == null ? null : providerLinkmale.trim();
    }

    public String getProviderTel() {
        return providerTel;
    }

    public void setProviderTel(String providerTel) {
        this.providerTel = providerTel == null ? null : providerTel.trim();
    }
}