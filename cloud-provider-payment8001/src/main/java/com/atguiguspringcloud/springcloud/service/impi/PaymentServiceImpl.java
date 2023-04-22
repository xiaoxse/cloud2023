package com.atguiguspringcloud.springcloud.service.impi;

import com.atguiguspringcloud.springcloud.dao.PaymentDao;
import com.atguiguspringcloud.springcloud.entities.Payment;
import com.atguiguspringcloud.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Mouoal
 * @Description: 说明用途
 * @Date 2023/4/20 16:18
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
