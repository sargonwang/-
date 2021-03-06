package com.lzp.springboot.controller;


import com.lzp.springboot.exception.MyException;
import com.lzp.springboot.model.User;
import com.lzp.springboot.util.Code;
import com.lzp.springboot.util.Response;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping(value = "/add")
    Response<User> add(@Validated User user){

        //todo 此处为模拟返回
        Response<User> response = new Response<>();
        response.setCode(Code.SUCCESSED);
        response.setResult(new User());
        return  response;
    }


    @PostMapping(value = "/update")
    Response<Boolean> update(User user){

        //todo 此处为模拟异常抛出
        if(true){
            throw new MyException("更新失败");
        }
        //todo 此处为模拟返回
        Response<Boolean> response = new Response<>();
        response.setCode(Code.SUCCESSED);
        response.setResult(true);
        return  response;
    }

}
