package Lesson6_OOP;

public class Astraction {

    public static void main(String[] args) {

        Vegetable banana = new Banana();
        banana.color();
        banana.unitOfVegetable();

        Vegetable mango = new Mango();
        mango.color();
        mango.unitOfVegetable();

    }
}
 abstract class Vegetable {
    public abstract void color();
    public void unitOfVegetable(){
        System.out.println("The color of vegetable");
    }
}
class Banana extends Vegetable{
    public void color(){
        System.out.println("The color of banana is yellow");
    }
}
class Mango extends Vegetable{
    public void color(){
        System.out.println("The color of strawberry is red");
    }
}