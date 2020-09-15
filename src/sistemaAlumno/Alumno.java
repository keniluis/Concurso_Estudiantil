package sistemaAlumno;


public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private String grupo;
     private int Clave_estudiante;
     private String Num_Concurso;
   
   
    //Constructor por defecto
    Alumno(){
        
    this.Clave_estudiante=0;
    this.nombre="";
    this.apellido="";
    this.edad=0;
    this.grupo="";
    this.Num_Concurso="";

    }
    
    public int getClave_estudiante() {
        return Clave_estudiante;
    }

    public void setClave_estudiante(int Clave_estudiante) {
        this.Clave_estudiante = Clave_estudiante;
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


   
   public String getGrupo() {
        return grupo;
    }
   
    public void setGrupo(String grupo) {
        this.grupo = grupo;
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
