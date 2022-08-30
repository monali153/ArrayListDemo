public class GenericDemo<T,S> {

    private T rollNo;
    private S name;

    public T getRollNo() {
        return rollNo;
    }

    public void setRollNo(T rollNo) {
        this.rollNo = rollNo;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    public GenericDemo(T rollNo, S name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public GenericDemo(){

    }
}
