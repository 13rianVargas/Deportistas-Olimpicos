public class Tenista extends Deportista {
    private String estiloJuego;

    public Tenista(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo, String pais, String medalla, double puntuacion, String estiloJuego) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion);
        this.estiloJuego = estiloJuego;
    }

    public String getEstiloJuego() {
        return estiloJuego;
    }

    @Override
    public String mostrarDatos(){
        return "Nombre: " + nombres + " Apellidos: " + apellidos + " Numero de identidad: " + numeroDeIdentidad + " Edad: "+ edad+" Deporte: " + deporte+" Sexo: " + sexo + " Pais: " + pais + " Medalla:"+ medalla + " Puntuicaoin: " +  puntuacion + "Estilo de juego:"+ estiloJuego;
    }
}
