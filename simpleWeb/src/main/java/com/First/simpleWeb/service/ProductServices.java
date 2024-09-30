package com.First.simpleWeb.service;

import com.First.simpleWeb.model.Product;
import com.First.simpleWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductServices {
    @Autowired
    ProductRepo repo;

    //data
    //List<Product> products = new ArrayList<>(Arrays.asList(
    //new Product(101,"Iphone",50000),
    // new Product(102,"Canon Camera",70000)));
    //m1
    public List<Product> getProducts() {
        //return products;
        return repo.findAll();
    }

    //m2 to get the data with particular id
    public Product getProductById(Long productId) {
        return repo.findById(productId)
                //.orElse(new Product());
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    //m3 Add the products in the list
    public void addProduct(Product product) {

        repo.save(product);
//m4 Update the Products in the list
        //public void UpdateProduct (Product product){
           // repo.save(product);
        //}
//m5
//        public void deleteProduct ( Long productId)
//        {
//            repo.deleteById(productId);
//        }
    }

    public void UpdateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(Long productId) {
        repo.deleteById(productId);

    }
}