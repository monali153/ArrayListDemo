import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {

        //create a ArrayList
        List arrayList = new ArrayList();//creating a list to store Object, raw type
        System.out.println("arrayList.size() = " + arrayList.size());
        arrayList.add("Monali");
        arrayList.add("Ramesh");
        arrayList.add("Suresh");
        arrayList.add("Ravi");
        System.out.println("arrayList.size() = " + arrayList.size());
        arrayList.add("Suresh");
        System.out.println("arrayList.indexOf(\"Ravi\") = " + arrayList.indexOf("Ravi"));
        System.out.println("arrayList.get(1) = " + arrayList.get(1));
        System.out.println("arrayList.contains(\"Abhishek\") = " + arrayList.contains("Abhishek"));
        arrayList.add(12);
        System.out.println("arrayList = " + arrayList);
        Student student = new Student();
        student.setRollNo(15);
        student.setName("Amar");
        arrayList.add(student);
        // System.out.println("arrayList = " + arrayList);
        System.out.println("arrayList.indexOf(12) = " + arrayList.indexOf(12));
        System.out.println("student = " + student);

        //for each loop
        //enhanced for loop
        // for(type variable : array or collection){
        //   statements
        // }
        Integer[] arr = {10, 20, 30};
        Student[] students = new Student[5];
        for (Integer elementOfArray : arr) {
            System.out.println(elementOfArray);
        }

        for (Student elementOfStudentArray : students)
        {
            System.out.println(elementOfStudentArray);
        }

        for (Object ele : arrayList)
        {
            System.out.println(ele);
        }

        // not applicable on string values, we use fori loop
        /*String s = "Vaibhav";
        for (char c: s) {

        }*/
    }
}
