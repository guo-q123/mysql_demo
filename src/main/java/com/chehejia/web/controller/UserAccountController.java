package com.chehejia.web.controller;

import com.chehejia.web.entity.UserAccount;
import com.chehejia.web.result.ResponseBody;
import com.chehejia.web.service.UserAccountService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/add")
    public ResponseBody examOverview(@RequestBody UserAccount userAccount) {
        return service.insert(userAccount);
    }
}
