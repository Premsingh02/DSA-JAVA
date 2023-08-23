package August23;

public class Area {
    public static double calculateCircleArea(double r) {
        double area = r * r * Math.PI;
        return area;
    }

    public static void main(String[] args) {
        double r = 2.00000;
        System.out.println(calculateCircleArea(r));
    }
}
