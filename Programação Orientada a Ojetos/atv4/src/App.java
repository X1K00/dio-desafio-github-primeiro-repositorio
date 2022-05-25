import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Operando 1:");
        double operando1 = input.nextDouble();
        System.out.println("1 - soma, 2 - subtracão, 3 - multiplicação, 4 - divisão");
        int operacao = input.nextInt();
        System.out.println("Operando 2:");
        double operando2 = input.nextDouble();
        switch(operacao){
            case 1:
                calc.soma(operando1, operando2);
                break;
            case 2:
                calc.subtracao(operando1, operando2);
                break;
            case 3:
                calc.multiplicacao(operando1, operando2);
                break;
            case 4:
                calc.divisao(operando1, operando2);
                break;
            
        }
    }
}
