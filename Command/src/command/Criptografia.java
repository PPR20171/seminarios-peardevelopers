package command;

public class Criptografia {
 
    private Command comando;
    
    public Criptografia(Command comando){
        this.comando = comando;
    }
    public void criptografar(){
        comando.executar();
    }
}
