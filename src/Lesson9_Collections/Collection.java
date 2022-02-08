package Lesson9_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Collection {

//    addAll, BinarySearch, Copy, Reverse, Shuffle, Sort, ReplaceAll

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        List<String> ls = new ArrayList<>();
        ls.add("Hello");

        //addAll: them mot hoac nhieu phan tu vao tap hop
        Collections.addAll(list, 30, 40, 10);
        System.out.println(list.toString());


        Collections.addAll(ls, "Thanh", "Hang");
        System.out.println(ls);

        //sort(): sap xep cac phan tu cua tap hop ASC
        Collections.sort(list);
        System.out.println(list.toString());

        Collections.sort(ls);
        System.out.println(ls);

        //BinarySearch(): tim kiem nhi phan
        // Pre-condition when using binary search MUST SORT for all elements
        // Index of start is 0
        // datatypes of index is integer can't convert to String()
        int index = Collections.binarySearch(list, 30);

        System.out.println(Collections.binarySearch(list, 10));


        //reverse(): dao nguoc cac phan tu trong tap hop
        Collections.reverse(list);
        System.out.println(list.toString());

        Collections.reverse(ls);
        System.out.println(ls);

        //Copy()
//        List<String> copyList = new ArrayList<>();
//
//        Collections.copy(copyList,ls);
//        System.out.println(copyList.toString());

        //Shuffle(): xao tron cac phan tu trong list
        Collections.shuffle(list);
        System.out.println(list);


        //ReplaceAll(): thay the 1 phan tu cu thanh 1 phan tu moi
        Collections.replaceAll(list, 30, 2);
        System.out.println(list.toString());

    }

}
