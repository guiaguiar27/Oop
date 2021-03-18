package Pract2;
import Pract2.funcionario; 
import java.util.Scanner;
  
public class funcionario {
    private String Nome, DataNascimento, DataAdmissao, TipoContrato;   
    private float Salario;   
    private int NumFilhosUnder18;  
    FolhaPagamento folha = new FolhaPagamento();
    
    public funcionario(String nome, String datanascimento){ 
        Nome = nome; 
        DataNascimento = datanascimento;    

    }  
    public void print(){  
        System.out.println("----------------------------------------------------------");
        System.out.println("* Nome: "+ Nome); 
        System.out.println("* Data de nascimento: " + DataNascimento);  
        System.out.println("* Data de admissão: "+ DataAdmissao); 
        System.out.println("* Salario: "+ Salario);  
        System.out.println("* Quantidade de dependentes menores de idade: " + NumFilhosUnder18); 
        System.out.println("* Tipo de contrato: "+ TipoContrato);  
        System.out.println("----------------------------------------------------------");
    }  
    public void contratar(){ 
        Scanner get = new Scanner(System.in); 
        System.out.println("Entre com o tipo do contrato"); 
        TipoContrato = get.nextLine();  
        System.out.println("Entre com a data de admissão: formato(dia/mes/ano)"); 
        DataAdmissao = get.nextLine(); 
        System.out.println("Entre com o salario do novo funcionario"); 
        Salario = (float) get.nextFloat(); 
        System.out.println("Entre com a quantidade de filhos menores de idade do funcionario"); 
        NumFilhosUnder18 = get.nextInt();
    }    
    
    //getter methods 
    public String getDataAdmissão(){ 
        return DataAdmissao; 
    } 
    public String getTipoContrato(){ 
        return TipoContrato;
    } 
    public float getSalario(){ 
        return Salario; 
    } 
    public int getQuantidadeFilhos(){ 
        return NumFilhosUnder18; 
    }   
    // setter methods  
    public void setDataAdmissão(String newData){ 
        this.DataAdmissao =  newData; 
    } 
    public void setTipoContrato(String newTipo){ 
        this.TipoContrato = newTipo;
    } 
    public void setSalario(float newSalario){ 
        this.Salario = newSalario; 
        Scanner get = new Scanner(System.in);
        System.out.println("Devido a alteração do salario a folha de pagamento deve ser alterada:"); 
        System.out.println("Digite o numero de horas trabalhadas"); 
        int num_horas = get.nextInt();
        folha.CadastroFolha(num_horas, TipoContrato, Salario); 
        folha.printFolhaPagamento();
    } 
    public void setQuantidadeFilhos(int newQuantidade){ 
        this.NumFilhosUnder18 = newQuantidade;   
    }   

    public void init_folha_pagamento(int num_horas){  

        folha.CadastroFolha(num_horas, TipoContrato, Salario);   
        folha.CalculaImpostoDeRenda();
        folha.CalculaINSS();  


    } 
    public void get_folha(){
        folha.printFolhaPagamento();
    }


}
