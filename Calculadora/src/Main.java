import  java.util.Scanner;

public class Main {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static  int multiplicar(int a, int b) {
        return a * b;
    }

    public static int divisao(int a, int b) {
        if (b != 0) {
         return a / b;   
        } else {
            System.out.println("ERRO: Divisao por zero!");
            return 0;
        }
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Escolha outro numero: ");
        int num2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Escolha uma opçao (+, -, *, /: ");
        String opcao = scanner.nextLine();

        int resultado = 0;

        switch (opcao) {

            case "+":
                resultado = somar(num1, num2);
                break;
            case "-":
                resultado = subtrair(num1, num2);
                break;
            case "*":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
                resultado = divisao(num1, num2);
                break;
            default:
                System.out.println("Opçao invalida!!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}











