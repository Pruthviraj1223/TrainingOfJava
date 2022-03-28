package com.company.oop;

import java.time.LocalDate;
import java.util.HashMap;

class Employee{
    int id;
    String name;
    Employee(int  id,String  name){
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

public class multilevel
{
    public static void main(String[] args)
    {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee(1, "Alex"));
        employeeMap.put(2, new Employee(2, "Bob"));

        //Shallow clone
        HashMap<Integer, Employee> clonedMap = (HashMap<Integer, Employee>) employeeMap.clone();

        //Same as employeeMap
        System.out.println(clonedMap.get(1).getName());

        System.out.println("\nChanges reflect in both maps \n");

        //Change a value is clonedMap
        clonedMap.get(1).setName("Charles");

        //Verify content of both maps
        System.out.println(employeeMap.get(1).getName());
        System.out.println(clonedMap.get(1).getName());
    }
}