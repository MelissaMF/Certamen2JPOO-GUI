package prypautaev1;

public class Cliente {
    // nombre completo, rut, tipoCliente, edad
    private String nombre;
    private String rut;
    private char tipo;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String rut, char tipo, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            this.nombre = null;
            System.out.println("Nombre no puede estar vacio");
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        if(tipo == 'N' || tipo == 'A') {
            this.tipo = tipo;
        } else {
            this.tipo = 'N';
            System.out.println("Error, tipo N/A");
        }     
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 18) {
            this.edad = edad;
        } else {
            this.edad = 0;
            System.out.println("Error, edad debe ser >= 18");
        }      
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", rut=" + rut + ", tipo=" + tipo + ", edad=" + edad + '}';
    }
    
}
