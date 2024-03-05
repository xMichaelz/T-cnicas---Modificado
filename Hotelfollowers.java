import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            if (opcion == 1) {
                System.out.println("Ingrese el tipo de empleado a agregar (Recepcionist, Manager, HouseKeeping, Chef):");
                String tipoEmpleado = sc.next();
    
                Empleado nuevoEmpleado = null;
    
                switch (tipoEmpleado) {
                    case "Recepcionist":
                        nuevoEmpleado = new Recepcionist();
                        break;
                    case "Manager":
                        nuevoEmpleado = new Manager();
                        break;
                    case "HouseKeeping":
                        nuevoEmpleado = new HouseKeeping();
                        break;
                    case "Chef":
                        nuevoEmpleado = new Chef();
                        break;
                    default:
                        System.out.println("Tipo de empleado no válido");
                        continue; // Salta a la siguiente iteración del while
                }
    
                nuevoEmpleado.capturarInformacion();
                listaEmpleados.add(nuevoEmpleado);
            } else if (opcion == 2) {
                System.out.println("Lista de empleados:");
                for (Empleado empleado : listaEmpleados) {
                    empleado.mostrarInformacion();
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción inválida. Por favor ingrese una opción válida.");
            }
        }
    }
}
