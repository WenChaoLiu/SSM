package cym.ssm.controller;


import cym.ssm.po.TUserCustom;
import cym.ssm.po.TUserQueryVo;
import cym.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by chenyuming on 2017/3/25.
 */
@Controller
public class LoginController {
    @Autowired
    private IUserService userService;

/*    @RequestMapping("/login")
    public ModelAndView toLogin() throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("page/login");
        return modelAndView;
    }*/

    @RequestMapping(value = "validateUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String validateUser(HttpSession session,
                               TUserQueryVo tUserQueryVo) throws Exception {
        String username = tUserQueryVo.gettUserCustom().getUsername();
        String password = tUserQueryVo.gettUserCustom().getPassword();
        TUserCustom tUserCustom = userService.findUserByName(tUserQueryVo);
        if (tUserCustom != null) {
            if (username.equals(tUserCustom.getUsername()) && password.equals(tUserCustom.getPassword()))
                session.setAttribute("loginUser", tUserCustom);
            return "page/index";
        }
        return "page/login";
    }
}
