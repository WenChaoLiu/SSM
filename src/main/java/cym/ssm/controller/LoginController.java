package cym.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chenyuming on 2017/3/25.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public ModelAndView login() throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("page/login");
        return modelAndView;
    }

    @RequestMapping(value = "validateUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String validateUser(Model model,
                               @RequestParam(name = "username") String username,
                               @RequestParam(name = "password") String password) throws Exception {

        System.out.println(username);
        System.out.println(password);
        return null;
    }

    @RequestMapping("/loginSuccess")
    public ModelAndView loginSuccess() throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/page/index");
        return modelAndView;
    }
    @RequestMapping("/home")
    public ModelAndView home() throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/page/home");
        return modelAndView;
    }
}
