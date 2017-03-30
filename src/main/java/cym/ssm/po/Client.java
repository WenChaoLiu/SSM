package cym.ssm.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Client {
    private Integer id;

    private String clientName;

    private String clientAddress;

    private String clientTel;

    private String clientSex;

    private String clientEmail;

    private String clientType;

    private String clientBusiness;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date clientAddtime;

    private String clientMobile;

    private Integer clientIsdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress == null ? null : clientAddress.trim();
    }

    public String getClientTel() {
        return clientTel;
    }

    public void setClientTel(String clientTel) {
        this.clientTel = clientTel == null ? null : clientTel.trim();
    }

    public String getClientSex() {
        return clientSex;
    }

    public void setClientSex(String clientSex) {
        this.clientSex = clientSex == null ? null : clientSex.trim();
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail == null ? null : clientEmail.trim();
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    public String getClientBusiness() {
        return clientBusiness;
    }

    public void setClientBusiness(String clientBusiness) {
        this.clientBusiness = clientBusiness == null ? null : clientBusiness.trim();
    }

    public Date getClientAddtime() {
        return clientAddtime;
    }

    public void setClientAddtime(Date clientAddtime) {
        this.clientAddtime = clientAddtime;
    }

    public String getClientMobile() {
        return clientMobile;
    }

    public void setClientMobile(String clientMobile) {
        this.clientMobile = clientMobile == null ? null : clientMobile.trim();
    }

    public Integer getClientIsdel() {
        return clientIsdel;
    }

    public void setClientIsdel(Integer clientIsdel) {
        this.clientIsdel = clientIsdel;
    }
}