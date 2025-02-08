import java.util.Scanner;

import java.util.Scanner;

// David García Antón
public class Vendedor {
    private String idVendedor;
    private boolean esJefe;
    private int salario;
    private String jornadaLaboral;

    public Vendedor(String idVendedor, boolean esJefe, int salario, String jornadaLaboral) {
        setIdVendedor(idVendedor);
        this.esJefe = esJefe;
        setSalario(salario);
        setJornadaLaboral(jornadaLaboral);
    }


    public String getIdVendedor() {
        return idVendedor;
    }

    public boolean getEsJefe() {
        return esJefe;
    }

    public int getSalario() {
        return salario;
    }

    public String getJornadaLaboral() {
        return jornadaLaboral;
    }

    public void setIdVendedor(String idVendedor) {
        if (idVendedor != null && idVendedor.length() <= 9) {
            this.idVendedor = idVendedor;
        } else {
            throw new IllegalArgumentException("ID de Vendedor inválido. Máximo 9 caracteres.");
        }
    }

    public void setEsJefe(boolean esJefe) {
        this.esJefe = esJefe;
    }


//En el diccionario de datos, tenemos Salario como Varchar, pero lo hemos cambiado a Int, ya que usar un String no era práctico.
    public void setSalario(int salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Salario inválido. No puede ser negativo.");
        }
    }


    public void setJornadaLaboral(String jornadaLaboral) {
        if (jornadaLaboral != null && jornadaLaboral.length() <= 10) {
            this.jornadaLaboral = jornadaLaboral;
        } else {
            throw new IllegalArgumentException("Jornada laboral inválida. Máximo 10 caracteres.");
        }
    }

    public void mostrarVendedor() {
        System.out.println("Vendedor creado:");
        System.out.println("IDVendedor: " + idVendedor);
        System.out.println("Es Jefe: " + esJefe);
        System.out.println("Salario: " + salario);
        System.out.println("Jornada Laboral: " + jornadaLaboral);
    }
}