public class SolucionX2 {
    int resultadoX2;
    public int sustitucionX2(int a , int b, int c){
        resultadoX2= (int) (-b - Math.sqrt(Math.pow(b, 2)-4*(a*c)))/(2*a);
        //System.out.println(resultadoX2);
        return resultadoX2;
    }
}


