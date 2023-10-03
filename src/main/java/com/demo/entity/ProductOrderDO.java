package com.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@TableName("product_order")
public class ProductOrderDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String outTradeNo;

    private String state;

    private LocalDateTime createTime;

    private BigDecimal payAmount;

    private String nickName;

    private Long userId;
}
