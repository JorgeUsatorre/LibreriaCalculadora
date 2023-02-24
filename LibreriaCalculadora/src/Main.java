
public class Main {
    /*
     * @param device --> operación a realizar (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)
     * @param num1 --> primer numero de la operación
     * @param num2 --> segundo numero de la operación (divisor en caso de division)
     * @return resultado o null en caso de fallo.
     */
    public static void main(String[] args) {

        Operaciones metodos = new Operaciones();
        double num1 = 20;
        double num2 = 10;
        double resultado = metodos.calculadora(Operaciones.RAIZ_CUADRADA, num1, num2);

        System.out.println("El resultado de la suma es: " + resultado);

    }

}