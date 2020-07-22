import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrar primeiro num");
        Double Num1 = sc.nextDouble();
        System.out.println("Entrar segundo num");
        Double Num2 = sc.nextDouble();


        System.out.println("MENU : \n 1- Soma \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - divisao");
        int opcao = sc.nextInt();
        switch (opcao)
        {
            case 1:
                System.out.println("Soma "+(Num1+Num2));
                break;
            case 2:
                System.out.println("Subtracao "+(Num1-Num2));
                break;
            case 3:
                System.out.println("Multiplicacao "+(Num1*Num2));
                break;
            case 4:
                System.out.println("Divisao "+(Num1/Num2));
                break;
            default:
                System.out.println("Opcao invalida");
                break;

        }
    }
}
