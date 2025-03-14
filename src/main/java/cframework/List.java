package cframework;
import java.util.*;

public class List {
    public static void main(String[] args){
        System.out.println("Collection Framework");
        java.util.List<String> list = new ArrayList<>();
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        System.out.println(list.get(1));
//        List<String> remainingDays = new ArrayList<>();
//        remainingDays.add("Wednesday");
//        remainingDays.add("Thursday");
//        remainingDays.add("Friday");
//        list.addAll(remainingDays);
//        System.out.println(list.size());
//        System.out.println(list.get(5));
//        if(!list.contains("Sunday")){
//            list.add("Sunday");
//        }
//        System.out.println(list.get(0));
//        list.remove("Monday");
//        System.out.println(list.size());
//        list.remove(0);
//        list.remove(0);
//        System.out.println(list.get(0));
//        list.forEach((day)->{
//            System.out.printf("DAY: %s%n",day);
//        });
//        int size = 0;
//        while(size < list.size()){
//            System.out.printf("Days : %s%n",list.get(size));
//            size ++;
//        }
        Set<String> tset = new TreeSet<>();

        tset.add("SetOne");
        tset.add("SetTwo");
        tset.add("SetThree");
        tset.add("khokho");
//        set.add("SetOne");
//        set.forEach((num)->{
//            System.out.println(num);
//        });
        System.out.println(tset);



        String mainString = "SomeString";
        List main = new List();
        main.function1(mainString);
        main.function2(list);
        System.out.println(mainString);
    }
    public void function1(String value){
        value = "Some other string";
    }

    public void function2(java.util.List<String> list){
        list.add("Wednesday");
    }
}
