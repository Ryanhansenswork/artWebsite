package com.art.app.rest.Models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.app.rest.Models.Orders;
import com.art.app.rest.Models.OrdersService;
import com.art.app.rest.Repo.OrdersRepo;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersRepo ordersRepo;

    @Override
    public Orders create(Orders orders){
        return ordersRepo.save(orders);
    }
}
