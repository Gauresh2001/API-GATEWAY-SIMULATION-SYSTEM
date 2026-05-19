package com.gateway.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gateway.entity.Order;
import com.gateway.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order order) {

        Order existingOrder = orderRepository.findById(id).orElse(null);

        if (existingOrder != null) {
            existingOrder.setOrderName(order.getOrderName());
            existingOrder.setPrice(order.getPrice());

            return orderRepository.save(existingOrder);
        }

        return null;
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
