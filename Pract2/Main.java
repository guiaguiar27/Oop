package Pract2; 
import java.util.Scanner;  

public class Main { 
    void options(funcionario func){  
        Scanner keyb = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("Digite o tipo de modificacao que deseja fazer");   
        System.out.println("* 1 - Modificar e obter o Tipo de contrato");  
        System.out.println("* 2 - Modificar e obter o Valor do Salario"); 
        System.out.println("* 3 - Modificar e obter o Numero de filhos dependentes"); 
        System.out.println("* 4 - Modificar e obter a Data de admissão"); 
        System.out.println("----------------------------------------------------------");
        switch(keyb.nextInt()){ 
            case 1:  
                System.out.println("Tipo de contrato atual: "+ func.getTipoContrato()); 
                System.out.println("Digite 1 para modificar ou 0 para sair"); 
                if(keyb.nextInt() == 1 ){   
                    keyb.nextLine(); // para n pular 
                    System.out.print("Digite o novo tipo de contrato: "); 
                    func.setTipoContrato(keyb.nextLine()); 
                    System.out.println("Tipo de contrato atual: "+ func.getTipoContrato());  
                    break;
                } 
                else break;   

            case 2:  
                System.out.println("Valor salario atual: "+ func.getSalario()); 
                System.out.println("Digite 1 para modificar (devera modificar a folha de pagamento em seguida)ou 0 para sair"); 
                if(keyb.nextInt() == 1 ){   
                    keyb.nextLine(); // para n pular 
                    System.out.print("Digite o novo salario: ");
                    func.setSalario(keyb.nextFloat());
                    System.out.println("Valor de salario atual: "+ func.getSalario()); 
                    break; 
                } 
                else break;   
            case 3:  
                System.out.println("Numero de depentes atual: "+ func.getQuantidadeFilhos()); 
                System.out.print("Digite 1 para modificar ou 0 para sair"); 
                if(keyb.nextInt() == 1 ){  
                    keyb.nextLine(); // para nao pular 
                    System.out.print("Digite a nova quantidade: ");
                    func.setQuantidadeFilhos(keyb.nextInt());
                    System.out.println("Quantidade de filhos atual: "+ func.getQuantidadeFilhos());  
                    break;
                } 
                else break;   
            case 4:   
                System.out.println("Data de admissão  atual: "+ func.getDataAdmissão()); 
                System.out.println("Digite 1 para modificar ou 0 para sair"); 
                if(keyb.nextInt() == 1 ){   
                    keyb.nextLine(); // para nao pular
                    System.out.print("Digite a nova data: ");
                    func.setDataAdmissão(keyb.nextLine());
                    System.out.println("Data de admissão  atual: "+ func.getDataAdmissão()); 
                    break;
                } 
                else break;
            default: 
                System.out.println("Numero Invalido");  
                break; 
        }
    }
    public static void main(String[] args){  
        Scanner Get = new Scanner(System.in); 
        Main m = new Main();  
        String AUX; 
        String [] parts;  
       // while(stopFlag == 0 ){   
        
        System.out.println("Entre com o nome e com a data de nascimento no seguinte formato: 'Nome dia/mes/ano' (Digitando a barra '/'): ");
        AUX = Get.nextLine();   
        parts = AUX.split(" ");
        funcionario Func = new funcionario(parts[0],parts[1]); 
        Func.contratar();  

        System.out.println("Digite 1 para imprimir:"); 
        if(Get.nextInt() == 1) Func.print();
        // teste getter setter    

        System.out.println("Para calcular a folha de pagamento digite - 2:");  
        if(Get.nextInt() == 2) { 
            System.out.println("Digite o numero de horas trabalhadas");
            Func.init_folha_pagamento(Get.nextInt()); 
            Func.get_folha(); 
        } 
        System.out.println("Caso deseje modificar ou obter algum paremtro especifico digite - 3 :"); 
        if(Get.nextInt() == 3) { 
            m.options(Func);
        }
        
        

        
    }
}
