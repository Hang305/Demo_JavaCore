package Lesson2_If;

public class Condition_if {

    public static void main(String[] args) {

        int time =6;

        if (time <12 && time>0){
            System.out.println("Hello good morning");
        }
        else if(time >12 && time<=24 ){
            System.out.println("Hello good evening");
        }else{
            System.out.println("Please enter input valid time");
        }

        //Short
        System.out.println(time<12 ? "Hello Good morning":"Hello good evening");
    }
}
