package com.art.app.rest.Controller;

import com.art.app.rest.Repo.CartRepository;
import com.art.app.rest.Models.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    
    @GetMapping
    public String showCartPage() {

        return "cart"; 
    }
  
 

    /*
    @RestController
    @RequestMapping("/api/cart")
    public static class CartRestController {
        @Autowired
        private CartRepository cartRepository;

        @GetMapping
        public List<Cart> getAllCartItems() {
            return cartRepository.findAll();
        }

        @PostMapping
        public Cart addCartItem(@RequestBody Cart cart) {
            return cartRepository.save(cart);
        }

        @DeleteMapping("/{id}")
        public void removeCartItem(@PathVariable int id) {
            cartRepository.deleteById(id);
        }
    }*/
}








