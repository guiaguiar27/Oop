
import java.util.Random; 
import java.util.Scanner;  
public class exercicio_11 {
    int n, NumUser,  Attempt = 0 , flag = 0  ; 

    int rand(){   
        int max = 100 ; 
        int min = 1 ; 
        Random rd = new Random(); 
        int value = rd.nextInt((max - min) + 1) + min ; 
        return value ; 
    } 
    void read(){  
        
        Scanner get = new Scanner(System.in); 
        System.out.println("Entre com um numero"); 
        NumUser = get.nextInt();    
       
    } 
    void game(){ 
        n = rand();  
        read(); 
        while(flag == 0){
           
            if(flag == 1 ) break; 
            if(NumUser < n ){ 
                Attempt++;  
                System.out.println("---=====================---");
                System.out.println("O numero chave é maior que o seu numero"); 
                System.out.println("---===Tente Outra vez===---");
                read(); 
                flag = 0 ; 
            } 
            else if(NumUser > n){ 
                Attempt++ ;  
                System.out.println("---=====================---");
                System.out.println("O numero chave é menor que o seu numero");
                System.out.println("---===Tente Outra vez===---");
                read();  
                flag = 0 ; 
            } 
            else{  

                System.out.println("---=========!!!!!!!============---");
                System.out.println("Voce acertou o numero tentando " + Attempt + " vezes!!"); 
                System.out.println("---=========VITORIA============---"); 
                flag = 1 ; 

            }  
            
    }

    }
    public static void main(String[] args){ 
        exercicio_11 ex = new exercicio_11();
        ex.game();

    }
}
