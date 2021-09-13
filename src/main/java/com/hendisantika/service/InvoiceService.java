package com.hendisantika.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jasper-report-pdf-generation-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/09/21
 * Time: 05.52
 */
@Service
public class InvoiceService {

    private static final Logger logger = LogManager.getLogger(InvoiceService.class);

    @Value("${invoice.logo.path}")
    private String logoPath;

    @Value("${invoice.template.path}")
    private String invoiceTemplate;
}
