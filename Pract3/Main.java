package Pract3;
import java.util.Scanner; 

/* 
password employer = 1234  
*/

public class Main { 
    
    
    public static void main(String[] args){  
        // constructors  
        int Qnt,counter = 0;  
        String password;  
        int person ; 
        Scanner get = new Scanner(System.in);
        DrinkMachine NewMachine = new DrinkMachine();   
        while(true){
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("------------------------------------------SOFT DRINK MACHINE------------------------------------------------"); 
            System.out.println("------------------------------------------------------------------------------------------------------------"); 
            System.out.println("First who are you? 1- Technician 2- User 0- to quit : "); 
            person = get.nextInt();
            if(person == 1 ){ 
                //NewMachine.initMachine(); 
                System.out.println("Enter your 4-digit employee password(ex.: 0000)");  
                get.nextLine(); 
                password = get.nextLine(); 
                if(password.equals("1234"))
                    NewMachine.SetMachine();  
                else
                    System.out.println("You're not an emploed, sorry!");
                
            } 
            if(person == 2){ 
            NewMachine.insertCredit(); 
            if(NewMachine.verify_release()==1){  
                System.out.println("***********************PURCHASE******************************");
                System.out.println("Options avaiable:");  
                NewMachine.showStock(); 
                NewMachine.ChooseSoftDrink();
                System.out.println("*****************************************************");
                }  
            } 
            if(person == 0) break;
            
    }  


     

    }
}
