package cym.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping("/loginSuccess")
    public ModelAndView loginSuccess() throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/WEB-INF/page/index.jsp");
        return modelAndView;
    }
    @RequestMapping("/home")
    public ModelAndView home() throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/WEB-INF/page/home.jsp");
        return modelAndView;
    }

}
