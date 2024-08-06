public class Principal {
    public static void main(String[] args) throws Exception {

        // - // - // - // Creación de Objetos // - // - // - //

        // nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion, tipoDe(segun tipoDeportista) //

        Gimnasta A = new Gimnasta ("Angel Gabriel", "Barajas Vivas", 100982345, 17, "Gimnasia Artística", 'M', "Colombia", "Plata", 17.33 ,"Barra Fija Masculino");

        //Gimnasta B = new Gimnasta ("Angel Gabriel", "Barajas Vivas", 100982345, 17, "Gimnasia Artística", 'M', "Colombia", "Plata", 17.33 ,"Barra Fija Masculino");


        // - // - // - // Uso de Objetos // - // - // - //

        System.out.println(A.getNombres() + A.getApellidos() + " de " + A.getEdad() + " años de edad logra conseguira la medalla de " + A.getMedalla() + " para " + A.getPais() + " en " + A.getDeporte() + " en la modalidad de " + A.getTipoDeGimnasia() + " con una puntuación de " + A.getPuntuacion() + " puntos.");

        //System.out.println();
    }
}
