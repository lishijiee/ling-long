package com.lishijiee.boot.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.lishijiee.boot.utils.id.SnowFlakeFactory;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@TableName("T_ORDER_ITEM")
public class OrderItem implements Serializable {
//    @Serial
//    private static final long serialVersionUID = -4L;
    /**
     * 数据id
     */
    @TableId(value = "ID", type = IdType.INPUT)
    @TableField(value = "ID", fill = FieldFill.INSERT)
    private Long id;

    @TableField("T_ORDER_ID")
    private Long orderId;

    /**
     * 商品id
     */
    @TableField("T_PRO_ID")
    private Long proId;

    /**
     * 商品名称
     */
    @TableField("T_PRO_NAME")
    private String proName;

    /**
     * 商品价格（单价）
     */
    @TableField("T_PRO_PRICE")
    private BigDecimal proPrice;

    /**
     * 购买数量
     */
    @TableField("T_NUMBER")
    private Integer number;

    public OrderItem(){
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
    }
}
