package com.company.oop;

class Demo{
    int id;
    String name;

    Demo setId(int id){
        this.id = id;
        return this;
    }

    Demo setName(String name){
        this.name = name;
        return this;
    }

    public void display(){
        System.out.println(" id = "+ this.id + " name = " + this.name);
    }

}

public class MethodChaining {
    public static void main(String[] args) {

        new Demo().setName("Pruthviraj").setId(12).display();

    }
}
