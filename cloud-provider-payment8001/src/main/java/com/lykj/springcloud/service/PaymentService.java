package com.lykj.springcloud.service;

import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(PaymentDao payment);

    public PaymentDao  getPaymentById(@Param("id") Long id);
}
