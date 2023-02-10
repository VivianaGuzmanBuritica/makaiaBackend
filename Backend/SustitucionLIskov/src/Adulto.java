public class Adulto extends Persona{
    private int dni;

    public Adulto(String nombre, String apellido, int dni) {
        super(nombre, apellido);
        this.dni = dni;
    }


    public String pagar(){
       return "Pagado";
    }
}
