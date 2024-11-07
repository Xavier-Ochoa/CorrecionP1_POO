package FigurasRegulares;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cuadrado
        Cuadrado cuadrado = new Cuadrado();
        System.out.print("Ingrese el lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        cuadrado.setLado(ladoCuadrado);
        System.out.println("\nCuadrado:");
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
        System.out.println("Area: " + cuadrado.calcularArea());

        // Rectángulo
        Rectangulo rectangulo = new Rectangulo();
        System.out.print("\nIngrese la base del rectangulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double alturaRectangulo = scanner.nextDouble();
        rectangulo.setBase(baseRectangulo);
        rectangulo.setAltura(alturaRectangulo);
        System.out.println("\nRectangulo:");
        System.out.println("Base: " + rectangulo.getBase() + ", Altura: " + rectangulo.getAltura());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
        System.out.println("Area: " + rectangulo.calcularArea());

        // Círculo
        Circulo circulo = new Circulo();
        System.out.print("\nIngrese el radio del circulo: ");
        double radioCirculo = scanner.nextDouble();
        circulo.setRadio(radioCirculo);
        System.out.println("\nCirculo:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Perimetro (Circunferencia): " + circulo.calcularPerimetro());
        System.out.println("Area: " + circulo.calcularArea());

        // Triángulo
        Triangulo triangulo = new Triangulo();
        System.out.print("\nIngrese la base del triangulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double alturaTriangulo = scanner.nextDouble();
        triangulo.setBase(baseTriangulo);
        triangulo.setAltura(alturaTriangulo);
        System.out.print("Ingrese el lado 1 del triangulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el lado 2 del triangulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el lado 3 del triangulo: ");
        double lado3 = scanner.nextDouble();
        triangulo.setLados(lado1, lado2, lado3);
        System.out.println("\nTriangulo:");
        System.out.println("Base: " + triangulo.getBase() + ", Altura: " + triangulo.getAltura());
        System.out.println("Lado 1: " + triangulo.getLado1());
        System.out.println("Lado 2: " + triangulo.getLado2());
        System.out.println("Lado 3: " + triangulo.getLado3());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println("Area: " + triangulo.calcularArea());

        double areaTotal = cuadrado.calcularArea() + rectangulo.calcularArea() + circulo.calcularArea() + triangulo.calcularArea();
        System.out.println("\nSumatoria de todas las áreas: " + areaTotal);

        scanner.close();
    }
}
