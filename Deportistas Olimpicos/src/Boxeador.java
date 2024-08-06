public class Boxeador extends Deportista {
  private String tecnicaDeBoxeo;

    public Boxeador(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo,
            String pais, String medalla, double puntuacion, String tecnicaDeBoxeo) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion);
        this.tecnicaDeBoxeo = tecnicaDeBoxeo;
    }

    public String getTecnicaDeBoxeo() {
        return tecnicaDeBoxeo;
    }

    @Override
    public String mostrarDatos(){
        return "Nombre: " + nombres + " Apellidos: " + apellidos + " Numero de identidad: " + numeroDeIdentidad + " Edad: "+ edad+" Deporte: " + deporte+" Sexo: " + sexo + " Pais: " + pais + " Medalla:"+ medalla + " Puntuicaoin: " +  puntuacion + "Tecnicva"+ tecnicaDeBoxeo;
    }
}
