package com.nikolaychuks.orderservice.controller;

import com.nikolaychuks.orderservice.model.Order;
import com.nikolaychuks.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping()
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }
}
