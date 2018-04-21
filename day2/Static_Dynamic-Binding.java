//Staic
/*
class Animal{}

class Dog extends Animal{
 public static void main(String args[]){
  Dog d1=new Dog();
 }
}
*/

//Dynamic
class Animal{  
 void eat(){System.out.println("animal dang an...");}  
}  

class Dog extends Animal{  
 void eat(){System.out.println("dog dang an...");}  

 public static void main(String args[]){  
  Animal a=new Dog();  
  a.eat();  
 }  
}  
