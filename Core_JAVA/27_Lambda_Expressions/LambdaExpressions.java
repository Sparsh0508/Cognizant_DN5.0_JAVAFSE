import java.util.*;

public class LambdaExpressions {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        Collections.sort(list,(a,b)->a.compareTo(b));

        System.out.println("Sorted List:");
        list.forEach(System.out::println);
    }
}
