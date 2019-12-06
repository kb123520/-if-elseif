package com.hy.service.impl;

import com.hy.handler.AbstractHandler;
import com.hy.handler.HandlerContext;
import com.hy.model.OrderDTO;
import com.hy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: CipherCui
 * @Description:
 * @Date: Created in 9:54 2019/2/2
 */
@Service
public class OrderServiceV2Impl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        System.out.println(handler.getClass().getName());
        return handler.handle(dto);
    }

}
