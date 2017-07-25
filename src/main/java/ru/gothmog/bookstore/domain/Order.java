package ru.gothmog.bookstore.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author d.grushetskiy
 */
@Entity
@Table(name = "user_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date orderDate;
    private Date shippingDate;
    private String shippingMethod;
    private String orderStatus;
    private BigDecimal orderTotal;
}
