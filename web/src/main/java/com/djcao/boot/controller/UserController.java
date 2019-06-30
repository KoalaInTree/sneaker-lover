package com.djcao.boot.controller;

import javax.annotation.Resource;

import com.djcao.boot.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author djcao
 * @workcode wb-cdj390654
 * @date 2019-06-29
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("get/{id}")
    @ResponseBody
    public Object getById(@PathVariable(value = "id")Long id){
        return userService.getById(id);
    }


}
