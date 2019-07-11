
package programacionoorobertheras;
public class HerenciaPersona {
private String nombre;
private String apellido;
private int edad;
private String ProfesorImp1;
private String TestHerencia;

    public String getTestHerencia() {
        return TestHerencia;
    }

    public void setTestHerencia(String TestHerencia) {
        this.TestHerencia = TestHerencia;
    }


    public HerenciaPersona(String ProfesorImp1) {
        this.ProfesorImp1 = ProfesorImp1;
    }

    public String getProfesorImp1() {
        return ProfesorImp1;
    }

    public void setProfesorImp1(String ProfesorImp1) {
        this.ProfesorImp1 = ProfesorImp1;
    }

    public HerenciaPersona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
