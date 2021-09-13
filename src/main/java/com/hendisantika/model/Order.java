package com.hendisantika.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jasper-report-pdf-generation-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/09/21
 * Time: 05.49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String code;
    private Address address;
    private List<OrderEntry> entries;

    public Double getTotalPrice() {
        return getEntries().stream().mapToDouble(OrderEntry::getPriceTotal).sum();
    }

    public Integer getTotalQuantity() {
        return getEntries().stream().mapToInt(OrderEntry::getQuantity).sum();
    }

}
