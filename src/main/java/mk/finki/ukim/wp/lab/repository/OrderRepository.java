package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.model.Order;
import mk.finki.ukim.wp.lab.model.exceptions.InvalidOrderException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    List<Order> orderList = new ArrayList<>();
    private long id = 0;

    public Order placeOrder(String balloonColor, String balloonSize, String clientName, String clientAddress){
        if (balloonColor == null || balloonColor.isEmpty() || balloonSize == null || balloonSize.isEmpty() || clientName == null || clientName.isEmpty() || clientAddress == null || clientAddress.isEmpty()){
            throw new InvalidOrderException();
        }

        Order o = new Order(balloonColor, balloonSize, clientName, clientAddress, id);
        id += 1;
        orderList.add(o);
        return o;

    }

}
