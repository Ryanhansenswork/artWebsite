package com.art.app.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.app.rest.Models.Orders;
import com.art.app.rest.Models.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersController {

      @Autowired
    OrdersService ordersService;

    
     @PostMapping("/store")
    public Orders saveOrder(@RequestBody Orders orders){
        return ordersService.create(orders);
    }
}
