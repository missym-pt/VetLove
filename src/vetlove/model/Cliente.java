/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetlove.model;

import java.util.ArrayList;

/**
 * Complicomtro.off()
 * @author MissyM
 */
public class Cliente {
    
    private int id_cliente;
    private String nome;
    private String morada;
    private String email;
    private int telefone;
    private ArrayList<Animal> animais;

    public Cliente(int id_cliente, String nome, String morada, String email, int telefone, ArrayList<Animal> animais) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.telefone = telefone;
        this.animais = new ArrayList<Animal> ();
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Animal getAnimal(int i) {
        return animais.get(i);
    }
    
     public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(Animal animal) {
        animais.add(animal);
    }

   
    
}
