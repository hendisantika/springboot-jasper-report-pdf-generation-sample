package com.hendisantika.model;

import lombok.Data;

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
public class OrderEntry {
    private String productName;
    private Integer quantity;
    private Double price;

    public Double getPriceTotal() {
        return quantity * price;
    }
}
