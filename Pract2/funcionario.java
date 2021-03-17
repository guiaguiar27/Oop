package Pract2;
import Pract2.funcionario;
public class funcionario {
    public String Nome, DataAdmissao, DataNascimento, TipoContrato;   
    public Float Salario;  
    public int NumFilhosUnder18;   
    
    public funcionario(String nome, String datanascimento){ 
        Nome = nome; 
        DataNascimento = datanascimento;   
    } 
    public void print(){ 
        System.out.println(Nome); 
        System.out.println(DataNascimento); 
    }
}
