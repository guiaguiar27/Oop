package Exercise.Pract1;
import java.util.Scanner; 

public class exercicio_4 {
    String Month;  
    void read(){ 
        Scanner get = new Scanner(System.in);
        System.out.println("Entre com o mes com letra Maiuscula "); 
        Month = get.nextLine(); 
    } 
    void compare(){ 
        if(Month.equals("Janeiro")){ 
            System.out.println("1 - tem 31 dias");
        }  
        else if(Month.equals("Fevereiro")){ 
            System.out.println("2 - tem 28 dias (29 dias nos anos bissextos)");
        }
        else if(Month.equals("Marco")){ 
            System.out.println("3 - tem 31 dias");
        }    
        else if(Month.equals("Abril")){ 
            System.out.println("4 - tem 30 dias");
        }  
        else if(Month.equals("Maio")){ 
            System.out.println("5 - tem 31 dias");
        }  
        else if(Month.equals("Junho")){ 
            System.out.println("6 - tem 30 dias");
        }  
        else if(Month.equals("Julho")){ 
            System.out.println("7 - tem 31 dias ");
        }  
        else if(Month.equals( "Agosto")){ 
            System.out.println("8 - tem 31 dias ");
        }  
        else if(Month.equals("Setembro")){ 
            System.out.println("9 - tem 30 dias");
        }   
        else if(Month.equals("Outubro")){ 
            System.out.println("10 - tem 31 dias");
        }  
        else if(Month.equals("Novembro")){ 
            System.out.println("11 - tem 30 dias");
        } 
        else if(Month.equals("Dezembro")){ 
            System.out.println("12 - tem 31 dias");
        }    
    
} 
public static void main(String[] args ){ 
    exercicio_4 month = new exercicio_4(); 
    month.read(); 
    month.compare();
}
}
