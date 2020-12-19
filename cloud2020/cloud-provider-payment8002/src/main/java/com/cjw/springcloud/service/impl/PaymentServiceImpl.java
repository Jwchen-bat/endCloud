package com.cjw.springcloud.service.impl;

import com.cjw.springcloud.dao.PaymentDao;
import com.cjw.springcloud.entities.Payment;
import com.cjw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 西楚霸王
 * @date 2020/12/7 15:43
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
