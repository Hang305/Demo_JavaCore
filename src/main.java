import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        float point;
        do {
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter the average of point: ");
            point = ip.nextFloat();

        } while (point < 0 || point > 10);

        if (point >= 9.5f) {
            System.out.println("Excellent!");
        } else if (point >= 8.6f)
            System.out.println("Very Good");
        else if (point >= 6.7f) {
            System.out.println("Good");
        } else if (point >= 5f) {
            System.out.println("Medium");
        } else
            System.out.println("Weak");

//        if (x > 9.5)
//            System.out.println("Loai Xuat Sac");
//        else if (x >= 8.6)
//            System.out.println("Loai Gioi");
//        else if (x >= 6.7)
//            System.out.println("Loai Kha");
//        else if (x >= 5.0)
//            System.out.println("Loai Trung binh");
//        else
//            System.out.println("Loai Yeu");
    }
}

