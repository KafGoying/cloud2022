package com.lykj.springcloud.service;

import com.lykj.springcloud.dao.PaymentMapper;
import com.lykj.springcloud.entities.PaymentDomain;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(PaymentDomain payment);

    public PaymentDomain getPaymentById(@Param("id") Long id);
}
