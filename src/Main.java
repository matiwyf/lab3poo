import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ArrayList<PacienteMascota> pacientes = new ArrayList<>();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese nombre de la mascota: ");
        String nombreMascota1 = sc.nextLine();
        System.out.print("Ingrese nombre del dueño: ");
        String nombreDueno1 = sc.nextLine();
        System.out.print("Ingrese nombre de la mascota: ");
        String nombreMascota2 = sc.nextLine();
        System.out.print("Ingrese nombre del dueño: ");
        String nombreDueno2 = sc.nextLine();
        System.out.print("Ingrese nombre de la mascota: ");
        String nombreMascota3 = sc.nextLine();
        System.out.print("Ingrese nombre del dueño: ");
        String nombreDueno3 = sc.nextLine();


        PacienteMascota CANINO = new PacienteMascota(nombreMascota1, Especie.CANINO, 3, nombreDueno1, LocalDate.of(2026,4,15));
        PacienteMascota FELINO = new PacienteMascota(nombreMascota2, Especie.FELINO, 10, nombreDueno2, LocalDate.of(2026,5,10));
        PacienteMascota EXOTICO = new PacienteMascota(nombreMascota3, Especie.EXOTICO, 1, nombreDueno3, LocalDate.of(2026,6,5));

        pacientes.add(CANINO);
        pacientes.add(FELINO);
        pacientes.add(EXOTICO);

        System.out.println(pacientes.toString());

                int opcion;

                do {
                    System.out.println("===== MENÚ PRINCIPAL =====");
                    System.out.println("1. Actualizar nombre de red");
                    System.out.println("2. Listar pacientes");
                    System.out.println("3. Días para vacuna");
                    System.out.println("0. Salir");
                    System.out.print("Seleccione una opción: ");

                    opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el nuevo nombre de la red: ");
                            String nuevoNombre = sc.nextLine();
                            System.out.println("Nombre de red actualizado a: " + nuevoNombre);
                            break;
                        case 2:
                            System.out.println("Listado de pacientes:");
                            System.out.println(pacientes.toString());
                            break;
                        case 3:
                            for (PacienteMascota mascota : pacientes) {
                                System.out.println(mascota.DiasParaVacuna());
                            }
                            break;
                        case 0:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción inválida, intente nuevamente.");
                    }
                    System.out.println();
                } while (opcion != 0);


        }
    }