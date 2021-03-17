package Pract2; 
import java.util.Scanner; 

public class Main {
    public static void main(String[] args){  
        Scanner Get = new Scanner(System.in); 
        String nome, datanascimento; 
        int stopFlag = 0 ; 
        while(true){   
        System.out.println("Entre com o nome:");
        nome = Get.nextLine();   
        System.out.println("Entre com a data de nascimento no seguinte formato: dia/mes/ano (Digitando a barra '/'): ");
        datanascimento = Get.nextLine();
        funcionario Func = new funcionario(nome,datanascimento); 
        Func.print();
        System.out.println("Deseja Parar(1)");  
        stopFlag = Get.nextInt(); 
        if(stopFlag == 1) break; 

        } 

        
    }
}
