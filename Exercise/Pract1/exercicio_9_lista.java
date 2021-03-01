package Exercise.Pract1;
import java.util.Scanner;
import java.util.ArrayList; 

public class exercicio_9_lista {
    String Read;  
    ArrayList<Integer> values = new ArrayList<Integer>(); 
    int PreValue; 
    int[] FinalValues ;     
// basic operations
    int read(){  
        Scanner get = new Scanner(System.in);
        System.out.println("Entre com os números");
        Read = get.nextLine();
        while(!Read.equals("fim")){   
            if(Read.equals("fim")) {
                return 1;      
            }   
            PreValue =  Integer.parseInt(Read);  
            values.add(PreValue);
            Read = get.nextLine(); 


        } 
        FinalValues = new int[values.size()]; 

        return 0 ; 
    }  
    
// sort  
void bubble(){  
    int auxValue; 
    int len = values.size() ; 
    for(int i = 0 ; i < values.size(); i++){ 
        FinalValues[i] = values.get(i); 
        }  

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
        for(int i = 0 ; i < values.size(); i++){ 
            System.out.print(" "+ FinalValues[i]);
            
        } 
        System.out.println("");
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){ 
        exercicio_9_lista nw = new exercicio_9_lista(); 
        nw.read(); 
        nw.show();
    }
}
