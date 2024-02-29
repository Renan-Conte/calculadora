import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       double num1, num2;
       char operador;

       System.out.println("Digite o primeiro número:");
       num1 = scanner.nextDouble();

       System.out.println("Digite o segundo numero:");
       num2 = scanner.nextDouble();

       System.out.println("Digite o operador (+, -, *, /):");
       operador = scanner.next().charAt(0);

       double resultado;
       switch (operador) {
        case '+':
            resultado = num1 + num2;
            System.out.println("Resultado:" + resultado);
            break;

            case'-':
            resultado = num1 - num2;
            System.out.println("Resultado:" + resultado);
            break;

            case '*':
            resultado = num1 *num2;
            System.out.println("REsultado:" + resultado);
            break;

            case '/':
          if (num2!=0) {
            resultado = num1/num2;
            System.out.println("Resultado:" + resultado);
          } 
          else{
            System.out.println("Erro: Divisão por zero!");
          }
       
        default: System.out.println("Operador inválido!");
            break;
       }
       scanner.close();
    }
}
