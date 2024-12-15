package com.art.app.rest.Models;
import org.springframework.stereotype.Service;

import com.art.app.rest.Models.Orders;

@Service
public interface OrdersService {
    public Orders create(Orders orders);
}
