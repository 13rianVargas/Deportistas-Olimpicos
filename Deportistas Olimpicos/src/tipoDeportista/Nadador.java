package tipoDeportista;

import Deportista;

public class Nadador extends Deportista {
    
    // - // - // - // Atributos // - // - // - //
    String tipoDeNatación;
    int velocidadPromedio;


    // - // - // - // Constructor // - // - // - //
    public Nadador(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo, String pais, String tipoDeNatación, int velocidadPromedio) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, marcaPersonal);
        this.tipoDeNatación = tipoDeNatación;
        this.velocidadPromedio = velocidadPromedio;
    }


    // - // - // - // Getters & Setters // - // - // - //
    public String getTipoDeNatación() {
        return tipoDeNatación;
    }

    public void setTipoDeNatación(String tipoDeNatación) {
        this.tipoDeNatación = tipoDeNatación;
    }

    public int getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(int velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

}