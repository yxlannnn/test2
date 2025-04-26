package com.yxl.object1;

public class Test1 {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer computer = new Computer();
        computer.setBrand("联想");
        computer.setPrice(10000);
        computer.setColor("黑色");
        
        // 创建学生对象
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        student.setGender("男");
        student.setSchoolName("清华大学");
        student.setComputer(computer);
        
        // 调用自我介绍方法
        student.introduce();
    }
}
