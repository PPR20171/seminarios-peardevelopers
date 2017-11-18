package command;


public class ComandoReplace extends Command {

    private String texto;

    public ComandoReplace(String texto) {
        this.texto = texto;
    }

    @Override
    public void executar() {
        texto = texto.replace("n", "a");
        System.out.println(texto);
    }
}
