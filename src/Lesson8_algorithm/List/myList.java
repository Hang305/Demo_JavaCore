package Lesson8_algorithm.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class myList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();

        //add
        //addAll(): thêm các phần tử từ collection có sẵn
        students.add("Name");
        System.out.println(students);

        for (int i =1; i <=10; i++){

            students.add("Name"+i);

            //get: lấy giá trị phần tử theo index
            System.out.print(students.get(i) + " ");
        }

        //set(): cập nhật lại giá trị của phần tử
        students.set(0,"Conan");
        System.out.println(students.get(0));

        System.out.println(students.get(5));

        //remove(): xóa phần tử khỏi danh sách
        students.remove(5);

//        for (int i =11; i <=20; i++){
//
//            students.add("Name"+i);
//
//            System.out.print(students.get(i) + " ");
//        }

        System.out.print("\n");
        //size(): tổng số phần tử của tập hợp
        System.out.println("Size of array list is " + students.size());

        //indexOf(): trả về index của phần tử cần tìm
        System.out.println("Index of array list is " + students.indexOf("Name4"));

        //lastIndexOf(): trả về index cuối cùng của phần tử cần tìm
        System.out.println("Last index of array list is " + students.lastIndexOf("Name8"));

        //contains(): kiểm tra xem phần tử cần tìm có trong tập hợp hay không
        //return boolean
        System.out.println("Contains of array list is " + students.contains("Conan"));


        //sublist(): tạo tập hợp mới từ tập hợp cho trước
        List<String> newList = students.subList(2,7);
        System.out.println("New list: ");
        for (String item : newList){
            System.out.print(item + " ");
        }

        //toArray(): chuyển tập hợp ArrayList thành tập hợp Array
        students.toArray();
        System.out.println("Convert ArrayList to Array: ");
        for (String item : students){
            System.out.print(item + " ");
        }
        //asList(): chuyển Array thành ArrayList
        String[] ars = {"Thanh","Hang"};

        List<Integer> iter= new ArrayList<>();


        //clear(): xóa toàn bộ phần tử trong tập hợp
    }
}
