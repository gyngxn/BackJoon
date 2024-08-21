import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = 1;

        while(j < 10) {
            System.out.println(i + " * " + j + " = " + (i*j));
            j++;
        }
    }
}