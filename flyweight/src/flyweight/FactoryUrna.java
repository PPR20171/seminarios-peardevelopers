/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 * Classe responsável pelo gerenciamento da instância do objeto urna
 * @author Usuário
 */
public class FactoryUrna{

    private Urna urna;
    
    public Urna criar() {
        if (urna == null){
            urna = new Urna();
        }
        return urna;
    }
}