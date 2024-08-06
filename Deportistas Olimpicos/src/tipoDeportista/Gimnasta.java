package tipoDeportista;

import Deportista;

public class Gimnasta extends Deportista {
    
    // - // - // - // Atributos // - // - // - //
    String tipoDeGimnasia;
    int tiempoPromedio;


    // - // - // - // Constructor // - // - // - //
    public Gimnasta(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo, String pais, String tipoDeGimnasia, int tiempoPromedio) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, marcaPersonal);
        this.tipoDeGimnasia = tipoDeGimnasia;
        this.tiempoPromedio = tiempoPromedio;
    }


    // - // - // - // Getters & Setters // - // - // - //
    public String getTipoDeGimnasia() {
        return tipoDeGimnasia;
    }

    public void setTipoDeGimnasia(String tipoDeGimnasia) {
        this.tipoDeGimnasia = tipoDeGimnasia;
    }

    public int getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(int tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }
    
}