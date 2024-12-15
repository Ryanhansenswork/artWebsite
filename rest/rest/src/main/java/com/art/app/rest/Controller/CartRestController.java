/*package com.art.app.rest.Controller;

import com.art.app.rest.Repo.CartRepository;
import com.art.app.rest.Models.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartRestController {

    @Autowired
    private CartRepository cartRepository;
   /*  @Autowired
    private CartService cartService;

    // Get all cart items
    @GetMapping
    public List<Cart> getAllCartItems() {
        return cartRepository.findAll();
    }

    // Add a new cart item
    @PostMapping
    public Cart addCartItem(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }

    // Remove an item by ID
    @DeleteMapping("/{id}")
    public void removeCartItem(@PathVariable int id) {
        cartRepository.deleteById(id);
    }
    /*  @PostMapping
    public ResponseEntity<String> addToCart(@RequestBody Cart cart) {
        cartService.addProductToCart(cart);
        return ResponseEntity.ok("Product added to cart");
    }

    @GetMapping
    public List<Cart> getCartItems() {
        return cartService.getCartItems();
    }
}
*/