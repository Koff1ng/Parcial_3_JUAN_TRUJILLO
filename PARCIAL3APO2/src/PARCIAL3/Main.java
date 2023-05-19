package PARCIAL3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Nave> inventario = new ArrayList<>();
        
        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear nave tripulada");
            System.out.println("2. Crear nave no tripulada");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.println("5. Buscar una nave");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la nave tripulada: ");
                    String nombreTripulada = scanner.next();
                    VehiculoTripulado VehiculoTripulado = new VehiculoTripulado(nombreTripulada, opcion, opcion, opcion);
                    inventario.add(VehiculoTripulado);
                    System.out.println("Nave tripulada creada y añadida al inventario.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la nave no tripulada: ");
                    String nombreNoTripulada = scanner.next();
                    VehiculoNoTripulado VehiculoNoTripulado = new VehiculoNoTripulado(nombreNoTripulada,"0","0");
                    inventario.add(VehiculoNoTripulado);
                    System.out.println("Nave no tripulada creada y añadida al inventario.");
                    break;
                case 3:
                    System.out.println("Inventario de naves:");
                    for (Nave nave : inventario) {
                        System.out.println(nave);
                    }
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    
                case 5:
                    buscarNave(inventario);
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            
        }
    }
    private static void buscarNave(List<Nave> inventario) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la nave a buscar: ");
        String nombre = scanner.nextLine();
        
        boolean encontrada = false;
        for (Nave nave : inventario) {
            if (nave.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nave encontrada: " + nave);
                encontrada = true;
                break;
            }
        }
        scanner.close();
        
        if (!encontrada) {
            System.out.println("No se encontró ninguna nave con ese nombre en el inventario.");
        }
    }
}
