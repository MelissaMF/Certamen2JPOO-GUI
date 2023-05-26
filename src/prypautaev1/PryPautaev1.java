package prypautaev1;

public class PryPautaev1 {

    public static void main(String[] args) {
        Cliente c = new Cliente("PANCHO PISTOLAS", "111-1", 'A', 76);
        Poliza p = new Poliza();
        p.setCliente(c);
        p.setNombre("A TU SALUD");
        p.setPrecio(4.0);
        p.setTipo("SALUD");
        p.info();
    }
    
}
