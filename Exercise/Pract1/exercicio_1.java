import java.util.Scanner; 

public class exercicio_1 {
    int CurrentYear, BornYear;  
    void read(){  
        Scanner Scan = new Scanner(System.in);  
        System.out.println("Digite o ano atual");
        CurrentYear = Scan.nextInt();  
        System.out.println("Digite o ano de nascimento"); 
        BornYear = Scan.nextInt(); 
    }
    void calc(){ 
        int age = CurrentYear - BornYear ;  
        System.out.println("Idade:" + age);   
    } 

    public static void main(String[] args){ 
        exercicio_1 Age = new exercicio_1(); 
        Age.read(); 
        Age.calc();
    } 
} 



