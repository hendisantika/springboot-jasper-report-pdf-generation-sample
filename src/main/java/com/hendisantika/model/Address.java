package com.hendisantika.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jasper-report-pdf-generation-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/09/21
 * Time: 05.48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String firstName;
    private String lastName;
    private String streetName;
    private String postalCode;
    private String town;
    private String country;
}
