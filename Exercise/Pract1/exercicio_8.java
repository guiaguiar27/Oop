package Exercise.Pract1;
import java.util.Scanner;  

public class exercicio_8 {
    int n, bigg, small, QtEven , QtOdd;  
    float Average;   

    int[] values; 
    int read(){ 
        Scanner get = new Scanner(System.in);
        System.out.println("Entre com N"); 
        n = get.nextInt();    
        if(n <= 0 || n >= 100){ 
            System.out.println("Numero invalido"); 
            return 0 ; 
         }
        values = new int[n]; 
        return 1 ;  
    }   
}
