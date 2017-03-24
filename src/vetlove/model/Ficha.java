/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetlove.model;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author MissyM
 */
public class Ficha {
   
    private HashMap <String, Vacina> vacinas;
    private HashMap <String, String> consultas;

    public Ficha(HashMap<String, Vacina> vacinas, HashMap<String, String> consultas) {
        this.vacinas = new HashMap<>();
        this.consultas = new HashMap<>();
    }

    public String getVacinaData(int i) {
        return (String) vacinas.keySet().toArray()[i]; 
    }
    
    public String getVacinaNome(int i) {
        Vacina vacina=(Vacina) vacinas.values().toArray()[i];
        return vacina.getNome(); 
    }
    
    public float getVacinaPreço(int i) {
        Vacina vacina=(Vacina) vacinas.values().toArray()[i];
        return vacina.getPreço(); 
    }
    
    public void setVacinas(String data, Vacina vacina) {        
        vacinas.put(data, vacina);
    }
    
     public HashMap <String, Vacina> getVacinas() {
        return vacinas;
    }

    public HashMap <String, String> getConsultas() {
        return consultas;
    }

    public void setConsultas(HashMap <String, String> consultas) {
        this.consultas = consultas;
    }
}