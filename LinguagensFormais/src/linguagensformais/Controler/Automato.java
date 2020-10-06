/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagensformais.Controler;

/**
 *
 * @author JF
 */
public class Automato {

    char[][] aEstados;
    char[] aEstadosFinais;

    public Automato(char[][] matrizTransicao, char[] matrizEstFinais) {
        this.aEstados = matrizTransicao;
        this.aEstadosFinais = matrizEstFinais;

    }

    public String automatoExecute(String cSentenca) {
        String cRetorno = "";
        char simbolo = ' ';
        int estado = 0;
        int nPos = 0;
        int nOld = 0;
        
        
        
        for(int index = 0; index < cSentenca.length(); index ++){
            simbolo = cSentenca.charAt(index);
            nOld = nPos;
            for(int i = 0; i< aEstados[0].length; i++){
                if (aEstados[0][i] == simbolo){
                    nPos = i;
                    break;
                }
            }
            if (nPos != nOld){
                estado = aEstados[estado][nPos];
            }
            else{
                estado = aEstados.length -1;
                cRetorno = "ERRO simbolo inválido";
            }
        }
        if (aEstadosFinais[estado] == 1){
            cRetorno = "Sentença válida";
        }else if(cRetorno.length() == 0){
            cRetorno = "ERRO setença inválida";
        }
        
        

        return cRetorno;
    }

}
