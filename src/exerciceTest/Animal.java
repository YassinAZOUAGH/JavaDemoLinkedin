package exerciceTest;
abstract class Animal {
 protected String name;
 Animal(String name){
     System.out.println("animal");
     this.name = name;
 }

}
class Dog extends Animal{
    Dog(String name){
       super(name);
    }

    String getName(){
        return name;
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog = new Dog("dog1");

        System.out.println(dog);
    }
}


