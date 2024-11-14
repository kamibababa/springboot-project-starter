package org.example.controller;

import org.example.entity.UsersEntity;
import org.example.mapper.UsersMapper;
import org.example.response.ApiResponse;
import org.example.utils.JwtService;
import org.example.utils.UserUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;

@RestController
public class HelloController {
    @Resource
    UsersMapper usersMapper;
    @Resource
    JwtService jwtService;
    @GetMapping("/hello")
    public String hello(){
        UsersEntity result = UserUtils.getLoginUser();
        return result.toString();
    }
    @PostMapping("/login")
    public ApiResponse<String> loginUser(@RequestBody UsersEntity usersInfo) throws Exception {
        UsersEntity usersEntity = usersMapper.loginUser(usersInfo);
        if(usersEntity != null){
            String token = jwtService.toToken(usersEntity);
            return ApiResponse.success(token);
        }
        else{
            throw new Exception("login failed");
        }
    }
}
