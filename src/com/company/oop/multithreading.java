package com.company.oop;

class Animal{

}

public class multithreading {
    public static void main(String[] args) throws InterruptedException {

                  while(true) {
                      Thread t = new Thread();
                      Animal a = new Animal();
                      Thread t2 = new Thread();

                      t.setName("pruthvi");
                      t.start();
                      System.out.println("t1 = " + Thread.currentThread().getName());
                      t.join(30000);
                      t2.setName("pruthvi 2");
                      t2.start();
                      System.out.println("t2 = " + Thread.currentThread().getName());
                  }
    }
}
