package mk.finki.ukim.wp.lab.service.Impl;

import mk.finki.ukim.wp.lab.model.Order;
import mk.finki.ukim.wp.lab.repository.OrderRepository;
import mk.finki.ukim.wp.lab.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order placeOrder(String balloonColor, String ballonSize, String clientName, String address) {
        return orderRepository.placeOrder(balloonColor, ballonSize, clientName, address);
    }

}
