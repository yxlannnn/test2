package com.yxl.object1;

public class Computer {
    private String brand;  // 品牌
    private double price;  // 价格
    private String color;  // 颜色

    
    public Computer() {
    // 可以在这里添加初始化代码
    }

    // 也可以添加带参数的构造方法
    public Computer(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    // getter 和 setter 方法
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
