package com.revature.lambaexpress;

public class DefaultMethods implements Sayable{
    public void sayMore(String msg){     // implementing abstract method
        System.out.println(msg);
    }
   @Override
  public void say(){
        Sayable.super.say();
      System.out.println("Overriding default method");
    }
    public static void main(String[] args) {
        DefaultMethods dm = new DefaultMethods();
        dm.say();                       // calling default method
        dm.sayMore("Calling the Abstract Method");      // calling abstract method
        Sayable.sayLouder("Calling Static method ...");   // calling static method
    }
}
