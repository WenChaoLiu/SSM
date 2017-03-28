package cym.ssm.po;

/**
 * Created by chenyuming on 2017/3/28.
 */
public class TUserQueryVo {
    private TUser tUser;
    private TUserCustom tUserCustom;

    public TUserCustom gettUserCustom() {
        return tUserCustom;
    }

    public void settUserCustom(TUserCustom tUserCustom) {
        this.tUserCustom = tUserCustom;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }
}
