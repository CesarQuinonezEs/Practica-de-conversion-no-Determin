/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicas;

import java.util.ArrayList;

/**
 *
 * @author cesar
 */
public class convertidor {
    String estadoAC, est0, est1, esI, esA;
    int flagCon;
    
    public convertidor(String auxAc, String auxest0,String auxest1, String auxesI,String auxesA){
        estadoAC = auxAc;
        est0 = auxest0;
        est1 = auxest1;
        esI = auxesI;
        esA = auxesA;
        flagCon = 0;
        
    }
    public String flagInicial(){
        //System.out.println("llegue al inicial, es:" + estadoAC + "es :" +esI);
        return esI;
    }

    public String getEstadoAC() {
        return estadoAC;
    }

    public String getEst1() {
        return est1;
    }

    public String getEsI() {
        return esI;
    }

    public String getEsA() {
        return esA;
    }
    
    public String ingreando1(){
    return est1; 
    }
    
     public String ingreando0(){
    return est0; 
    }
    
     public int getFlagCon(){
         return flagCon;
     }
   /* public Object convirtiendo(){
    
    }*/
}
