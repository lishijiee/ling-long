package com.lishijiee.boot.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("T_USER")
public class User implements Serializable {
//    @Serial
//    private static final long serialVersionUID = -1L;
    /**
     * ID
     * */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 用户名
     * */
    @TableField("T_USERNAME")
    private String username;

    /**
     * 密码
     * */
    @TableField("T_PASSWORD")
    private String password;

    /**
     * 电话
     * */
    @TableField("T_PHONE")
    private String phone;

    /**
     * 邮箱
     * */
    @TableField("T_EMAIL")
    private String email;

    /**
     * 地址
     * */
    @TableField("T_ADDRESS")
    private String address;

}
