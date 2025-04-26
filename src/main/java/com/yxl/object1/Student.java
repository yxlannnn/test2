package com.yxl.object1;

public class Student {
    private String name;       // 姓名
    private int age;           // 年龄
    private String gender;     // 性别
    private String schoolName; // 学校名
    private Computer computer; // 电脑
    
    // 无参构造方法
    public Student() {
    }
    
    // 带参构造方法
    public Student(String name, int age, String gender, String schoolName, Computer computer) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.schoolName = schoolName;
        this.computer = computer;
    }
    
    // getter 和 setter 方法
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    public Computer getComputer() {
        return computer;
    }
    
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    
    // 自我介绍方法
    public void introduce() {
        System.out.println("我的名字是" + name + "，我今年" + age + "岁，我的性别是" + gender +
                          "，我在" + schoolName + "上学，我有一台电脑，电脑的品牌是" + 
                          computer.getBrand() + "，电脑的价格是" + computer.getPrice() + 
                          "，电脑的颜色是" + computer.getColor());
    }
}