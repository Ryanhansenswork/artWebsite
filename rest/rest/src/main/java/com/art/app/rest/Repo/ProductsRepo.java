package com.art.app.rest.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.art.app.rest.Models.Products;

public interface ProductsRepo extends JpaRepository<Products, Integer> {
   // List<Products> findByProductName(String productName);
}

/*public interface ProductsRepo extends JpaRepository<productName, String>{

}*/
