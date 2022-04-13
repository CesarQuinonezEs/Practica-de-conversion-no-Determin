package logicas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class guardarEsta {
    String estadoAc, estado0, estado1;
    int inicial, aceptador;
    
    public guardarEsta (String estadoAux, String estadoAux0, String estadoAux1,int inicalAux, int aceptadorAux){
        estadoAc = estadoAux;
        estado0 = estadoAux0;
        estado1 = estadoAux1;
        inicial = inicalAux;
        aceptador = aceptadorAux;
    }
   public void guardar(String estadoAux, String estadoAux0, String estadoAux1,int inicalAux, int aceptadorAux){
        estadoAc = estadoAux;
        estado0 = estadoAux0;
        estado1 = estadoAux1;
        inicial = inicalAux;
        aceptador = aceptadorAux;
    }
    public String getEstadoAc(){
    return estadoAc;
    }
    public String getEstado0(){
    return estado0;
    }
    public String getEstado1(){
    return estado1;
    }
    public int getInicial(){
       return inicial;
     }
    public int getAceptador(){
    return aceptador;
    }
}


