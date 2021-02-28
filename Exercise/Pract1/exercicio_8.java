package Exercise.Pract1;
import java.util.Scanner;  

public class exercicio_8 {
    int n, bigg, small, QtEven , QtOdd, sum;   
 
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
        System.out.println("Digite os numeros");
        for(int i = 0 ; i < n ; i++){  
            values[i] = get.nextInt();  
            sum += values[i];
            if(values[i] %2 == 0) QtEven++;  
            else QtOdd++; 

        }  
    }  
    void bigger_smaller(){  
        bigg = values[0]; 
        small = values[0];
        for(int i = 0 ; i< n; i++){
            if(values[i] >= bigg) bigg = values[i]; 
            if(values[i] <= small) small = values[i]; 
        }
    }  
     
    void show(){  
        fill();  
        bigger_smaller(); 
        System.out.println("Maior numero: " + bigg + " Menor numero: " + small); 
        System.out.println("Media aritmetica "+ String.format("%2.02f", (float)sum/n)); 
        System.out.println("Quantidade de numeros pares: " + QtEven + " Quantidade de numeros impare: "+ QtOdd); 
        

        
    } 
    public static void main(String[] args){ 
        exercicio_8 vl = new exercicio_8();  
        if(vl.read() == 1 ){ 
            vl.show();
        } 
    }    
}
