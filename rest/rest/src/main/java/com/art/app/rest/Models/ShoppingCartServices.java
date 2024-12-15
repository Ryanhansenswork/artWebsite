package com.art.app.rest.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.app.rest.Repo.CartRepository;
import com.art.app.rest.Models.Cart;

@Service
public class ShoppingCartServices {
    @Autowired
    private CartRepository cartRepo;

    //public LIst<Cart> listCartItems()
}
