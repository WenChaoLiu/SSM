package cym.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenyuming on 2017/4/7.
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) throws Exception{
        System.out.println(page);
        return page;
    }
}
