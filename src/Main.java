import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro número");
        double num1 = sc.nextDouble();
        System.out.println("digite o segundo número");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = sc.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;

            default:
                System.out.println("Operação inválida!");

        }

        sc.close();



        }









}



