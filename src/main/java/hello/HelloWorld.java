package hello; 

public class HelloWorld {
     public static void main(String[] args) {
           Greeter greeter = new Greeter();
             System.out.println(greeter.sayHello());
             Animal maincoon  = new Cat();
             Animal charles = new Human();
             System.out.println(" tutut: " + maincoon.sayHello());
             System.out.println(" toto: " + charles.sayHello());

      } 
} 