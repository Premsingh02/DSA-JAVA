package August23;

public class FahrenheittoCelcius {
    public static double convertFahrenheitToCelsius(double tempF) {
        return (tempF - 32) * (5d/9d);
    }
    public static void main(String[] args) {
        double tempF = 32;
        System.out.println(convertFahrenheitToCelsius(tempF));
    }
}
