package Lesson14_TopicAdvanded.String_StringBuffer_StringBuilder;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
//        String a ="10";
        System.gc();
        long start = new GregorianCalendar().getTimeInMillis();
        long startMemory = Runtime.getRuntime().freeMemory();

//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<100000000; i++){
            sb.append(":").append(i);
        }

        long end = new GregorianCalendar().getTimeInMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Time taken: "+ (end-start));
        System.out.println("Memory used: "+ (startMemory-endMemory));
    }
}
