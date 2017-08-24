package com.tyd.controller;


import com.tyd.pojo.AcctUserDto;
import com.tyd.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value="/showuserInfo", method= RequestMethod.GET)
    public String showUserInfo(ModelMap modelMap, @RequestParam String  userId)
    {
        LOGGER.info("查询用户:"+ userId);
        AcctUserDto userInfo = userService.load(userId);
        modelMap.addAttribute("userInfo",userInfo);
        return "/user/showInfo";
    }
}
