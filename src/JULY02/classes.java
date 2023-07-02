package JULY02;

public class classes {

    public class Student {
        int rollno;
        void print() {
            System.out.println("Roll Number = " + rollno);
        }
    };
    public static void main(String[] args) {
        Student obj1;
        obj1.rollno = 11;
        obj1.print();
    }
}
