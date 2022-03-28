package com.company.oop;

class Table{
      synchronized void printTable(int n) throws InterruptedException {//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            Thread.sleep(400000);
            try{
                Thread.sleep(400000);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        try {
            t.printTable(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        try {
            t.printTable(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class synchronization {
    public static void main(String args[]) {
        Table obj = new Table();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.setName("Pruthvi ki thread");
        t1.start();
        t2.start();
        System.out.println("state = " + t1.getId() + " " + t1.getThreadGroup());
    }
}
