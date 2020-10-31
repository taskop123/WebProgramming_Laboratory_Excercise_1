package mk.finki.ukim.wp.lab.model;

import lombok.Data;

@Data
public class Order {

    private String balloonColor;

    private String balloonSize;

    private String clientName;

    private String clientAddress;

    private long orderId;

    public Order(String balloonColor, String balloonSize, String clientName, String clientAddress, long orderId) {
        this.balloonColor = balloonColor;
        this.balloonSize = balloonSize;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.orderId = orderId;
    }
}
