public class Deportista{

    String nombre;
    int edad;
    String deporte;
    char sexo;
    String pais;
    
    public Deportista(String nombre, int edad, String deporte, char sexo, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.sexo = sexo;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
