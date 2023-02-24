
public class Operaciones {

    private static Double resultado = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;
    static final int RAIZ_CUADRADA = 5;
    static final int RAIZ_CUBICA = 6;



    public static Double calculadora(int device, double num1, double num2){

        switch (device){
            case SUMA:
                try{
                    resultado = num1 + num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case RESTA:
                try{
                    resultado = num1 - num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case MULTIPLICACION:
                try{
                    resultado = num1*num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case DIVISION:
                try{
                    resultado = num1/num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case RAIZ_CUADRADA:
                try{
                    resultado = Math.sqrt(num1);
                }catch (Exception e){
                    System.out.println("Error");
                }
            case RAIZ_CUBICA:
                try{
                    resultado = Math.cbrt(num1);
                }catch (Exception e){
                    System.out.println("Error");
                }
        }
        return resultado;
}
}