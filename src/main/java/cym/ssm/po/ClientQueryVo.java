package cym.ssm.po;

import java.util.List;

/**
 * Created by chenyuming on 2017/3/30.
 */
public class ClientQueryVo {
    private ClientCustom clientCustom;
    private Client client;
    private List<ClientCustom> clientCustomList;

    public List<ClientCustom> getClientCustomList() {
        return clientCustomList;
    }

    public void setClientCustomList(List<ClientCustom> clientCustomList) {
        this.clientCustomList = clientCustomList;
    }

    public ClientCustom getClientCustom() {
        return clientCustom;
    }

    public void setClientCustom(ClientCustom clientCustom) {
        this.clientCustom = clientCustom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
