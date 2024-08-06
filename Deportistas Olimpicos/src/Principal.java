public class Principal {
    public static void main(String[] args) {

        // - // - // - // Creación de Objetos // - // - // - //

        // nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion, tipoDe(segun tipoDeportista) //

        Gimnasta A = new Gimnasta ("Angel Gabriel", "Barajas Vivas", 100982345, 17, "Gimnasia Artística", 'M', "Colombia", "Plata", 14.533 ,"Barra Fija Masculino");

        Nadador B = new Nadador ("Sarah Frederica", "Sjöström", 90723435, 30, "Natación", 'F', "Suecia", "Oro", 23.71 ,"50m Estilo Libre Femenino");

        // Si no estoy mal asi es el poliformismo crear objeto deportista, ya lo arregle
        Deportista C = new Tenista("María Camila", "Osorio Serrano", 199078122, 22, "Tenis", 'F',"Colombia", "No gano medallas", 84 , "Individual Femenino");

        Deportista D = new Boxeador("Lewis", "Richardson", 890039193, 27, "Boxeo", 'M', "Inglaterra", "Bronce", 3.181, "Peso wélter masculino");


        // - // - // - // Uso de Objetos // - // - // - //

        System.out.println("\n" + A.getNombres() + " " + A.getApellidos() + " de " + A.getEdad() + " años de edad logra conseguir la medalla de " + A.getMedalla() + " para " + A.getPais() + " en “" + A.getDeporte() + "“ en la modalidad de “" + A.getTipoDeGimnasia() + "“ con una puntuación de " + A.getPuntuacion() + " puntos.");

        System.out.println("\n" + B.getNombres() + " " + B.getApellidos() + " de " + B.getEdad() + " años de edad logra conseguir la medalla de " + B.getMedalla() + " para " + B.getPais() + " en “" + B.getDeporte() + "“ en la modalidad de “" + B.getTipoDeNatación() + "“ con una puntuación de " + B.getPuntuacion() + " segundos.");

        //Llamo a mostrar datos en lugar de muchos prints
        System.out.println(C.mostrarDatos());

        System.out.println(D.mostrarDatos());

    }
}
