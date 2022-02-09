package Lesson10_Generic;

public class GenericsMethod {

    //    public static void printElement(Object[] objects) {
//
//        for(Object o: objects){
//            System.out.print(o + " ");
//        }
//        System.out.println();
//    }

    public static <T> void printElement(T[] t) {

        for(T o: t){
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Double[] myArrDouble = {1.2,1.3,1.4,1.5};
        String[] myArrString = {"one","two","three"};
        Integer[] myArrInteger = {1,2,3,4};

        printElement(myArrDouble);
        printElement(myArrString);
        printElement(myArrInteger);

    }
}
