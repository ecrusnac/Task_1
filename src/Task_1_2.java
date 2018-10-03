import java.util.Scanner;

public class Task_1_2{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out. println("Enter first number: ");
        int m = sc.nextInt();
        System.out. println("Enter second number: ");
        int n = sc.nextInt();

        System.out. println("The sum of the integers is =  " + (m + n));
        System.out. println("The difference of the integers is =  " + (m - n));
        System.out. println("The product of the integers is =  " + (m * n));
        System.out. println("The average of the integers is =  " + ((m + n) / 2));
        System.out. println("The distance of the integers is =  " + Math.abs(m - n));
        if (m < n){
            System.out.println("Max integer is: " + n);
            System.out.println("Min integer is: " + m);
        }
        else{
            System.out.println("Max integer is: " + m);
            System.out.println("Min integer is: " + n);
        }
    }
}
