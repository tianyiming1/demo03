package com.ibeetl.admin.core.web;

import com.ibeetl.admin.core.gen.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Hello {

   
    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello(@Valid User user , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return  bindingResult.getAllErrors().get(0).getDefaultMessage();
        }
        return "success";
    }
}