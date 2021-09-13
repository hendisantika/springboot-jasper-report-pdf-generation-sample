package com.hendisantika.controller;

import com.hendisantika.service.InvoiceService;
import com.hendisantika.service.MockOrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jasper-report-pdf-generation-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/09/21
 * Time: 05.57
 */
@Controller
@RequestMapping("/invoice/generator")
public class InvoiceController {

    static private final Logger logger = LogManager.getLogger(InvoiceController.class);

    @Resource
    private MockOrderService mockOrderService;

    @Resource
    private InvoiceService invoiceService;

    // display invoice generator : /resources/templates/forms.html
    @GetMapping("/forms")
    public String invoiceForms() {
        return "forms";
    }
}
