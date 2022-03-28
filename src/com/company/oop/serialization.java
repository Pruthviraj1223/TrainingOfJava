package com.company.oop;

import java.io.*;

class Student implements java.io.Serializable{
    transient int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(" id = " + this.id + " name = " + this.name);
    }


}

public class serialization implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student(12,"Pruthvi");

        FileOutputStream fileOutputStream = new FileOutputStream("serial.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);


        objectOutputStream.writeObject(s1);
        objectOutputStream.flush();
        objectOutputStream.close();

        fileOutputStream.close();

        System.out.println("Object serialized");


        FileInputStream file = new FileInputStream("serial.txt");
        ObjectInputStream in = new ObjectInputStream(file);

        Student s2 = (Student) in.readObject();

        in.close();
        file.close();

        System.out.println("deserialized");

        s2.display();

    }
}
