import java.util.Scanner;

public class Principal {
    public void main() {
        double a;
        double b;
        double c;
        int num = 4;
        double sum;
        double res;
        double divisor;
        double multiplicador=2.0;
        double div1;
        double div2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ecuación de Segundo Grado");
        System.out.println("Ingresa el primer número (a): ");
        a = teclado.nextDouble();
        if (a==0){
            System.out.println("El número de a no puede ser igual a 0");
        }else {
            System.out.println("Ingresa el segundo número (b): ");
            b = teclado.nextDouble();
            System.out.println("Ingresa el tercer número (c): ");
            c = teclado.nextDouble();
            double discriminante = b * b - num * a * c;
            if (discriminante>0){
                double raiz = Math.sqrt(discriminante);
                sum = -b + raiz;
                res = -b - raiz;
                divisor = multiplicador * a;
                div1 = sum / divisor;
                div2 = res / divisor;
                System.out.println("El primer resultado es: " + div1);
                System.out.println("El segundo resultado es: " + div2);

            }else if (discriminante==0){
                double div3 = -b / (2*a);
                System.out.println("La raíz es 0 así que solo hay una solución");
                System.out.println("La solución es: "+div3);
            }else {
                System.out.println("La raíz cuadrada da un número negativo, no tiene solución en los números reales ");
            }
        }
    }
}
