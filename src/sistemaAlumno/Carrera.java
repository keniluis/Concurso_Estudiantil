/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaAlumno;


public class Carrera {
    private int Clave_carrera;
    private String Nombre;
    private int CantidadSemestres;
    
    
    Carrera(){
      this.Clave_carrera=0;
      this.Nombre="";
      this.CantidadSemestres=0;
    }

    public int getClave_carrera() {
        return Clave_carrera;
    }

    public void setClave_carrera(int Clave_carrera) {
        this.Clave_carrera = Clave_carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidadSemestres() {
        return CantidadSemestres;
    }

    public void setCantidadSemestres(int CantidadSemestres) {
        this.CantidadSemestres = CantidadSemestres;
    }
    
    
}
