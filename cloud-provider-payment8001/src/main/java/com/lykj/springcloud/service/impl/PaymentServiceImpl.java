package com.lykj.springcloud.service.impl;

import com.lykj.springcloud.dao.PaymentMapper;
import com.lykj.springcloud.entities.Payment;
import com.lykj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentDaoMapper;

    @Override
    public int create(Payment payment) {
        return paymentDaoMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDaoMapper.selectByPrimaryKey(id);
    }
}
