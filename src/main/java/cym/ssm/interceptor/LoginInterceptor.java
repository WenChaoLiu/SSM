package cym.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by chenyuming on 2017/3/29.
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //获取请求的url
        String url = httpServletRequest.getRequestURI();
        //判断是否公开地址
        //这里是公开地址是登录提交的地址
        if (url.indexOf("login.action") > 0 || url.indexOf("validateUser.action") > 0) {
            //放行
            return true;
        }
        //判断session
        HttpSession session = httpServletRequest.getSession();
        return session.getAttribute("loginUser") != null;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
