/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetlove.model;

import java.util.Date;

/**
 *
 * @author MissyM
 */
public class Animal {
    
    private String nome;        
    private String classificação;
    private String raça;
    private String nascimento;
    private Ficha ficha_animal;

    public Animal(String nome, String classificação, String raça, String nascimento, Ficha ficha_animal) {
        this.nome = nome;
        this.classificação = classificação;
        this.raça = raça;
        this.nascimento = nascimento;
        this.ficha_animal = ficha_animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificação() {
        return classificação;
    }

    public void setClassificação(String classificação) {
        this.classificação = classificação;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Ficha getFicha_animal() {
        return ficha_animal;
    }

    public void setFicha_animal(Ficha ficha_animal) {
        this.ficha_animal = ficha_animal;
    }

    
}
