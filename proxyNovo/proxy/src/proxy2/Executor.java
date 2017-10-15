/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy2;

/**
 *
 * @author adriano
 */
public class Executor implements ExecutorComando {

    @Override
    public void rodarComando(String comando) {
           System.out.printf("Comando: %s executado \n", comando);
    }

    public Executor() {
    
   
    }
    
}
