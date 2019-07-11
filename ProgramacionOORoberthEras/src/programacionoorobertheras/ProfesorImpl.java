
package programacionoorobertheras;
public class ProfesorImpl extends HerenciaPersona {
    private String IdProfesorImp1;
    public ProfesorImpl(String nombre, String apellidos, int edad) {
        super( nombre, apellidos, edad);
   IdProfesorImp1="Unknown";}
    public void setIdProfesorImp1(String IdProfesorImp1){this.IdProfesorImp1=IdProfesorImp1;}
    public String gertIdProfesorImp1(){return IdProfesorImp1;}
    public void mostrarNombreApellidoYCarnet(){
        System.out.println("profesor de nombre"+getNombre()+""+getApellido()+"con id del profesor"+getProfesorImp1());}
}