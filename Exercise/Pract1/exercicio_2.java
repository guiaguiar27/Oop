package Exercise.Pract1;
import java.util.Scanner;


public class exercicio_2 {
    String RacionalNumber ;   
    float num, denom ; 
    float RealNumber;  
    void read(){ 
        Scanner get = new Scanner(System.in); 
        System.out.println("Digite o numero racional no seguinte modelo"); 
        System.out.println("Numerador/denominador -> 1/2 "); 
        RacionalNumber = get.nextLine();  
        String[] parts = RacionalNumber.split("/"); 
        num = Float.parseFloat(parts[0]); 
        denom = Float.parseFloat(parts[1]); 

    }  
    float RacionalToReal(){ 
        RealNumber = num/ denom;   
        return RealNumber; 
    }
    void verify(){ 
        if(denom == 0){ 
            System.out.println("Denomnador 0 - não será convertido");  
        } 
        else {  
            System.out.println(RacionalToReal());
        }
    } 
    public static void main(String[] args){ 
        exercicio_2 num = new exercicio_2(); 
        num.read(); 
        num.verify();
    
    }
}
