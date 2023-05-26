package prypautaev1;

public class Poliza {

    private String nombre;
    private Double precio;
    private String tipo;
    private Cliente cliente;

    public Poliza() {
        cliente = new Cliente();
    }

    public Poliza(String nombre, Double precio, String tipo, Cliente cliente) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            this.nombre = null;
            System.out.println("Nombre no puede estar vacio");
        }
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return cliente.toString() + "\n Poliza{" + "nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", cliente=" + cliente + '}';
    }

    //dpendiendo del cliente y del tipo de seguro. 
    //Si el cliente es nuevo o el 
    // precio de la póliza es mayor o igual a 5.25 UF, 
    // se aplicará un descuento de 10%.
    public double descuento() {
        double descto = 0;
        if (this.precio >= 5.25 || cliente.getTipo() == 'N') {
            descto = precio * 0.1;
        }
        return descto;
    }

    //si el cliente tiene 70 o más años 
    // el precio de la póliza aumenta en un 25%
    public double recargo() {
        double aumento = 0;
        if (cliente.getEdad() >= 70) {
            aumento = precio * 0.25;
        }
        return aumento;
    }

    public String info() {
        double total = precio - descuento() + recargo();
        String info = "INFORMACIÓN POLIZA \n";
        info += "------------------ \n";
        info += this.toString() + "\n";
        info += "Precio póliza en UF : " + precio + "\n";
        info += "Descuento por tipo en UF : " + this.descuento()+ "\n";
        info += "Recargo por edad en UF : " + this.recargo() + "\n";
        info += "--------------------------------------- \n";
        info += "Total a pagar : " + total + "\n";
        info += "#########################################\n";
        return info;
    }

}
