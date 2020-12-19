package com.cjw.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 西楚霸王
 * @date 2020/12/18 21:47
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back,失败";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut,超时";
    }
}
