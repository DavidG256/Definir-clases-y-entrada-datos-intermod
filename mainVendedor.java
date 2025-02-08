import java.util.Scanner;

class mainVendedor {
    // David García Antón
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese ID del Vendedor: ");
            String id = scanner.next();

            System.out.print("¿Es jefe? true o false: ");
            boolean esJefe = scanner.nextBoolean();

            System.out.print("Ingrese el Salario: ");
            int salario = scanner.nextInt();

            System.out.print("Ingrese Jornada Laboral: ");
            String jornada = scanner.next();

            Vendedor vendedor = new Vendedor(id, esJefe, salario, jornada);
            vendedor.mostrarVendedor();

        } catch (IllegalArgumentException e) {
            System.out.println("Error en la entrada de datos:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
