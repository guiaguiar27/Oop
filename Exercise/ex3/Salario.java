package Exercise.ex3; 
import java.util.Scanner; 

public class Salario {
    float ValorSalarioHora ; 
    float NumHorasTrabalhadas ;   
    
    float DescontoINSS ; 
    void preenche(){ 
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite o valor do salario por hora");   
        ValorSalarioHora = scan.nextFloat(); 
        System.out.println("Digite o numero de horas trabalhadas no mes");   
        NumHorasTrabalhadas = scan.nextFloat();
    }
    float  SalarioBruto(){ 

    } 
    float SalarioLiquido(){ 

    } 
    public static void main(String[] arsg){ 

    }
}   
