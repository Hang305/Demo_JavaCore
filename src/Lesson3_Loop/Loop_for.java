package Lesson3_Loop;

public class Loop_for {

    public static void main(String[] args) {

        int i =0;

        //while
        while (i<5){
            System.out.println(i++);
        }

        //do... while
        do{
            System.out.println(++i);
        }while(i<1);

        //for
        for( int a =1; a<20; a++){
            System.out.print(a +" ");
        }

        //array - foreach
        String[] library = {"book", "pencil", "pen"};
        for (String item : library ){
            System.out.print("\n" + item +" ");
        }

        //using break
        for (int x = 0; x < 10; x++) {
            if (x == 4) {
                break;
            }
            System.out.print(x + " ");
        }

        //using continue
        for (int b = 0; b < 10; b++) {
            if (b == 4) {
                continue;
            }
            System.out.print(b + " ");
        }
    }
}
