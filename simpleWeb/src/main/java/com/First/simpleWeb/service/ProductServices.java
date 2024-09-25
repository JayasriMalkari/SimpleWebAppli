package com.First.simpleWeb.service;

import com.First.simpleWeb.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductServices {
    //data
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon Camera",70000)));
    //m1
    public List<Product> getProducts(){
        return products;
            }
//m2 to get the data with particular id
    public Product getProductById(int productId) {
                return products.stream()
                        .filter(p ->p.getProductId()==productId)
                        //.findFirst().get()
                        .findFirst().orElse(new Product(100,"No Item",0));


    }
 //m3 Add the products in the list
 public void addProduct(Product product) {
        products.add(product);
 }
//m4 Update the Products in the list
    public void UpdateProduct(Product product) {
        int index = 0;
        for (int i=0;i<products.size();i++)
            if (products.get(i).getProductId()==product.getProductId())
                index=i;

        products.set(index, product);


    }

    public void deleteProduct(int productId) {
        int index = 0;
        for (int i=0;i<products.size();i++)
            if (products.get(i).getProductId()== productId)
                index=i;

        products.remove(index);
    }
}
