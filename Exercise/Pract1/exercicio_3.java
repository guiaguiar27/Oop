package Exercise.Pract1;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class exercicio_3 {
    
    float max_val = 0.3f ;  
    float request, GrossSalary , NetSalary ; 
    float discountFees;   
    int qtFees; 
    
    void read(){  

        Scanner get = new Scanner(System.in);
        System.out.println("Entre com o salario bruto");  
        GrossSalary = get.nextFloat(); 
        System.out.println("Entre com o numero total de taxas ");
        qtFees = get.nextInt(); 
        for(int i = 0 ; i < qtFees ; i++){ 
            System.out.println("Entre com a taxa " + i); 
            discountFees += get.nextFloat();  
        }  
        System.out.println("Entre com o valor do emprestimo solicitado"); 
        request = get.nextFloat(); 

    }    
    float GrossToNet(){ 
        float aux = discountFees/100; 
        aux = GrossSalary*aux; 
        return  GrossSalary - aux ; 
    }
    void process(){ 
        NetSalary = GrossToNet();    
        System.out.println("Salario liquido: "+ NetSalary); 
        float max = max_val*NetSalary;  
        System.out.println("Maximo valor permitido:" + max);
        if(request > max){ 
            System.out.println("Pedido negado. O seu pedido ultrapassa o limite estipulado de acordo com seus rendimentos"); 
            
        } 
        else { 
            System.out.println("Parabens, emprestimo realizado com sucesso");
        }

    } 
    public static void main(String[] args){ 
        exercicio_3 cliente = new exercicio_3(); 
        cliente.read(); 
        cliente.process();
    }


}
