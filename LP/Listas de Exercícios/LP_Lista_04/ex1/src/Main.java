import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu número: ");
        int num = in.nextInt();

        for(int i=0; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}