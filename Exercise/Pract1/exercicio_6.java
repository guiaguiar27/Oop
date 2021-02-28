package Exercise.Pract1;
import java.util.Scanner; 

public class exercicio_6 { 
    int Hsecs = 3600; 
    int Msecs = 60 ; 
    String Time1, Time2; 
    int Hour1, Hour2, Min1, Min2, Sec1, Sec2, Hour_result, Min_result, Sec_result, result ;   
    void read(){  
        Scanner get = new Scanner(System.in);  
        System.out.println("Entre com o horario no seguinte formato"); 
        System.out.println("horas:minutos:segundos -> 2:32:45"); 
        System.out.println("Horario:"); 
        Time1 = get.nextLine(); 
        String[] parts = Time1.split(":"); 
        Hour1 = Integer.parseInt(parts[0]); 
        Min1 = Integer.parseInt(parts[1]); 
        Sec1 = Integer.parseInt(parts[2]); 
       
        System.out.println("Horario:"); 
        Time2 = get.nextLine(); 
        parts = Time2.split(":"); 
        Hour2 = Integer.parseInt(parts[0]); 
        Min2 = Integer.parseInt(parts[1]); 
        Sec2 = Integer.parseInt(parts[2]);  
       
    }   
    int HourToSec(int h){ 
        return h*Hsecs; 
    } 
    int MinToSec(int m){ 
        return m*Msecs;
     } 
    void back(){ 
        Hour_result = Sec_result/Hsecs; 
        Sec_result = Sec_result%Hsecs; 
        Min_result = Sec_result/Msecs;  
        Sec_result = Sec_result%Msecs;  
        System.out.println(Hour_result+ ":" + Min_result + ":" +Sec_result); 
    }
    void compareAndSub(){ 
        int H1 = HourToSec(Hour1) + MinToSec(Min1) + Sec1 ; 
        int H2 = HourToSec(Hour2) + MinToSec(Min2) + Sec2 ; 
        if(H1 > H2){ 
            Sec_result = H1- H2 ; 
        }  
        else{ 
            Sec_result = H2- H1 ;
        }

    } 
    public static void main(String[] args){ 
        exercicio_6 hr = new exercicio_6(); 
        hr.read(); 
        hr.compareAndSub(); 
        hr.back();
    }

}
