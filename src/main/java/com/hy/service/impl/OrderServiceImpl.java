package com.hy.service.impl;

import com.hy.model.OrderDTO;
import org.springframework.stereotype.Service;

/**
 * @Author: CipherCui
 * @Description:
 * @Date: Created in 9:54 2019/2/2
 */
@Service
public class OrderServiceImpl {


    public String handle(OrderDTO dto) {
        String type = dto.getType();
        if ("1".equals(type)) {
            return "处理普通订单";
        } else if ("2".equals(type)) {
            return "处理团购订单";
        } else if ("3".equals(type)) {
            return "处理促销订单";
        }
        return null;
    }

}
