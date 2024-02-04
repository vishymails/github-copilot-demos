package com.bvr.ecommdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bvr.ecommdemo.model.Order;
import com.bvr.ecommdemo.repository.OrderRepository;

import java.util.List;

@Repository
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order getOrderById(long orderId) {
        return orderRepository.findById(orderId).get();
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(long orderId) {
        orderRepository.deleteById(orderId);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }


}
