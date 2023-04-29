public class ImprimirResultados {
    SolucionX1 solucionX1= new SolucionX1();
    SolucionX2 solucionX2= new SolucionX2();

    public void imprimir(int a, int b, int c){
        System.out.println("Solucion X1= "+solucionX1.sustitucionX1(a,b,c));
        System.out.println("Solucion X2= "+solucionX2.sustitucionX2(a,b,c));
    }
}
