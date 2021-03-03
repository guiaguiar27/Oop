package Exercise.Pract1;
import java.util.Scanner;   

public class exercicio_13 { 
    double Max_Balance = 50.0 ;  
    Double Balance, Ex;  
    double Min_minutes = 100.0;  
    double minutes = 0.0;  
    double fixed_O, fixed_V, fixed_D;  
    void verifyCall(String CallType, double min){  
        double aux_minutes ; 
        if(CallType.equals("f")){ 
            minutes = (double) minutes/2 ; 
        } 
        minutes += min;    
         
        if(minutes > Min_minutes){
            if(CallType.equals("o")){ 
                    aux_minutes = minutes - 100 ; 
                    Ex = 0.65*aux_minutes;   
                    System.out.println("Tempo de chamada excedido: " + aux_minutes);
                    System.out.println("Valor gasto na ligação: " + Ex); 
                    Balance -= Ex; 
            } 
            else if(CallType.equals("v")){ 
                if(minutes < 50){ 
                    System.out.println("Seus minutos ainda estao dentro do pacote de 50");
                    return ;
                } 
                else{  
                    aux_minutes = minutes - 100 ; 
                    Ex = 0.2*aux_minutes;   
                    System.out.println("Tempo de chamada excedido: " + aux_minutes);
                    System.out.println("Valor gasto na ligação: " + Ex); 
                    Balance -= Ex; 
                }
            } 
        } 
        else{  
            System.out.println("Seus minutos ainda estao dentro do pacote de 50");
            return ;  
        }
    } 
    int read(){  
        int Ans; 
        double min ;  
        String T;     
        Scanner get = new Scanner(System.in); 
         

        System.out.println("Digite seu saldo (> 50): "); 
        Balance = get.nextDouble();  
        if(Balance == 0.0){ 
            System.out.println("O usuario nao pode realizar ligacoes"); 
            return 2 ; 
        } 
        else {
            System.out.println("Ligação?"); 
            System.out.println("1 - Sim"); 
            System.out.println("2 - Nao"); 
            Ans = get.nextInt(); 

            if(Ans == 2 )  
                return 2; 

            System.out.println("Digite os Minutos e ao lado o tipo de ligação (ex '2.0 v'): "); 
            T = get.nextLine(); 
            
            String[] parts = T.split(" ");  
            min = Double.parseDouble(parts[0]); 

            
            verifyCall(parts[1], min); 
                
               
        } 
        return Ans; 

    }  
    void show(){ 
        
    }
    public static void main(String[] args){ 
        exercicio_13 rx = new exercicio_13();  
        while( rx.read() == 1); 
    }
}
