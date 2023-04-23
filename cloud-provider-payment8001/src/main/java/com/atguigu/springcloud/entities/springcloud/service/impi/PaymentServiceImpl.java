package com.atguigu.springcloud.entities.springcloud.service.impi;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.entities.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.springcloud.service.PaymentService;
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
