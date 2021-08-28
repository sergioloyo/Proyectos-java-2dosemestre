package UMG;

public class Directivo extends empleado {

    public Directivo(String nombre, int salario) {
        super(nombre,salario);
    }

    @Override
    public String toString() {
        return "Director "+super.toString();}

}
