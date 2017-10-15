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
public class ImagemProxy implements ObjetoGrafico{

    private String nome;
    private ObjetoGrafico imagem;
    
    public ImagemProxy(String nome){
        this.nome = nome;
        imagem = null;
    }
    
    @Override
    public ObjetoGrafico getObjeto() {
        if(imagem==null){
            imagem = new Imagem(nome);
        }
        return imagem;
    }

    @Override
    public int getWidth() {
        return getObjeto().getWidth();
    }

    @Override
    public int getHeight() {
        return getObjeto().getHeight();
    }
    
    @Override
    public void show(){
        getObjeto().show();
    }
}
