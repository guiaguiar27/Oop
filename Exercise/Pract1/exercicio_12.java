package Exercise.Pract1;
import java.io.File ;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class exercicio_12 {
    int countPatiente = 0 ;  
    String Patient;   
    int SumAgeMen = 0 , CountMen = 0 ;   
    double AverageAgeMen, ShorterW = 2.0 ; 
    int WomanParam = 0, PatientUnder18_25 = 0 , OldestP = 0 ;     
    String OldestPName, ShorterWomanName; 
    String[] parts ;  

    void read() throws FileNotFoundException {
         
        File fl = new File("/Users/Macbook/Documents/Oop/Exercise/Pract1/12.txt");  
        Scanner get = new Scanner(fl);   
        Patient = get.nextLine(); 

        parts = Patient.split(" "); 
        OldestP = Integer.parseInt(parts[3]);   
        count(Patient); 
        // percorre os demais
        while(get.hasNextLine()){  
            Patient = get.nextLine();  
            count(Patient); 
            
                   
        }  
    }   
    void count(String name){ 
        int aux_age ;  
        double aux_height ;  
        double aux_weight;
        parts = name.split(" ");
        countPatiente++ ;    
        aux_age = Integer.parseInt(parts[3]); 
        
        if(aux_age >= 18 && aux_age <= 25) PatientUnder18_25++;  

        if(OldestP < aux_age){ 
            OldestPName = parts[0]; 
       
        }   
        if(parts[1].equals("Masculino")){ 
              CountMen++;  
              SumAgeMen += Integer.parseInt(parts[3]);    
        } 
        if(parts[1].equals("Feminino")){   
            aux_weight = Double.parseDouble(parts[2]);  
            aux_height = Double.parseDouble(parts[4]);  
            if(aux_height >1.6 && aux_height < 1.7){ 
                if(aux_weight > 70.0){ 
                    WomanParam++; 
                }
            }
            if(aux_height < ShorterW)  
             ShorterWomanName = parts[0];   
      } 
         
    }
    void process(){ 
        AverageAgeMen = (double) SumAgeMen / CountMen;   
        System.out.println("Quantidade de pacientes: " + countPatiente); 
        System.out.println("Nome do paciente mais velho: " + OldestPName); 
        System.out.println("Media de idade dos homens: " + AverageAgeMen);  
        System.out.println("Numero de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + WomanParam);  
        System.out.println("Nome da mulher mais baixa: " + ShorterWomanName);  
        

        

    }
    public static void main(String[] args) throws FileNotFoundException {
        exercicio_12 ex = new exercicio_12(); 
        ex.read(); 
        ex.process();
    }
}
