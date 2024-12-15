package com.art.app.rest.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import com.art.app.rest.Models.Orders;
import com.art.app.rest.Models.OrdersService;
import com.art.app.rest.Models.MyAppUser;
import com.art.app.rest.Models.MyAppUserService;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/checkout")
    public String showCheckoutPage() {
    return "checkout";
    }

   /*  @Autowired
    OrdersService ordersService;

    @GetMapping("/checkout")
    public String showCheckoutPage() {
    return "checkout";
}
    @PostMapping("/store")
    public Orders saveOrder(@RequestBody Orders orders){
        return ordersService.create(orders);
    }*/
     /*@PostMapping("/login")
    public String loginSuccess() {
        return "redirect:/admin";
    }*/
     /*  @Autowired
    private MyAppUserService userService;
    @PostMapping("/login")
public String login(String username, String password) {
    Optional<MyAppUser> user = userService.findByUsername(username);

    if (user.isPresent() && user.get().getPassword().equals(password)) {
        return "redirect:/admin"; // Successful login
    }
    return "redirect:/login?error"; // Login failed
}*/
@Autowired
    private MyAppUserService userService;
@PostMapping("/login")
public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
    if (username == null || password == null) {
        return "redirect:/login?error=missing_credentials"; // Handle empty input case
    }

    Optional<MyAppUser> user = userService.findByUsername(username);

    if (user.isPresent() && user.get().getPassword().equals(password)) {
        return "redirect:/admin"; // Successful login
    }
    return "redirect:/login?error=invalid_credentials"; // Login failed
}


    
}