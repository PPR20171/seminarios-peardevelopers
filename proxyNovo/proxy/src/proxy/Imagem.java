/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author adriano
 */
public class Imagem implements ObjetoGrafico{

    private Icon imagem;
    private String nome;
    
    public Imagem(String nome){
        this.nome = nome;
        imagem = new ImageIcon(nome);
        System.out.printf("Imagem %s sendo criada agora.... \n ", nome);
    }

    @Override
    public ObjetoGrafico getObjeto() {
        return this;
    }

    @Override
    public int getWidth() {
        return imagem.getIconWidth();
    }

    @Override
    public int getHeight() {
        return imagem.getIconHeight();
    }
    
    @Override
    public void show(){
        System.out.println("Exibindo a imagem "+nome);
    }
}
