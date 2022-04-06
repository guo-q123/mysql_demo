package com.chehejia.web.mapper;

import com.chehejia.web.entity.UserAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author guoqiang3
* @description 针对表【user_account】的数据库操作Mapper
* @createDate 2022-04-06 16:30:44
* @Entity com.chehejia.web.entity.UserAccount
*/
@Mapper
public interface UserAccountMapper extends BaseMapper<UserAccount> {

}




