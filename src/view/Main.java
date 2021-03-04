package view;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int valor;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("escolha a opcao desejada:"
                +  "\n 1- Chamada de IP"
                + "\n 2- Chamada de Ping"
                + "\n 3 - Finalizar ");
        valor = ler.nextInt();
        
        switch (valor){
        case 1:
            
            break;
        case 2: 
            
            break;
        case 3:
            System.exit(0);
            break;
        }
        
        
    }
}