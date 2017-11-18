/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Usuário
 */
public class Urna {
    
    private Icon imagem;
    
    public Urna(){
        File file = new File("imagens//imagem.jpg");
        imagem = new ImageIcon(file.getPath());
    }
    
    public void imprimirLocalizacao(Localizacao localizacao){
        System.out.println("Coordenadas da urna: x: "+localizacao.getX()+" y: "+localizacao.getY());
    }
    
    public Icon getImagem(){
        return imagem;
    }
}
