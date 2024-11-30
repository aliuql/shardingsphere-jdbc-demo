package com.demo.service.impl;

import com.demo.entity.OrderDO;
import com.demo.mapper.OrderMapper;
import com.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer save() {
        OrderDO orderDO = OrderDO.builder()
                .orderNo("20230101001")
                .status("NEW")
                .amount(new BigDecimal("100.02"))
                .userId((long) 15)
                .nickName("aliuql")
                .build();
        return orderMapper.insert(orderDO);
    }
}
