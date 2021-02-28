package Exercise.Pract1;
import java.util.Scanner; 

public class exercicio_5 {
    int day, month; 
    void read(){ 
        Scanner get = new Scanner(System.in);
        System.out.println("Entre com o dia"); 
        day = get.nextInt(); 
        System.out.println("Entre com o dia"); 
        month = get.nextInt();   
    }
    void analyse(){
        if( month == 1 ){  
            if(day >= 1 && day <=  31){ 
                System.out.println("Data valida - Janeiro");
            } 
            else 
                System.out.println("data invalido");
        }  
        else if(month == 2 ){ 
            if(day >= 1 && day <= 28){ 
                System.out.println("Data valida - Fevereiro");
            } 
            else 
                System.out.println("data invalido");
        }
        else if(month == 3 ){ 
            if(day >= 1 && day <= 31){ 
                System.out.println("Data valida - Marco");
            }
            else 
                System.out.println("data  invalido");
        }    
        else if(month == 4 ){  
            if(day >= 1 && day <= 30){ 
                System.out.println("Data valida - Abril");
            } 
            else 
                System.out.println("data invalido");
        }  
        else if(month == 5 ){  
            if(day >= 1 && day <= 31){ 
                System.out.println("Data valida - Maio");
            } 
            else 
                System.out.println("data invalido");
        }  
        else if(month == 6 ){  
            if(day >= 1 && day <= 30){ 
                System.out.println("Data valida - Junho");
            } 
            else 
                System.out.println("data invalido");
        }  
        else if(month == 7){ 
            if(day >= 1 && day <= 31){ 
                System.out.println("Data valida - Julho");
            } 
            else 
                System.out.println("data invalido");
        }  
        else if(month == 8){ 
            if(day >= 1 && day <= 31){ 
                System.out.println("Data valida - Agosto ");
            } 
            else 
                System.out.println("data invalido");
        }  
        else if(month == 9 ){  

            if(day >= 1 && day <= 30){ 
                System.out.println("Data valida - Setembro");
            } 
            else 
                System.out.println(" data invalido");
        }   
        else if(month == 10 ){  

            if(day >= 1 && day <= 31){ 
                System.out.println("Data valida -  Outubro");
            } 
            else 
                System.out.println("data invalido");
        }  
        else if(month == 11 ){  

            if(day >= 1 && day <= 30){ 
                System.out.println("Data valida - Novembro");
            } 
            else 
                System.out.println("Data invalido");
        } 
        else if(month == 12 ){  

            if(day >= 1 && day <= 31){ 
                System.out.println("Data valida - Dezembro");
            } 
            else 
                System.out.println("data invalido");
            
        }     
        else{ 
            System.out.println("Mes invalido");
        }
    } 
    public static void main(String[] args){ 
        exercicio_5 date = new exercicio_5();  
        date.read();; 
        date.analyse();
    }
}
