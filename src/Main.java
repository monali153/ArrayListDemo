public class Main {

    public static void main(String[] args) {

        GenericDemo<Integer, String> s1 = new GenericDemo<>();

        GenericDemo<Integer, String>  s2 = new GenericDemo<>(12,"Vaibhav");

        GenericDemo<String, String> s3 = new GenericDemo<>();

        Integer rollNo = s2.getRollNo();
        String rollNo1 = s3.getRollNo();

    }
}
