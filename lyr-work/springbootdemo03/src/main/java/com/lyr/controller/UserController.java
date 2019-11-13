package com.lyr.controller;

import com.lyr.pojo.User;
import com.lyr.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
@Api(value = "测试接口", tags = "UserController", description = "测试接口相关")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * ApiIgnore 使用该注解忽略这个API，不会生成接口文档。可注解在类和方法上
     * @return
     */
    @RequestMapping(value="findAllUser",method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    public Map<String,Object> findAllUser(){
        List<User> list=userService.findAllUser();
        System.out.println(list.toString());
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        map.put("rel","true");
        return map;
    }
}
