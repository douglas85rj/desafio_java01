import java.util.Scanner;

public class contaTerminal {




    public static void main(String[] args) {        
        
        System.out.println("Digite o nome do titular da conta: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = sc.nextDouble();
        System.out.println("Digiteagencia da conta: ");
        int agencia = sc.nextInt();
        System.out.println("Digite o numero da conta: ");
        int numero = sc.nextInt();

        System.out.printf("Olá %s, obrigado por criar sua conta em nosso banco, sua agência é %d, seu número é %d e seu saldo inicial é de R$ %.5f, já disponível", nome, agencia, numero, saldo);


    }

}