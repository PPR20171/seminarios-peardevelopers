/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy2;

import java.util.Scanner;

/**
 *
 * @author adriano
 */
public class Cliente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Digite o comando: ");
        String comando = scan.nextLine();
        
        System.out.print("Infome usuario:");   //Entrada de dados
        String usuario = scan.nextLine();
        System.out.println(" ");
        System.out.print("senha: ");
        String senha = scan.nextLine();
        
        
        ExecutorComando exec = new ExecutorProxy(usuario,senha);
        
        exec.rodarComando(comando);
    }
}
