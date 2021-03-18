package Pract2;

public class FolhaPagamento {
    private float SalarioBruto, descontoINSS,descontoIR, Salario, SalIR, SalINSS, SalarioLiquid; 
    private String TipoContrato;  
    private int NumHoras;  

    public void CadastroFolha(int num_horas, String TipoContrato, float Salario){  
        this.Salario = Salario;  
        this.TipoContrato = TipoContrato; 
        NumHoras = num_horas; 
        SalarioBruto();  

    } 
    public void CalculaINSS(){ 
              
        float taxaINSS = (float)0.0;  
       
        if (SalarioBruto <= 1659.38) 
            taxaINSS = (float) 0.08; 
        else if (SalarioBruto > 1659.38 && SalarioBruto <= 27665.66) 
            taxaINSS = (float) 0.09;   
        else if(SalarioBruto > 27665.66 && SalarioBruto <= 5531.31) 
            taxaINSS = (float) 0.11;   
            
        descontoINSS = (float) SalarioBruto * taxaINSS;   
        SalINSS = (float) SalarioBruto - (SalarioBruto * taxaINSS); 
    } 
    public void CalculaImpostoDeRenda(){   
        float Aliquota = (float)0.0;  
        float ParcelaDeduzir;   
        
        if (SalarioBruto <= 1903.98){ 
            Aliquota = (float) 0.0;  
            ParcelaDeduzir = (float) 0.0;  
        }             
        else if (SalarioBruto > 1903.98 && SalarioBruto <= 2826.65){ 
            Aliquota = (float) 7.5;    
            ParcelaDeduzir = (float) 142.80;
        }
        else if(SalarioBruto > 2826.65 && SalarioBruto <= 3751.05){ 
            Aliquota = (float) 15.0; 
            ParcelaDeduzir = (float) 354.80;
        }
        else if(SalarioBruto > 3751.05 && SalarioBruto <= 4664.68 ){  
            Aliquota =  (float) 22.5;  
            ParcelaDeduzir = (float) 636.13;
        }
        else{ 
            Aliquota =  (float) 27.5;  
            ParcelaDeduzir = (float) 869.36;
        }   
        Aliquota = (float ) Aliquota/100; 
        descontoIR = (float) SalarioBruto*Aliquota; 
        descontoIR = descontoIR - ParcelaDeduzir;  
        SalIR = SalarioBruto - descontoIR;         
            
    } 
    public void printFolhaPagamento(){   
        System.out.println("----------------------------------------------------------");
        System.out.println("* Salario Bruto do funcionario : R$" + SalarioBruto);
        System.out.println("* Desconto INSS: "+ descontoINSS); 
        System.out.println("* Salario com desconto do INSS: R$" + SalINSS); 
        System.out.println("* Desconto IR: "+ descontoIR); 
        System.out.println("* Salario com desconto do Imposto de renda: R$" + SalIR); 
        SalarioLiquid = (float) SalarioBruto - descontoINSS - descontoIR; 
        System.out.println("* Salario liquido: R$"+ SalarioLiquid);  
        System.out.println("----------------------------------------------------------");
        
    }  
    private void SalarioBruto(){ 
        if(TipoContrato.equals("Horista"))
            SalarioBruto = (float) Salario*NumHoras;  
        else
            SalarioBruto = Salario;    
    }


}
