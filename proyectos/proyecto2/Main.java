import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Descifrador d = new Descifrador();
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. descifraNulo");
            System.out.println("2. descifraNulo");
            System.out.println("3. contieneNombre");
            System.out.println("4. descifraPalabrasMarcadas");
            System.out.println("5. descifraLetrasMarcadas");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            String original, mensaje, nombre, m, e;
            int n;

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el mensaje original: ");
                    original = sc.nextLine();
                    System.out.print("Ingresa el valor de n: ");
                    n = sc.nextInt();
                    System.out.println("Resultado: " + d.descifraNulo(original, n));
                    break;
                case 2:
                    System.out.print("Ingresa el mensaje original con espacios al final: ");
                    original = sc.nextLine();
                    System.out.println("Resultado: " + d.descifraNulo(original));
                    break;
                case 3:
                    System.out.print("Ingresa el mensaje: ");
                    mensaje = sc.nextLine();
                    System.out.print("Ingresa el nombre a buscar: ");
                    nombre = sc.nextLine();
                    System.out.println("¿Está el nombre? " + d.contieneNombre(mensaje, nombre));
                    break;
                case 4:
                    System.out.print("Ingresa el primer texto (m): ");
                    m = sc.nextLine();
                    System.out.print("Ingresa el segundo texto con palabras especiales (e): ");
                    e = sc.nextLine();
                    System.out.println("Mensaje oculto: " + d.descifraPalabrasMarcadas(m, e));
                    break;
                case 5:
                    System.out.print("Ingresa el primer texto (m): ");
                    m = sc.nextLine();
                    System.out.print("Ingresa el segundo texto con letras especiales (e): ");
                    e = sc.nextLine();
                    System.out.println("Mensaje oculto: " + d.descifraLetrasMarcadas(m, e));
                    break;
                case 6:
                    System.out.println("Adiós.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
