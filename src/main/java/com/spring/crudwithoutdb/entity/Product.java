package com.spring.crudwithoutdb.entity;

public class Product {
    private int id;
    private String name;
    private int code;
    private String price;

    public Product() {

    }

    public Product(int id, String name, int code, String price) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price='" + price + '\'' +
                '}';
    }


}
