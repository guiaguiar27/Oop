package Exercise.Pract1; 

import java.util.Scanner;
import java.util.ArrayList;

public class exercicio_9_array {
    String Read;   
    int Max_values = 200;  
    int corr = 0; 
    int PreValue; 
    int[] FinalValues ;     
// basic operations
    int read(){  
        Scanner get = new Scanner(System.in);
        
        FinalValues = new int[Max_values]; 
        System.out.println("Entre com os números");
        
        Read = get.nextLine();
        while(!Read.equals("fim") && corr < Max_values){   
            if(Read.equals("fim") || corr >= Max_values) {
                return 1;      
            }   
            PreValue =  Integer.parseInt(Read);  
            FinalValues[corr] = PreValue;
            Read = get.nextLine();  
            corr++; 


        } 

        return 0 ; 
    }  
    
// sort  
void bubble(){  
    int auxValue; 
    int len = corr ;  

    for(int i = 0 ; i < len - 1  ; i++){ 
        for(int j = 0 ; j < len - i - 1; j++){ 
            if(FinalValues[j+1] < FinalValues[j]){ 
                auxValue = FinalValues[j]; 
                FinalValues[j] = FinalValues[j+1] ; 
                FinalValues[j+1]  = auxValue; 
            }
        } 
    }
    } 
    void show(){  
        bubble(); 
        System.out.print(" Numeros ordenados:");
        for(int i = 0 ; i < corr; i++){ 
            System.out.print(" "+ FinalValues[i]);
            
        } 
        System.out.println("");
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){ 
        exercicio_9_array nw = new exercicio_9_array(); 
        nw.read(); 
        nw.show();
    }
}
