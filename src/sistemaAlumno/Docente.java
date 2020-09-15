package sistemaAlumno;


public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String Asignatura;
     private int Clave_docente;
      private String Num_Concurso;
   
   
    //Constructor por defecto
    Docente(){
        
    this.Clave_docente=0;
    this.nombre="";
    this.apellido="";
    this.edad=0;
    this.Asignatura="";
    this.Num_Concurso="";
    }
    
    public int getClave_docente() {
        return Clave_docente;
    }

    public void setClave_docente(int Clave_docente) {
        this.Clave_docente = Clave_docente;
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


   
   public String getAsignatura() {
        return Asignatura;
    }
   
    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public String getNum_Concurso() {
        return Num_Concurso;
    }

    public void setNum_Concurso(String Num_Concurso) {
        this.Num_Concurso = Num_Concurso;
    }  
    
    public String toString(){
        return nombre;
    }
    
}
