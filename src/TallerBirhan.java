import java.util.Scanner;

public class TallerBirhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n¿Qué vehículo entra?");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Camión");
            System.out.println("4. Tractor");
            System.out.println("5. Grua");
            System.out.println("6. Salir");
            System.out.print("Seleccione el tipo de vehículo o ingrese 6 para salir: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Coche coche = new Coche();
                    manejarVehiculo(coche);
                    break;
                case 2:
                    Moto moto = new Moto();
                    manejarVehiculo(moto);
                    break;
                case 3:
                    Camion camion = new Camion();
                    manejarVehiculo(camion);
                    break;
                case 4:
                    Tractor tractor = new Tractor();
                    manejarVehiculo(tractor);
                    break;
                case 5:
                    Grua grua = new Grua();
                    manejarVehiculo(grua);
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }

    // Método para manejar un vehículo
    public static void manejarVehiculo(Vehiculo vehiculo) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("Seleccione la pieza que necesita reponer o reparar:");
            System.out.println("1. Motor");
            System.out.println("2. Frenos");
            System.out.println("3. Luces");
            System.out.println("4. Neumáticos");
            System.out.println("5. Carrocería");
            System.out.println("6. Salir");
            System.out.print("Ingrese el número de la pieza o 6 para salir: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    vehiculo.Reparar("Motor");
                    break;
                case 2:
                    vehiculo.Reparar("Frenos");
                    break;
                case 3:
                    vehiculo.Reparar("Luces");
                    break;
                case 4:
                    vehiculo.Reparar("Neumáticos");
                    break;
                case 5:
                    vehiculo.Reparar("Carrocería");
                    break;
                case 6:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        System.out.println("Saliendo del menú de vehículo...");
    }
}
