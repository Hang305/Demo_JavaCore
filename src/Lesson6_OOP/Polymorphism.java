package Lesson6_OOP;

public class Polymorphism {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal duck = new Duck();
        animal.legsOfAnimal();
        dog.legsOfAnimal();
        duck.legsOfAnimal();

    }
}
class Animal {
    public void legsOfAnimal(){
        System.out.println("The legs of animal");
    }

}
class Dog extends Animal{
    public void legsOfAnimal(){
        System.out.println("The legs of animal are : 4");
    }
}
class Duck extends Animal{
    public void legsOfAnimal(){
        System.out.println("The legs of animal are : 2");
    }
}
