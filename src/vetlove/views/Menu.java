/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetlove.views;

import java.util.Scanner;
import vetlove.controller.*;
import static vetlove.main.MockupData.clinica;
/**
 *
 * @author MissyM
 */
public class Menu {
    
    public Menu(){
    
    int opt=0;
    
    do{
    
        System.out.println("<----------------MENU----------------->");
        System.out.println("1 - Inserir novo cliente\n2 - Listar clientes\n3 - Pesquisar cliente\n4 - Registar vacina\n5 - Verificar gastos\n0 - SAIR");
        opt=new Scanner(System.in).nextInt(); 
        ClienteController cc=new ClienteController();
        AnimalController ac=new AnimalController();
        FichaController fc=new FichaController();
        
        switch(opt){
            case 1: cc.iniciaCliente();
                break;
            case 2: cc.listarCliente(clinica);
                break;
            case 3: System.out.println("Indique o ID do cliente a pesquisar");
                    int y=new Scanner(System.in).nextInt();
                    System.out.println("NOME.............." + cc.pesquisaCliente(y).getNome());
                    System.out.println("MORADA.............." + cc.pesquisaCliente(y).getMorada());
                    System.out.println("TELEFONE............" + cc.pesquisaCliente(y).getTelefone());
                break;
            case 4:System.out.println("Indique o ID do cliente");
                    y=new Scanner(System.in).nextInt();                  
                   System.out.println("Indique o Nome do Animal");
                   fc.registaVacina(ac.pesquisaAnimal( cc.pesquisaCliente(y), new Scanner(System.in).next()));                   
                break;
            case 5:System.out.println("Indique o ID do cliente");
                   y=new Scanner(System.in).nextInt();
                   System.out.println("Montante total gasto em vacinas com todos os animais " + fc.totalVacinas(cc.pesquisaCliente(y)));
                break;
            default:
                break;}
}while(opt != 0);
        
    
}
    
}