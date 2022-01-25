package Lesson4_Array;

public class Statement_Array {

    public static void main(String[] args) {

        String[] days = {"Mon", "Tue", "Web", "Thu","Fri","Sat","Sun"};

        System.out.println(days[0]);

        System.out.println(days.length);

        for(String item : days){
            System.out.print(item + " ");
        }
        //or
        System.out.print("\n");
        for(int i =0 ; i <days.length; i++){

            System.out.print(days[i]  + " ");
        }
        System.out.print("\n");

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        System.out.println("Total length of myNumber:" + myNumbers.length);

        for (int i = 0; i < myNumbers.length; ++i) {

            System.out.println("Total " + myNumbers[i].length);

            for(int j = 0; j < myNumbers[i].length; ++j) {

                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
