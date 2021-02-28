package Exercise.Pract1; 
import java.util.Scanner;

public class exercicio_7 {
    int n, sum, num, mult;  
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
   
    void fill(){   
        Scanner get = new Scanner(System.in); 
        sum = 0 ;  
        mult = 1 ; 
        System.out.println("Digite os numeros");
        for(int i = 0 ; i < n ; i++){  
            
            values[i] = get.nextInt();
        } 
    }  
    int sum(){ 
        for(int i = 0 ; i < n ; i++){ 
            sum += values[i];
        } 
        return sum; 
    } 
    int multi(){ 
        for(int i = 0 ; i < n ; i++){ 
            mult = mult * values[i];
        } 
        return mult; 
    }
    
    void show(){  
        fill(); 
        System.out.println("Soma:" + sum()); 
        System.out.println("Multiplicacao :" + multi()); 
        
    } 
    public static void main(String[] args){ 
        exercicio_7 vl = new exercicio_7();  
        if(vl.read() == 1 ){ 
            vl.show();
        } 
    }
    

}
