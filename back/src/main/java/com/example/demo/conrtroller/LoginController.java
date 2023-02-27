package com.example.demo.conrtroller;

import com.example.demo.inf.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import com.example.demo.result.Result;
import com.example.demo.result.ResultFactory;
import com.example.demo.result.ResultCode;

@Controller
public class LoginController {

    @Autowired
    UserService userService;//定义一个服务

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        String password = requestUser.getPassword();
        username = HtmlUtils.htmlEscape(username);
        User user = userService.get(username, password);
        if (user==null) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }

    @PostMapping("/api/register")
    @ResponseBody
    public Result register(@RequestBody User user) {
        int status = userService.register(user);
        switch (status) {
            case 0:
                return ResultFactory.buildFailResult("用户名和密码不能为空");
            case 1:
                return ResultFactory.buildSuccessResult("注册成功");
            case 2:
                return ResultFactory.buildFailResult("用户已存在");
        }
        return ResultFactory.buildFailResult("未知错误");
    }


}

