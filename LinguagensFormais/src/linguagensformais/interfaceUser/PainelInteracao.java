/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagensformais.interfaceUser;

import linguagensformais.Controler.Automato;

/**
 *
 * @author JF
 */
public class PainelInteracao extends javax.swing.JFrame {
    Automato automato;
    String cText;
    String cSentenca = "";
    String cRetorno = "";
    /**
     * Creates new form PainelInteracao
     */
    public PainelInteracao(String mMatrizTrns[][], String mMatrizEstFin[][], char vAlfabeto[]) {
        this.automato = new Automato(mMatrizTrns, mMatrizEstFin, vAlfabeto);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sTextSaida = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sTextSentenca = new javax.swing.JTextArea();
        bAnalise = new javax.swing.JButton();
        bLimpa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sTextSaida.setColumns(20);
        sTextSaida.setRows(5);
        jScrollPane1.setViewportView(sTextSaida);

        sTextSentenca.setColumns(20);
        sTextSentenca.setRows(5);
        jScrollPane2.setViewportView(sTextSentenca);

        bAnalise.setText("Analisar");
        bAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnaliseActionPerformed(evt);
            }
        });

        bLimpa.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAnalise)
                        .addGap(38, 38, 38)
                        .addComponent(bLimpa))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAnalise)
                    .addComponent(bLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iniciar(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }
    private void bAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnaliseActionPerformed
        this.cText = sTextSentenca.getText();
        int cont = 0;
        if (cText.length() == 0){
            cRetorno = "Informe alguma sentença.";
        }
        for( char cChar : cText.toCharArray()){
            if (cChar == ' ' || cChar == '\n' || cChar == '\t'|| cont == cText.length()-1){     
                if (cont == cText.length()-1){
                    cSentenca += cChar;
                    cRetorno += automato.automatoExecute(cSentenca)+"\n";
                    cSentenca = "";
                }else{
                    cRetorno += automato.automatoExecute(cSentenca)+"\n";
                    cSentenca = "";
                }
                
            }else{
                cSentenca += cChar;
            }
            cont ++;
        }
        sTextSaida.setText(cRetorno);
    }//GEN-LAST:event_bAnaliseActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnalise;
    private javax.swing.JButton bLimpa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea sTextSaida;
    private javax.swing.JTextArea sTextSentenca;
    // End of variables declaration//GEN-END:variables
}
