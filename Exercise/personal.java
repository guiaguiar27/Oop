import java.util.Scanner; 

class personal { 
    String NomeCompleto ; 
    String DataNasciemnto ;
    String Naturalidade ; 
    String Nacionalidade ;
    String Matricula ; 
    void feel(){  
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite o nome completo com espacos");   
        NomeCompleto = scan.nextLine();
        System.out.println("Digite a data de nascimento com as barras (/)");   
        DataNasciemnto = scan.nextLine();
        System.out.println("Digite a naturalidade ");   
        Naturalidade = scan.nextLine();
        System.out.println("Digite a nacionalidade"); 
        Nacionalidade = scan.nextLine();
        System.out.println("Digite a matricula"); 
        Matricula = scan.nextLine();     
    } 
    void show(){  
        System.out.println("________Dados coletados_______");
        System.out.println(NomeCompleto); 
        System.out.println(DataNasciemnto); 
        System.out.println(Naturalidade); 
        System.out.println(Nacionalidade); 
        System.out.println(Matricula);
    }  

    public static void main(String[] args){ 
        personal per = new personal();  
        per.feel(); 
        per.show();
    }
}