/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetlove.controller;

import java.util.ArrayList;
import java.util.Scanner;
import vetlove.model.Cliente;
import static vetlove.main.MockupData.clinica;

/**
 *
 * @author MissyM
 */
public class ClienteController {
    
    
    
    public void iniciaCliente(){
        
        Cliente cliente=new Cliente(0, null, null, null, 0, null);
        
        cliente.setId_cliente(clinica.size()); 
        
        System.out.println("Indique NOME de novo cliente:");
        cliente.setNome(new Scanner(System.in).nextLine()); 
        
        System.out.println("Indique MORADA de novo cliente:");
        cliente.setMorada(new Scanner(System.in).nextLine()); 
        
        System.out.println("Indique EMAIL de novo cliente:");
        cliente.setEmail(new Scanner(System.in).nextLine()); 
        
        System.out.println("Indique TELEFONE de novo cliente:");
        cliente.setNome(new Scanner(System.in).nextLine()); 
        
        AnimalController animais= new AnimalController();
        
        cliente.setAnimais(animais.iniciaAnimal()); 
        
        clinica.add(cliente);
    }
    
    public Cliente pesquisaCliente(int id_cliente){ 
        
        for(int i=0; i<clinica.size(); i++){
            if(clinica.get(i).getId_cliente() == id_cliente){
                return clinica.get(i); }}
        return null;
    }
    
    public void listarCliente(ArrayList<Cliente> clinica){
        for(int i=0; i<clinica.size(); i++){
            System.out.println("NOME................" + clinica.get(i).getNome());
            System.out.println("MORADA.............." + clinica.get(i).getNome());
            System.out.println("TELEFONE............" + clinica.get(i).getTelefone());}}
    
}
