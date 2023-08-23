package August23;

public class CalVolumeOfCylinder {
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    public static void main(String[] args) {
        double radius = 2, height = 5;
        System.out.println(calculateCylinderVolume(radius,height));
    }
}
