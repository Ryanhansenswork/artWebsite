package com.art.app.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.art.app.rest.Repo.ProductsRepo;
import com.art.app.rest.Models.Products;
import java.util.List;
import com.art.app.rest.exceptions.ResourceNotFoundException;

@RestController
//@RequestMapping("/api/products")
public class ApiControllers 
{
    @Autowired
    private ProductsRepo productsRepo;

    @GetMapping(value = "/")
    public String getPage()
    {
        return "welcome";
    }
    @GetMapping("/products")
    public List<Products> getProducts(){
        return productsRepo.findAll();
    }
   /*  @GetMapping("/products")
public List<Products> getProducts() {
    List<Products> products = productsRepo.findAll();
    if (products.isEmpty()) {
        // Handle no products case (Optional)
        throw new ResourceNotFoundException("No products available.");
    }
    return products;
}*/

    
}
