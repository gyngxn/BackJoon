import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력 받을 개수
        int j = sc.nextInt();

        // 입력 받은 a와 b를 i번 반복
        for(int i = 1; i <= j; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
