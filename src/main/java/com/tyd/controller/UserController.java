package com.tyd.controller;


import com.tyd.entity.AcctUser;
import com.tyd.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZKY on 2017-08-23 18:47.
 * 描述：用户Controller
 */
@Controller
@RequestMapping("/user")
public class UserController
{
    private static final Logger LOGGER= Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    public String showUserInfo(ModelMap modelMap, @PathVariable String  userId)
    {
        LOGGER.info("查询用户:"+ userId);

        AcctUser userInfo = userService.load(userId);
        modelMap.addAttribute("userInfo",userInfo);
        return "/user/showInfo";
    }
}
