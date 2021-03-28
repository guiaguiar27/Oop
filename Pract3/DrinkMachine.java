package Pract3;
import java.util.Scanner;  
import java.util.stream.IntStream;  

import java.util.Arrays;


public class DrinkMachine {
    public float Credit; 
    private int[] SoftDrinkQuantity;  
    public float CurrentCredit;    
    private float credittype [] = {(float) 0.1 , (float) 0.25 ,(float) 0.5, (float) 1.0};  
    SoftDrink[] Drinks;  
    private int total = 2 ;  
    private int flag = 0 ; // release the machine to sell the drinks  
    private int flag_technician = 0 ; 
    // to technician 
    // we will work with soft drink id (the name is only for user ex 1 - coke, 2)
    // employer  

    public void SetMachine(){   
        int id = 0 ;
        Scanner keyb = new Scanner(System.in); 
        Drinks = new SoftDrink[5];   
        String auxName; 
        
        SoftDrinkQuantity = new int[5]; 
         
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Enter the number correspond to the setting that you want to do");  
        System.out.println("* 1 - Set the names of the drinks, the respective quantity and soft drink's price"); 
        System.out.println("* 2 - Change the price and the quantity of the soft drink, you need to have already filled the machine"); 
        System.out.println("----------------------------------------------------------");
        
        switch(keyb.nextInt()){ 
            case 1:   
                // tem que por 5 
                while(id < total){
                    Drinks[id] = new SoftDrink();  
                    System.out.println("!!!ATENTION!!!!!You are creating only one soft drink's register (don't get confusing)");    
                    keyb.nextLine(); 
                    System.out.println("Enter the drink name:"); 
                    Drinks[id].Name = keyb.nextLine();  

                    System.out.println("Enter the quantity:");  
                    SoftDrinkQuantity[id] = keyb.nextInt();   
                    if(SoftDrinkQuantity[id] > 20){ 
                        System.out.println("The machine supports only 20 units of each soft drink, the current quantity is 20");
                        SoftDrinkQuantity[id] = 20; 
                    }
                    
                    System.out.println("Enter the soft drink's price:");  
                    keyb.nextLine(); 
                    Drinks[id].SetPrice(keyb.nextFloat());
                    id+=1; 
                }  
                flag_technician = 1; 
                showStock();
                break; 
            case 2: 
                System.out.println("Enter the name of the refrigerant you want to change");  
                keyb.nextLine();
                auxName =  keyb.nextLine();  
                id = 0; 
                while(id < total){ 
                    if(Drinks[id].Name.equals(auxName)){ 
                        System.out.println("Enter new quantity:");  
                        SoftDrinkQuantity[id] = keyb.nextInt();   
                        if(SoftDrinkQuantity[id] > 20){ 
                            System.out.println("The machine supports only 20 units of each soft drink, the current quantity is 20");
                            SoftDrinkQuantity[id] = 20; 
                        }
                        System.out.println("Enter the new soft drink's price:");  
                        keyb.nextLine(); 
                        Drinks[id].SetPrice(keyb.nextFloat());

                        }
                } 
            default: 
                System.out.println("Invalid number, try again ");  
                break; 
        }
    } 
    // user 
    public void GetCredit(float value){ 
        boolean result = false; 
        for(float i : credittype){
            if(i == value){
                result = true;
                break;
            }
        }
        if(result){
            CurrentCredit += value;  
            System.out.println("Great!");
        } 
        else{ 
            System.out.println("This type of money is invalid, it will not be counted");
        }
    }  
    public void ShowCurrentCredit(){ 
        System.out.println("Your current credit is: "+ CurrentCredit +"$");
    }  

    public void CancelSale(){ 
        System.out.println(" insufficient funds! Cancelled purchase!"); 
        return; 

    }  
    private int Credit_revision(int id, int quantity){ 
        float aux_value = (float) quantity * (Drinks[id].GetPrice());   
        if (aux_value > CurrentCredit){ 
            CancelSale(); 
            return 0; 
        }
        CurrentCredit -= aux_value;  
        return 1 ; 

    } 
    public void ChangeStock(int id, int quantity){  
        SoftDrinkQuantity[id] -= quantity; 
    }    

    public void ChooseSoftDrink(){ 
        int counter = 0;  
        int quantity = 0;  
        Scanner get = new Scanner(System.in);  
        System.out.println("Enter the name of the soft drink that you want to buy");   
        String name = get.nextLine();
        while(counter < total){ 
            if(Drinks[counter].Name.equals(name)){ 
                if(SoftDrinkQuantity[counter] <= 0){ 
                    System.out.println("There is no more of this soft drink in stock, sorry"); 
                    return;  
                }
                else{ 
                    System.out.println("How many " + Drinks[counter].Name+ " you want to buy?");  
                    quantity = get.nextInt();  
                    if(Credit_revision(counter, quantity) == 0) return;
                    ChangeStock(counter, quantity); 
                    ShowCurrentCredit();
                }
            } 
            counter +=1 ;   
        }
    } 

    public void showStock(){  
        int id = 0 ; 
        while(id < total){
            System.out.println("Drink name: " + Drinks[id].Name ); 
            System.out.println(Drinks[id].Name+ "'s quantity: " + SoftDrinkQuantity[id] ); 
            System.out.println(Drinks[id].Name+ "'s price: " + Drinks[id].GetPrice()+ "$");
            id+=1; 
        }
    } 
    public void insertCredit(){ 
        Scanner get = new Scanner(System.in); 
        int Qnt, counter = 0 ;   

        System.out.println("How much coins you want to insert into machine?"); 
        Qnt = get.nextInt(); 
        while(counter < Qnt){ 
            System.out.println("Insert your coin (ex.: 0.1 )");
            GetCredit(get.nextFloat()); 
            ShowCurrentCredit();  
            counter+=1 ; 
        } 
        System.out.println("Ok! Credit inserted, you can begin your buy!!!!");  
        flag = 1 ; 
    }  

    public int verify_release(){
        if(flag == 0) return 0 ;  
        return 1;  
    } 
    
    



}
