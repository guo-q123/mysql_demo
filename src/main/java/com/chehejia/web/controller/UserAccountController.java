package com.chehejia.web.controller;

import com.chehejia.web.entity.UserAccount;
import com.chehejia.web.result.ResponseBody;
import com.chehejia.web.service.UserAccountService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author guoqiang3@lixiang.com
 * @version 1.0
 * @Date 2022/04/06
 */
@RestController
@RequestMapping("/hello")
public class UserAccountController {

    @Resource
    private UserAccountService service;

    @PostMapping("/add")
    public ResponseBody add(@RequestBody UserAccount userAccount) {
        return service.insert(userAccount);
    }

    @GetMapping("/select")
    public ResponseBody select() {
        return service.select();
    }
}
