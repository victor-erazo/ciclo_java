import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Seccion Ejemplo para calculo de cifras
        var sc = new Scanner(System.in);

        System.out.println("INTRODUCE UN NUMERO ENTERO: ");
        var numero = sc.nextInt();

        // Seccion de conexion con funcion
        var digitos = numeroDigitos(numero);
        System.out.println("El numero tiene" + digitos + " cifras");

    }

    public static int numeroDigitos(int numero) {
        var cifras = 0;

        while (numero != 0) {
            numero /= 10;
            cifras++;
        }
        return cifras;

    }
}
