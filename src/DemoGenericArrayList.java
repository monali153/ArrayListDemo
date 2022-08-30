import java.util.ArrayList;
import java.util.List;

public class DemoGenericArrayList {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();


        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);

        nameList.add("Monali");
        nameList.add("Vaibhav");
        nameList.add("Abhinav");
        nameList.add("Nikhil");
        nameList.add("Suraj");

        //processing first list
        int sum = 0;
        for (Integer element: integerList)
        {
            sum = sum + element;
        }
        System.out.println("sum = " + sum);

        //processing second list
        for (String element:nameList) {
            System.out.println("element.toUpperCase() = " + element.toUpperCase());
        }
    }
}
