/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetlove.controller;

import java.util.Scanner;
import vetlove.model.Animal;
import vetlove.model.Cliente;
import vetlove.model.Vacina;

/**
 *
 * @author MissyM
 */
public class FichaController {
    
    public FichaController(){
        
    }
    
    public void registaVacina(Animal animal){
        
        Vacina vacina=new Vacina(null, 0); 
        
        System.out.println("Indique NOME da vacina:");
        vacina.setNome(new Scanner(System.in).nextLine()); 
         
        System.out.println("Indique PREÇO da vacina:");
        vacina.setPreço(new Scanner(System.in).nextFloat());
             
        System.out.println("Indique DATA da vacina:");
        String x=new Scanner(System.in).next();
        animal.getFicha_animal().setVacinas(x , vacina); 
    }
    
    public float totalVacinas(Cliente cliente){
        
    float total=0;
    
          for(int i=0; i<cliente.getAnimais().size(); i++){
              for(int j=0; j<cliente.getAnimal(i).getFicha_animal().getVacinas().size(); j++){
              total+=cliente.getAnimal(i).getFicha_animal().getVacinaPreço(j);}}
        
        return total;        
    }
}

