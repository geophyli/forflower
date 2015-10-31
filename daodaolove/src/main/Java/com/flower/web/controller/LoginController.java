package com.flower.web.controller;

/**
 * Created by Administrator on 2015/10/19.
 */



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * TODO 控制层代码
 *
 * @author daodao
 * @date 2014年11月27日
 */
@Controller
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("login") //用来处理前台的login请求
    @ResponseBody
    String hello(@RequestParam(value = "username", required = false) String username,
                 @RequestParam(value = "password", required = false) String password
    ) {

        logger.info("登录成功");
        return "Hello " + username + ",Your password is: " + password;

    }

}

