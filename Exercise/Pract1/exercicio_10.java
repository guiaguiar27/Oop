package Exercise.Pract1;
import java.util.Scanner ;  
public class exercicio_10 {
    int  A , B, result;  
    String  StrOp ; 
    String[] parts;    
    int sum(int a, int b){ 
        return a + b ; 
    }  
    int div(int a, int b){ 
        return a/b ; 
    }
    int sub(int a, int b){ 
        return a - b ; 
    }     
    int mult(int a, int b){ 
        return a * b ; 
    }    
    int process(){ 
        Scanner get = new Scanner(System.in); 
        StrOp = get.nextLine();   
        if(StrOp.equals("FIM")) return 0 ;  

        parts = StrOp.split(" ");   
        A = Integer.parseInt(parts[1]); 
        B = Integer.parseInt(parts[3]);
        if(parts[0].equals("MULTIPLICA")){ 
             System.out.println("RESPOSTA: " + mult(A, B));
        } 
        else if(parts[0].equals("DIVIDE")){ 
            System.out.println("RESPOSTA: " +  div(A, B));
        } 
        else if(parts[0].equals("SOMA")){ 
            System.out.println("RESPOSTA: " +  sum(A, B));
        } 
        else if(parts[0].equals("SUBTRAI")){ 
            System.out.println("RESPOSTA: " +  sub(A, B)); 
        } 
        return 1 ; 

    }  
    public static void main(String[] args){ 
        exercicio_10 cal = new exercicio_10();   
        System.out.println("Entre com as operações no seguinte modelo");
        System.out.println("MULTIPLICA A POR B");
        System.out.println("digite ---- FIM ---para parar o programa");
            
    while(cal.process() == 1 ){ 
        if(cal.process() == 0) break;
    }
        
    }
    
}
