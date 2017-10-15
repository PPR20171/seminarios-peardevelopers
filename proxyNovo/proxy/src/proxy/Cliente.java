/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author adriano
 */
public class Cliente {
    
    public static void main(String[] args){
        
        ObjetoGrafico imagem = new ImagemProxy("imagem.jpg");
        ObjetoGrafico imagem2 = new ImagemProxy("imagem2.jpg");
        ObjetoGrafico imagem3 = new ImagemProxy("imagem3.jpg");
        ObjetoGrafico imagem4 = new ImagemProxy("imagem4.jpg");
        imagem.show();
    }
}
