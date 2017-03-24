/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetlove.controller;

import java.util.Scanner;
import vetlove.model.Animal;
import vetlove.model.Cliente;
import vetlove.model.Ficha;

/**
 *
 * @author MissyM
 */
public class AnimalController {
    
      public Animal iniciaAnimal(){
          
        Animal animal=new Animal(null, null, null, null, null);
          
        System.out.println("Indique NOME de novo animal:");
        animal.setNome(new Scanner(System.in).nextLine()); 
        
        System.out.println("Indique CLASSIFICAÇÃO de novo animal:");
        animal.setClassificação(new Scanner(System.in).nextLine()); 
        
        System.out.println("Indique RAÇA de novo animal:");
        animal.setRaça(new Scanner(System.in).nextLine()); 
        
        System.out.println("Indique DATA DE NASCIMENTO de novo animal:");
        animal.setNascimento(new Scanner(System.in).nextLine()); 
        
        Ficha fichaAnimal=new Ficha(null, null);
        animal.setFicha_animal(fichaAnimal);
        
        return animal;
        
        
    }
      
      public Animal pesquisaAnimal(Cliente cliente, String nome){ 
        
        for(int i=0; i<cliente.getAnimais().size(); i++){
            if(cliente.getAnimais().get(i).getNome().equals(nome)){
                return cliente.getAnimais().get(i); }}
        
        return null;
    }
    
}
