import java.util.Scanner;
public class Task_1_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        if (n >= 0 && n <=1000){
            if (n < 10) {
                System.out. println("The sum of all digits is " + sum);
            }
            else{
                while (n != 0)
                {
                    sum = sum + n % 10;
                    n = n / 10;
                }
                System.out.println("The sum of all digits is " + sum);
            }
        }else System.out.println("Introduced number is less than '0' or greater than '1000'!!!");
    }
}
