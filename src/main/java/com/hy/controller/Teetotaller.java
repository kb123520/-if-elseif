package com.hy.controller;

import com.hy.js.App;
import com.hy.model.OrderDTO;
import com.hy.service.IOrderService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: cmc_meter
 * @Package: com.hy.controller
 * @ClassName: Testcontroller
 * @Author: 张燕鹏
 * @Description: 去掉if、elseif
 * @Date: 2019/12/6 14:10
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class Teetotaller {

    @Autowired
    private IOrderService iOrderService;

    @Before
    public void before() {
        System.out.println("start=============");
    }
    @Test
    public void test(){
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setType(new String("2"));
        String type=iOrderService.handle(orderDTO);
        System.out.println(type+"==============");
    }
}
