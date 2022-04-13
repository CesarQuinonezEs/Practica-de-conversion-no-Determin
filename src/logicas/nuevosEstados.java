/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicas;

/**
 *
 * @author cesar
 */
public class nuevosEstados {
    String estadoAc, estado0, estado1, esI, esA;
    int flagCheck;

    public nuevosEstados() {
        esI = "0";
        esA = "0";
        flagCheck = 0;      
    }

    public String getEstadoAc() {
        return estadoAc;
    }

    public String getEstado0() {
        return estado0;
    }

    public String getEstado1() {
        return estado1;
    }

    public String getEsI() {
        return esI;
    }

    public String getEsA() {
        return esA;
    }

    public int getFlagCheck() {
        return flagCheck;
    }

    public void setEstadoAc(String estadoAc) {
        this.estadoAc = estadoAc;
    }

    public void setEstado0(String estado0) {
        this.estado0 = estado0;
    }

    public void setEstado1(String estado1) {
        this.estado1 = estado1;
    }

    public void setEsI(String esI) {
        this.esI = esI;
    }

    public void setEsA(String esA) {
        this.esA = esA;
    }

    public void setFlagCheck(int flagCheck) {
        this.flagCheck = flagCheck;
    }
    
}
