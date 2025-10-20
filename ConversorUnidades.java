import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenuPrincipal();
            opcion = obtenerOpcion(scanner);
            
            switch(opcion) {
                case 1:
                    convertirTemperatura(scanner);
                    break;
                case 2:
                    convertirLongitud(scanner);
                    break;
                case 3:
                    convertirPeso(scanner);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while(opcion != 4);
        
        scanner.close();
    }
    
    private static void mostrarMenuPrincipal() {
        System.out.println("\nCONVERSOR DE UNIDADES");
        System.out.println("1. Temperatura.");
        System.out.println("2. Longitud.");
        System.out.println("3. Peso.");
        System.out.println("4. Salir.");
        System.out.print("Seleccione una opción: ");
    }
    
    private static int obtenerOpcion(Scanner scanner) {
        while(!scanner.hasNextInt()) {
            System.out.println("Por favor ingrese un número válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    private static void convertirTemperatura(Scanner scanner) {
        System.out.println("\nConversión de Temperatura");
        System.out.println("1. Celsius a Fahrenheit.");
        System.out.println("2. Fahrenheit a Celsius.");
        System.out.println("3. Celsius a Kelvin.");
        System.out.println("4. Kelvin a Celsius.");
        System.out.print("Seleccione conversión: ");
        
        int subOpcion = obtenerOpcion(scanner);
        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        
        switch(subOpcion) {
            case 1:
                System.out.printf("Resultado: %.2f °F\n", (valor * 9/5) + 32);
                break;
            case 2:
                System.out.printf("Resultado: %.2f °C\n", (valor - 32) * 5/9);
                break;
            case 3:
                System.out.printf("Resultado: %.2f K\n", valor + 273.15);
                break;
            case 4:
                System.out.printf("Resultado: %.2f °C\n", valor - 273.15);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    
    private static void convertirLongitud(Scanner scanner) {
        System.out.println("\nConversión de Longitud");
        System.out.println("1. Metros a Pies.");
        System.out.println("2. Pies a Metros.");
        System.out.println("3. Centímetros a Pulgadas.");
        System.out.println("4. Pulgadas a Centímetros.");
        System.out.print("Seleccione conversión: ");
        
        int subOpcion = obtenerOpcion(scanner);
        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        
        switch(subOpcion) {
            case 1:
                System.out.printf("Resultado: %.2f ft\n", valor * 3.28084);
                break;
            case 2:
                System.out.printf("Resultado: %.2f m\n", valor / 3.28084);
                break;
            case 3:
                System.out.printf("Resultado: %.2f in\n", valor / 2.54);
                break;
            case 4:
                System.out.printf("Resultado: %.2f cm\n", valor * 2.54);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    
    private static void convertirPeso(Scanner scanner) {
        System.out.println("\nConversión de Peso");
        System.out.println("1. Kilogramos a Libras.");
        System.out.println("2. Libras a Kilogramos.");
        System.out.println("3. Kilogramos a Onzas.");
        System.out.println("4. Onzas a Kilogramos.");
        System.out.print("Seleccione conversión: ");
        
        int subOpcion = obtenerOpcion(scanner);
        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        
        switch(subOpcion) {
            case 1:
                System.out.printf("Resultado: %.2f lb\n", valor * 2.20462);
                break;
            case 2:
                System.out.printf("Resultado: %.2f kg\n", valor / 2.20462);
                break;
            case 3:
                System.out.printf("Resultado: %.2f oz\n", valor * 35.274);
                break;
            case 4:
                System.out.printf("Resultado: %.2f kg\n", valor / 35.274);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}