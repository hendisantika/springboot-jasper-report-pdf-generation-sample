package com.hendisantika.service;

import com.hendisantika.model.Address;
import com.hendisantika.model.Order;
import com.hendisantika.model.OrderEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jasper-report-pdf-generation-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/09/21
 * Time: 05.54
 */
@Service
public class MockOrderService {
    public Order getOrderByCode(final String code) {
        return order(code);
    }

    private Order order(String code) {
        return new Order(code, address(), entries());
    }

    private Address address() {
        return new Address("Uzumaki",
                "Naruto",
                "Konohagakure",
                "75000",
                "Konoha",
                "Japan");
    }

    private List<OrderEntry> entries() {
        return new ArrayList<OrderEntry>() {
            {
                add(new OrderEntry("Apple IPhone X", 1, 500d));
                add(new OrderEntry("Samsung Galaxy s8", 2, 400d));
                add(new OrderEntry("Xiaomi Note 9 Pro", 5, 1000d));
            }
        };
    }
}
