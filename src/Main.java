import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть значення n (кількість туристів): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Введіть значення m (кількість місць в номері): ");
        int m = scanner.nextInt();
        System.out.println("Рекурентна формула для кількості поєднань без повторень");
        System.out.println("Результат: ");
        System.out.println(formula(n, m));
    }
    public static long Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static long formula(int n, int m){
        return Factorial(n)/(Factorial(m)*Factorial(n-m));
    }
}