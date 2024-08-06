public class Boxeador extends Deportista {
  private String categoriaCompeticion;

    public Boxeador(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo,
            String pais, String medalla, double puntuacion, String categoriaCompeticion) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion);
        this.categoriaCompeticion = categoriaCompeticion;
    }

    public void setCategoriaCompeticion(String categoriaCompeticion) {
        this.categoriaCompeticion = categoriaCompeticion;
    }

    @Override
    public String mostrarDatos(){
        return "Nombre: " + nombres + " Apellidos: " + apellidos + " Numero de identidad: " + numeroDeIdentidad + " Edad: "+ edad+" Deporte: " + deporte+" Sexo: " + sexo + " Pais: " + pais + " Medalla:"+ medalla + " Puntuicaoin: " +  puntuacion + " Categoria de combate: "+ categoriaCompeticion;
    }
}
