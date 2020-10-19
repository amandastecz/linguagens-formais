/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagensformais;

import linguagensformais.interfaceUser.PainelInteracao;

/**
 *
 * @author JF
 */
public class GerenciadorAutomato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] vEstados = {{"e0", "*"},{"e1","0"},{"e2","0"},{"e3","1"},{"e4","0"},{"e5","1"},{"e6","0"},{"e7","0"},{"e8","0"},{"e9","0"},{"e10","0"},{"e11","0"}};
        char[] vAlfabet = {'a','b','c','d'};
        String[][] mMatrizTrans = {{"e1","e6"," ","e5"},{"e0","e2"," "," "},{" "," ", " e3", " "},{" ","e11"," ","e4"},{" ", " ", " ", " e5"},
                {" ", " ", " ", "e4"},{" ", " ", "e7", " "},{" ","e8", " ", " "},{" ", " ", "e9", " "},{" ", "e6", " ","e5"},
                {" ", "e2", " ", " "},{" ", " ","e10", " " }};
    //new char[11][4];
        
        PainelInteracao painel = new PainelInteracao(mMatrizTrans,vEstados,vAlfabet);
        painel.iniciar();
    }
    
}
