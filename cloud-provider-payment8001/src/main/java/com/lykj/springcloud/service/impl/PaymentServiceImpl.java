package com.lykj.springcloud.service.impl;

import com.lykj.springcloud.dao.PaymentMapper;
import com.lykj.springcloud.entities.PaymentDomain;
import com.lykj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentDaoMapper;

    @Override
    public int create(PaymentDomain payment) {
        return paymentDaoMapper.insert(payment);
    }

    @Override
    public PaymentDomain getPaymentById(Long id) {
        return paymentDaoMapper.selectByPrimaryKey(id);
    }
}
