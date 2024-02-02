package com.bvr.ecommdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.bvr.ecommdemo.model.Order;
import com.bvr.ecommdemo.services.OrderService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable("id") long orderId) {
        return orderService.getOrderById(orderId);
    }

    @PostMapping("/orders")
    public String addOrder(Order order) {
        orderService.addOrder(order);
        return "Order added successfully";

    }

    @DeleteMapping("/orders/{id}")
    public String deleteOrder(@PathVariable("id") long orderId) {
        orderService.deleteOrder(orderId);
        return "Order deleted successfully";
    }


}
