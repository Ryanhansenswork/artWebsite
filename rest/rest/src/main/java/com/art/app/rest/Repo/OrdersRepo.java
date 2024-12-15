package com.art.app.rest.Repo;
import com.art.app.rest.Models.Orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo  extends JpaRepository<Orders, Long>{

    
} 
