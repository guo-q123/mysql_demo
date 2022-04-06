package com.chehejia.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName user_account
 */
@TableName(value ="user_account")
@Data
public class UserAccount implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Object id;

    /**
     * 
     */
    @TableField(value = "balance")
    private BigDecimal balance;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}