package registroacademico;

public class Maestro extends DatoGeneral{
    private String dui;
    private String grado;
    public Maestro() {
    }

    public Maestro(String nombre, String direccion, String telefono, String email, String dui, String grado) {
        super(nombre, direccion, telefono, email);
        this.dui = dui;
        this.grado = grado;
    }
    public String getDui() {
        return dui;
    }
    public void setDui(String dui) {
        this.dui = dui;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public void pasarlista(){
        System.out.println("El Maestro" + getNombre() + ":");
    }

    @Override
    public void modificar() {
        System.out.println("Modificación de maestro: clase hija");
        System.out.println("Número de DUI: " + dui);
        System.out.println("Grados: " + grado);
    }
    
}
