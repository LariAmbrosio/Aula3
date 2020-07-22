import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Colocar o litro ");
        Double l = sc.nextDouble();

        System.out.println("MENU : \n 1- Alcool  \n 2 - Gasolina ");
        Double a = 2.90;
        Double g = 3.30;


        int opcao = sc.nextInt();




        switch (opcao)
        {
            case 1:


                if(l<20) {
                System.out.println("O valor do alcool e:"+((a-(a*3)/100))*l);
            }else{
                System.out.println("o Valor do alcool e: "+((a-(a*5)/100))*l);
            }
                break;
            case 2:


                if(l<20) {
                System.out.println("Valor Gasolina e"+((g-(g*4)/100))*l);

            }else{
                System.out.println("o Valor Gasolina e: "+(g-(g*6)/100)*l);
            }
                break;
            default:
                System.out.println("Opcao invalida");
                break;
    }

}}
