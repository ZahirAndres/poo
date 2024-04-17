package mx.utng.sesion8;
//Zahir Andrés Rodríguez Mora GDS0622
public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;
//bloque de inicializacion
    {
curso ="Programación Orientada a Objetos";
sesion = 8;
objetivo = "Bloques de inicialización";
    }
    {
        curso ="Base de datos";
    }

    public String getCurso() {
        return curso;
    }
    public byte getSesion() {
        return sesion;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

   
}
