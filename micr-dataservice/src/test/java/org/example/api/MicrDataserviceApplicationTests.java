package org.example.api;

import org.example.api.mapper.BidInfoMapper;
import org.example.api.mapper.ProductInfoMapper;
import org.example.api.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MicrDataserviceApplicationTests {
    //    注入Mapper resource 和 autowire 都可以
    @Resource
    private UserMapper userMapper;
    @Resource
    private ProductInfoMapper productInfoMapper;
    @Resource
    private BidInfoMapper bidInfoMapper;


    @Test
    void contextLoads() {
        int i = userMapper.selectCountUser();
        System.out.println(i);
    }

}
