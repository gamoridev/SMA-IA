package Ambiente;

import Agentes.*;

public class Posicao {

    private boolean planta;
    private Agente agente = null;

    public void setPlanta() {
        this.planta = true;
    }

    public boolean getPlanta() {
        return this.planta;
    }

    public void removerPlanta() {
        this.planta = false;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public Agente getAgente() {
        return this.agente;
    }

}
