package Exercise.ex3; 
import java.util.Scanner; 

public class Salario {
    float ValorSalarioHora ; 
    float NumHorasTrabalhadas ;    
    float SalarioBruto; 
    float SalarioLiquido ;  
    
    float DescontoINSS ; 
    void preenche(){ 
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite o valor do salario por hora");   
        ValorSalarioHora = scan.nextFloat(); 
        System.out.println("Digite o numero de horas trabalhadas no mes");   
        NumHorasTrabalhadas = scan.nextFloat();
    }
    float  SalarioBruto(){ 
        /* 
        * 7,5% para quem ganha até R$ 1.045 (um salário mínimo)
        * 9% para quem ganha entre R$ 1.045,01 R$ e 2.089,60
        * 12% para quem ganha entre R$ 2.089,61 e R$ 3.134,40
        * 14% para quem ganha entre R$ 3.134,41 e R$ 6.101,06  
        */  
        SalarioBruto = NumHorasTrabalhadas * ValorSalarioHora;  
        if(SalarioBruto <= 1045.0) { 
            
        }
            
        return SalarioBruto;

    } 
    float SalarioLiquido(){ 
        /*  
        * de R$ 1.903,99 até R$ 2.826,65 = alíquota de 7,5% = desconto de R$ 142,80;
        * de R$ 2.826,66 até R$ 3.751,05 = alíquota de 15% = desconto de R$ 354,80;
        * de R$ 3.751,06 até R$ 4.664,68 = alíquota de 22,5% = desconto de R$ 636,13;
        * acima de R$ 4.664,68 = alíquota de 27,5% = desconto de R$ 869,36.
        */
    } 
    public static void main(String[] arsg){ 

    }
}   
