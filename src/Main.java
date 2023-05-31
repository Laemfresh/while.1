import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <=num; i++) {
            sum = sum +i;
        }
            System.out.println(sum);

    }
}

     /*       int sum = 0;
            for (int i = 0; i < a.length; i++) {
        sum = sum + a[i];
        }
     if (i==1) return 1;
             return i * factorial(i-1);*/



   /*  Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt(); //10
    int b = scanner.nextInt(); //20

        if (a == b) {
                System.out.println("Нечетных чисел между ними нет");
                } else {
                int currentNum = (a % 2 == 0) ? a + 1 : a;
                while (currentNum < b) {
        System.out.println(currentNum);
        currentNum +=2;
        */
