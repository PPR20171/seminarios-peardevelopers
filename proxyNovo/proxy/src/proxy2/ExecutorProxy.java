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
public class ExecutorProxy implements ExecutorComando{
    
    
   
    
    private ExecutorComando executor;
    private boolean adm;
    private String user;
    private String pass;
    
    public ExecutorProxy(String user, String pass) {
        this.user = user;
        this.pass = pass;
        executor = new Executor();
        verificarConta();
    }
    
    private void verificarConta(){
        if(user.equals("steve") &&  pass.equals("zotac")){
            adm = true;
        }else{
            adm = false;
        }
    }

    @Override
    public void rodarComando(String comando) {
        if(adm){
            executor.rodarComando(comando);
        }else{
            System.out.println("Usuário não possui acesso");
        }
    }
}
