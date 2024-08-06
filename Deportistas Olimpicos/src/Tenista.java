public class Tenista extends Deportista {
    private String tipoCompeticion;

    public Tenista(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo, String pais, String medalla, double puntuacion, String tipoCompeticion) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion);
        this.tipoCompeticion = tipoCompeticion;
    }

    public String gettipoCompeticion() {
        return tipoCompeticion;
    }

    @Override
    public String mostrarDatos(){
        return "Nombre: " + nombres + " Apellidos: " + apellidos + " Numero de identidad: " + numeroDeIdentidad + " Edad: "+ edad+" Deporte: " + deporte+" Sexo: " + sexo + " Pais: " + pais + " Medalla:"+ medalla + " Puntuicaoin: " +  puntuacion + " Tipo de Competencia: "+ tipoCompeticion;
    }
}
