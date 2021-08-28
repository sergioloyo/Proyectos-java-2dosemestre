package UMG;

public class empleado {
    private String nombre;
    private int salario;

    public empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
