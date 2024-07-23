import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Hours: ");
        int hours=sc.nextInt();
        HoursToMinute(hours);
    }
    public static void HoursToMinute(int hours)
    {
        int minutes=hours*60;
        System.out.println(hours+" Hours in minutes is " + minutes);
    }
}
