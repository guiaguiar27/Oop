package Exercise.Pract1;
import java.util.Scanner;   

public class exercicio_13 { 
    float Max_Balance = (float) 50.0 ,Balance, Ex,  Min_minutes = (float)100.0,  minutes = (float) 0.0 ,  fixed_O, fixed_V, fixed_D;  
    void verifyCall(String CallType, double min){  
        float aux_minutes ; 
        if(CallType.equals("f")){ 
            minutes = (float) minutes/2 ; 
        } 
        minutes += min;     
         
        if(minutes > Min_minutes){
            if(CallType.equals("o")){ 
                    aux_minutes = (float) minutes - 100 ; 
                    Ex = (float)0.65*aux_minutes;   
                    System.out.println("Tempo de chamada excedido: " + aux_minutes);
                    System.out.println("Valor gasto na ligação: " + Ex +" R$"); 
                    Balance -= Ex; 
            } 
            else if(CallType.equals("v")){ 
                if(minutes < 50){ 
                    System.out.println("Seus minutos ainda estao dentro do pacote de 50");
                    return ;
                } 
                else{  
                    aux_minutes = (float) minutes - 100 ; 
                    Ex = (float) 0.2*aux_minutes;   
                    System.out.println("Tempo de chamada excedido: " + aux_minutes);
                    System.out.println("Valor gasto na ligação: " + Ex +" R$"); 
                    Balance -= Ex; 
                }
            } 
        } 
        else{  
            System.out.println("Seus minutos ainda estao dentro do pacote de 50");
            return ;  
        }
    } 
    int read(int Ans){  
        
        float min ;  
        String T;     
        Scanner get = new Scanner(System.in); 
    
        if(Ans == 2 )  
            return 2; 

        System.out.println("Digite os Minutos e ao lado o tipo de ligação (ex '2.0 v'): "); 
        T = get.nextLine(); 
        if(!T.isEmpty()){
            String[] parts = T.split(" ");  
            min = Float.parseFloat(parts[0]); 
            verifyCall(parts[1], min);        
        } 
             
        return  Ans; 

    }  
    void show(){ 
        
    }
    public static void main(String[] args){  
        Scanner get = new Scanner(System.in); 
        exercicio_13 rx = new exercicio_13();   
        System.out.println("Digite seu saldo (> 50.0): "); 
        rx.Balance = get.nextFloat();  
        System.out.println("1- ligar | 2 - cancelar"); 
        int Ans = get.nextInt(); 
        while( rx.read(Ans) == 1){ 
            if(rx.Balance < 0.0){ 
                System.out.println("O usuario nao pode realizar ligacoes"); 
                break;     
            }   
            System.out.println("Saldo restante: " + rx.Balance +" R$");
            System.out.println("Minutos gastos: " + rx.minutes);
            System.out.println("1- ligar | 2 - cancelar"); 
            Ans = get.nextInt();

        } 
    }
}
