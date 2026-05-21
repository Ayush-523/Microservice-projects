package com.example.controller;

import com.example.entity.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;
    @GetMapping("/orders")
    public String getOrders() {
        return "Welcome to Order Service!";
    }

    @PostMapping("/bookOrder")
    public Order bookOrder(@RequestBody Order order) {

        if(order == null){
            throw new RuntimeException("Order object is null");
        }

        return service.saveOrder(order);
    }
}