package com.atguiguspringcloud.springcloud.dao;

import com.atguiguspringcloud.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Mouoal
 * @Description: 说明用途
 * @Date 2023/4/20 15:47
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
