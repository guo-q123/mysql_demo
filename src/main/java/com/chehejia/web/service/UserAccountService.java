package com.chehejia.web.service;

import com.chehejia.web.entity.UserAccount;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chehejia.web.result.ResponseBody;
import com.chehejia.web.result.ResultGenerator;

/**
* @author guoqiang3
* @description 针对表【user_account】的数据库操作Service
* @createDate 2022-04-06 16:30:44
*/
public interface UserAccountService extends IService<UserAccount> {

    ResponseBody insert(UserAccount userAccount);
}
