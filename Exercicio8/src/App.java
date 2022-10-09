import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //quantas horas trabalha e quanto ganha
        Scanner S = new Scanner (System.in);
        
        System.out.println("Insira valor/hora");
        float valor_hora= S.nextFloat();
        System.out.println("Quantidade de horas trabalhadas por mês");
        float horas_mes = S.nextFloat();
        //Calcular e mostrar o salario do mês
        float salario_mes = valor_hora*horas_mes;

        System.out.println("O salário do mês é:"+ salario_mes);
    }
}
