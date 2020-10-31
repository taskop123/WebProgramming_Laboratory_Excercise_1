package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Order;

public interface OrderService {
    Order placeOrder(String balloonColor, String ballonSize, String clientName, String address);
}
