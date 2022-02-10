package Lesson14_TopicAdvanded.Enum;

public class Main {

    enum level {HIGH, LOW, MEDIUM}

    public static void main(String[] args) {

        level myLevel = level.HIGH;

        switch(myLevel){
            case LOW:
                System.out.println("Low Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
            default:
                System.out.println("Medium level");
        }

        for(level item: level.values()){
            System.out.print(item +", " );
        }
        System.out.println();
    }
}
