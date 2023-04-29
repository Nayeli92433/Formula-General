public class SolucionX1 {

    int resultadoX1;
    public int sustitucionX1(int a , int b, int c){
        resultadoX1= (int) (-b+ Math.sqrt(Math.pow(b, 2)-4*(a*c)))/(2*a);
        //System.out.println(resultadoX1);
        return resultadoX1;
    }
}
