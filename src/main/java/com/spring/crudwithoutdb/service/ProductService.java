package com.spring.crudwithoutdb.service;

import com.spring.crudwithoutdb.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> list = new ArrayList();
    public List<Product> getProductList(){
        return list;
    }
    public Product addProductList(Product product){
        list.add(product);
        return product;
    }
    public Product getById(int id){
        for (Product p : list){
            if(p.getId()==id){
                return p;
            }
        }

        return null;
    }
    public Product updateProduct(int id,Product product){
        for (Product product1 : list){
            if (product1.getId()==id){
                product1.setId(product.getId());
                product1.setName(product.getName());
                product1.setCode(product.getCode());
                product1.setPrice(product.getPrice());


               return product1;
            }
        }
        return product;
    }
    public void deleteProductById(int id){
     list.removeIf(l -> l.getId()==id);


    }

}
