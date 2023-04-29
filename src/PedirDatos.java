import java.util.Scanner;

public class PedirDatos {
    int a,b,c;
    ImprimirResultados imprimirResultados= new ImprimirResultados();
    Scanner scanner= new Scanner(System.in);
    public void ingreseValores(){
        int verificacion = 0;
        do {
            System.out.println("------------------FORMULA GENERAL------------------");
            System.out.println("Ingrese valores para a= ");
            a = scanner.nextInt();
            System.out.println("Ingrese valores para b= ");
            b = scanner.nextInt();
            System.out.println("Ingrese valores para c= ");
            c = scanner.nextInt();
            if (a != 0 & b != 0 & c != 0) {
                imprimirResultados.imprimir(a, b, c);
            } else {
                System.out.println("-----------------ERROR--------------");
                System.out.println("-----------VALORES INVALIDOS--------------");
                System.out.println("Vuelve a introducir valores");
                System.out.println("-------------------------------------------\n\n");
                verificacion = 2;
            }
        }while (verificacion!=1);
    }
}
