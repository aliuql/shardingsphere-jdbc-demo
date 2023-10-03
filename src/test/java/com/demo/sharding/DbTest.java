package com.demo.sharding;

import com.demo.ShardingsphereJdbcDemoApplication;
import com.demo.entity.OrderDO;
import com.demo.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest(classes = ShardingsphereJdbcDemoApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class DbTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSaveOrder() {
        for (int i = 0; i < 16; i++) {
            OrderDO orderDO = OrderDO.builder()
                    .orderNo("20231002010101")
                    .status("NEW")
                    .amount(new BigDecimal("100.02"))
                    .userId((long)i)
                    .nickName("aliuql")
                    .createTime(LocalDateTime.now())
                    .updateTime(LocalDateTime.now())
                    .build();
            orderMapper.insert(orderDO);
        }
    }
}
