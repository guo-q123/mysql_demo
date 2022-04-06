package com.chehejia.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chehejia.web.entity.UserAccount;
import com.chehejia.web.result.ResponseBody;
import com.chehejia.web.result.ResultGenerator;
import com.chehejia.web.service.UserAccountService;
import com.chehejia.web.mapper.UserAccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author guoqiang3
 * @description 针对表【user_account】的数据库操作Service实现
 * @createDate 2022-04-06 16:30:44
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

    @Resource
    private UserAccountMapper userAccountMapper;

    @Override
    public ResponseBody insert(UserAccount userAccount) {
        int insert = userAccountMapper.insert(userAccount);
        return ResultGenerator.getSuccessResult(insert);
    }
}




