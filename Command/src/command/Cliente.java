package command;

public class Cliente {
 
    public static void main(String[] args){
        
		Command comando = new ComandoCifra("TESTANDO CRIPTOGRAFIA");
        Criptografia cript = new Criptografia(comando);
        cript.criptografar();
       
    }
}