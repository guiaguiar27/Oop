package Exercise.ex2; 
import java.util.Scanner;

public class art {
    
    void imagem1(){  
        int Dim = 5 ;  
        for(int i = 0 ; i < Dim ; i++){ 
            for(int j = 0 ; j < Dim; j++){  
                if((i%2) == 0)
                    System.out.print("* ");
                else 
                    System.out.print(" ");
            } 
            System.out.println(" ");
        }
    } 
    void imagem2(){ 
        int Dim = 5 ;   
        int count = 1 ; 
        for(int i = 0 ; i < Dim ; i++){  
                if((i%2) == 0){  
                    for(int j = 0 ; j < count; j++ ){ 
                        if(count == 1 )  System.out.print("   * ");
                        else System.out.print(" * ");
                    } 
                    count++ ; 
                } 
                else 
                    System.out.print(" ");
            System.out.println(" ");
        }
    } 
    void imagem3(){ 
        int Dim = 5 ;  
        for(int i = 0 ; i < Dim ; i++){ 
            for(int j = 0 ; j < Dim; j++){  
        
                if(i == 2 & ( j == 1 | j == Dim) ){ 
                    System.out.print("*");  
                }
                if(i == 0 | i == (Dim - 1)){ 
                    System.out.print("* "); 
                }  
                else  
                    System.out.print(" ");
            } 
            System.out.println(" ");
        }
    }
    public static void main(String[] args){ 
        art Art = new art();  
        Scanner Scan = new Scanner(System.in);
        System.out.println("Digite qual imagem deseja ver:"); 
        System.out.println("1- Imagem 1"); 
        System.out.println("2- Imagem 2"); 
        System.out.println("3- Imagem 3"); 
        int answer = Scan.nextInt(); 

        if(answer == 1 )
            Art.imagem1();
        else if(answer == 2 ) 
            Art.imagem2();
        else 
            Art.imagem3();
    }
}
