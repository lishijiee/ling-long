package com.lishijiee.boot.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.lishijiee.boot.utils.id.SnowFlakeFactory;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@TableName("T_ORDER")
public class Order implements Serializable {
//    @Serial
//    private static final long serialVersionUID = -2L;
    /**
     * 数据id
     */
    @TableId(value = "ID", type = IdType.INPUT)
    @TableField(value = "ID", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 用户名
     * */
    @TableField("T_USER_ID")
    private Long userId;

    /**
     * 用户名
     * */
    @TableField("T_USER_NAME")
    private String username;

    /**
     * 电话
     * */
    @TableField("T_PHONE")
    private String phone;

    /**
     * 地址
     * */
    @TableField("T_ADDRESS")
    private String address;

    /**
     * 总价
     * */
    @TableField("T_TOTAL_PRICE")
    private BigDecimal totalPrice;

    public Order(){
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
    }
}
