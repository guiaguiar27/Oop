package Exercise.Pract1;
import java.util.Scanner;
public class exercicio_14 {
    int dim; 
     void read(){ 
         Scanner get = new Scanner(System.in); 
         System.out.println("Digite a dimensao"); 
         dim = get.nextInt();
     } 
     void draw(){ 
         for(int i = 0 ; i < dim; i++){ 
             for(int j = 0 ; j < i; j++){ 
                 System.out.print("*");
             }  
             System.out.println("");
             
         }
     } 
     public static void main(String[] args){ 
         exercicio_14 ex = new exercicio_14(); 
         ex.read(); 
         ex.draw();
     }
}
