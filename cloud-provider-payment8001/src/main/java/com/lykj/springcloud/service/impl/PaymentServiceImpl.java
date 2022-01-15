package com.lykj.springcloud.service.impl;

import com.lykj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDaoMapper paymentDaoMapper;

    @Override
    public int create(PaymentDao paymentDao) {
        return paymentDaoMapper.insert(paymentDao);
    }

    @Override
    public PaymentDao getPaymentById(Long id) {
        return paymentDaoMapper.selectByPrimaryKey(id);
    }
}
