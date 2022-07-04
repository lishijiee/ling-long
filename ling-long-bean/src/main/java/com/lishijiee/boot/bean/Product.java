package com.lishijiee.boot.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.lishijiee.boot.utils.id.SnowFlakeFactory;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@TableName("T_PRODUCT")
public class Product implements Serializable {
//    @Serial
//    private static final long serialVersionUID = -3L;
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 商品名称
     */
    @TableField("T_PRO_NAME")
    private String proName;

    /**
     * 商品价格
     */
    @TableField("T_PRO_PRICE")
    private BigDecimal proPrice;

    /**
     * 商品库存
     */
    @TableField("T_PRO_STOCK")
    private Integer proStock;

    public Product(){
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
    }

}
