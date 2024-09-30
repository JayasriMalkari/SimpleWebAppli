package com.First.simpleWeb.controller;

import com.First.simpleWeb.model.Product;
import com.First.simpleWeb.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductServices service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("products/{productId}")
    public Product getProductByID(@PathVariable long productId) {
        return service.getProductById(productId);

    }
   @PostMapping("/products")
  public void  AddProduct(@RequestBody Product product){
        service.addProduct(product);
  }
  @PutMapping("/products")
  public void UpdateProduct(@RequestBody Product product){
        service.UpdateProduct(product);
  }
  @DeleteMapping("/products/{productId}")
  public void deleteProduct(@PathVariable Long productId){
        service.deleteProduct(productId);


  }


}
