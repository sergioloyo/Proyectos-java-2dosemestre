package UMG;

public class Operativo extends empleado {

    public Operativo(String nombre, int salario) {
        super(nombre,salario);
    }

    @Override
    public String toString() {
        return "Operativo "+super.toString();
    }
}
