public class Deportista{

    // - // - // - // Atributos // - // - // - //
    String nombres;
    String apellidos;
    int numeroDeIdentidad;
    int edad;
    String deporte;
    char sexo;
    String pais;
    int marcaPersonal;
    

    // - // - // - // Constructor // - // - // - //
    public Deportista(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo, String pais) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroDeIdentidad = numeroDeIdentidad;
        this.edad = edad;
        this.deporte = deporte;
        this.sexo = sexo;
        this.pais = pais;
    }


    // - // - // - // Getters & Setters // - // - // - //
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroDeIdentidad() {
        return numeroDeIdentidad;
    }

    public void setNumeroDeIdentidad(int numeroDeIdentidad) {
        this.numeroDeIdentidad = numeroDeIdentidad;
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

    public int getMarcaPersonal() {
        return marcaPersonal;
    }

    public void setMarcaPersonal(int marcaPersonal) {
        this.marcaPersonal = marcaPersonal;
    }

}
