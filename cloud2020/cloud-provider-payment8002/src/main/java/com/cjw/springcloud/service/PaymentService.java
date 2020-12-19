package com.cjw.springcloud.service;

import com.cjw.springcloud.entities.Payment;

/**
 * @author 西楚霸王
 * @date 2020/12/7 15:41
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
