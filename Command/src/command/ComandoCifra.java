package command;

public class ComandoCifra extends Command{
 
    private String texto;
    private int chave;
    
    public ComandoCifra(String texto){
        this.texto = texto;
        this.chave = 3;
    }

    @Override
    public void executar() {
        StringBuilder novoTexto = new StringBuilder();
        for(int i = 0; i < texto.length(); i++){
            char caractere = (char) (texto.charAt(i)+ chave);
            novoTexto.append(caractere);
        }
        System.out.println(novoTexto);
    }    
}
