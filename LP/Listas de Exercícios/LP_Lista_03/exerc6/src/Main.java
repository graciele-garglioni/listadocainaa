import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu número: ");
        num = in.nextDouble();

        if(num==5)
            System.out.println("Ligar para operadora");
        else if (num==6)
            System.out.println("retirar dinheiro");
        else if (num==7)
            System.out.println("saldo poupança");
        else if (num==8)
            System.out.println("Editar perfil");
        else if (num==9)
            System.out.println("finalizar");
        else
            System.out.println("Erro");
    }
}