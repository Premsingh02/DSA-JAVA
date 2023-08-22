package August22;

public class DaysInWeek {
    public static String daysOfWeek(int num) {
        if (num < 1 || num > 7) {
            return "Invalid Input";
        }
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[num - 1];
    }

    public static void main(String[] args) {
        int num = 1;
        String result = daysOfWeek(num);
        System.out.println(result);
    }
}
