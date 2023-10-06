package com.spring.crudwithoutdb.controller;

import com.spring.crudwithoutdb.entity.Product;
import com.spring.crudwithoutdb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/product")
    public List<Product> getProductList(){
        return productService.getProductList();
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProductList(product);
    }
    @GetMapping("/product/{id}")
    public Product getById(@PathVariable("id") int id){
        return productService.getById(id);
    }
    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable("id") int id,@RequestBody Product product){
        return productService.updateProduct(id,product);

    }
    @DeleteMapping("/product/{id}")
    public String deleteProductById(@PathVariable int id){
        productService.deleteProductById(id);
        return "Id Has Been Removed";
    }
}
