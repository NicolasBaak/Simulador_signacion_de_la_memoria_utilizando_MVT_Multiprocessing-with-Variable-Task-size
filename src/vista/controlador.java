/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.DefaultTableModel;
import modelo.listaDoble;
import controlador.mvt;
public class controlador extends javax.swing.JFrame {
    
    int TiempoTotal = 0;
    int numeroPasos = 0;
    DefaultTableModel tal;
    DefaultTableModel tp;
    DefaultTableModel aux;
    listaDoble listaDoble = new listaDoble();
     
    /**
     * Creates new form vista_principal
     */
    public void tabla() {
        String cabecera[] = {"Numero","Localidad", "Tamaño", "Estado"};
        tal = new DefaultTableModel(null, cabecera);
        jTableTal.setModel(tal);
        
        String cabecera2[] = {"Numero","Localidad", "Tamaño", "Estado", "Proceso"};
        tp = new DefaultTableModel(null, cabecera2);
        jTableTp.setModel(tp);
        
    }
    
    public controlador() {
        initComponents();
        tabla();
        TiempoTotal = DuracionTotal();
        obtenerDatosTablaPrincipal();
       
        this.setLocationRelativeTo(null);
        
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
        jTablePrincipal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTal = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTp = new javax.swing.JTable();
        jButtonPaso = new javax.swing.JButton();
        jLabelMvt = new javax.swing.JLabel();
        jLabelTal = new javax.swing.JLabel();
        jLabelTp = new javax.swing.JLabel();
        jScrollPaneGraficos = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablePrincipal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "8", "1", "7"},
                {"B", "14", "2", "7"},
                {"C", "18", "3", "4"},
                {"D", "6", "4", "6"},
                {"E", "14", "5", "5"}
            },
            new String [] {
                "Proceso", "Tamaño", "Tiempo de llegada", "Title 4Duración (Tiempo en que finaliza)"
            }
        ));
        jScrollPane1.setViewportView(jTablePrincipal);

        jTableTal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableTal);

        jTableTp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableTp);

        jButtonPaso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonPaso.setText("Empezar");
        jButtonPaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasoActionPerformed(evt);
            }
        });

        jLabelMvt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelMvt.setText("SIMULACIÓN DE ASIGNACIÓN DE MEMORIA CON MVT");

        jLabelTal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTal.setText("Tabla Áreas Libres (TAL[ ] )");

        jLabelTp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTp.setText("Tabla Particiones (TP[ ] )");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelTal)
                                                .addGap(136, 136, 136))
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(166, 166, 166))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelTp)
                                        .addGap(142, 142, 142)))
                                .addComponent(jScrollPaneGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMvt, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelMvt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTp)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasoActionPerformed
       int aux = 0;
        if(TiempoTotal > 0){
        numeroPasos++;    
        jButtonPaso.setText("Paso "+numeroPasos);
        
         mvt n = new mvt(listaDoble);
      
         n.mvt();
         
         //insertarDatoTablaTal(n.getTal(), aux);
         aux++;
        TiempoTotal--;   
        
        }else if(TiempoTotal == 0){
         jButtonPaso.setText("Terminado");
         TiempoTotal--;
        }        
        else{
        System.exit(0);
        }
    }//GEN-LAST:event_jButtonPasoActionPerformed
    
    
//Obtengo los valores de la tabla principal
    public void obtenerDatosTablaPrincipal(){
     //System.out.println("\t Nombre \t tama \t tiempoLlegada \t Duracion \n\n");       
    int totalDatos = jTablePrincipal.getRowCount();
            for(int i = 0; i < totalDatos; i++){
                String nombre = jTablePrincipal.getValueAt(i, 0).toString();
                int tama = Integer.parseInt(jTablePrincipal.getValueAt(i, 1).toString());
                int tiempoLlegada = Integer.parseInt(jTablePrincipal.getValueAt(i, 2).toString());
                int duracion = Integer.parseInt(jTablePrincipal.getValueAt(i, 3).toString());
                //System.out.println("\t"+ nombre +"\t"+ tama +"\t" + tiempoLlegada +"\t" + duracion +"\n\n");
                modelo.controlador p = new modelo.controlador(nombre ,tama, tiempoLlegada, duracion );
                listaDoble.insertarFinal(p);
            }
            //lista doble insertada en n (aplicar algoritmo mvt)
            
           
    }

//Obtengo el tiempo total que tardan todos los procesos (suma de la Duracion) 
    public int DuracionTotal(){
     //System.out.println("\t Nombre \t tama \t tiempoLlegada \t Duracion \n\n");       
     int sum = 0;
     int totalDatos = jTablePrincipal.getRowCount();
            for(int i = 0; i < totalDatos; i++){
               sum += Integer.parseInt(jTablePrincipal.getValueAt(i, 3).toString());      
            }
    return sum;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlador().setVisible(true);
            }
        });
    }
    
    
    public void insertarDatoTablaTal(listaDoble tal, int i){
    
    String datosTal[] = new String[4];
    
    datosTal[0]= String.valueOf(tal.get(i).dato.getNumero());
        //System.out.println(tal.get(i).dato.getNumero());
    datosTal[1] = String.valueOf(tal.get(i).dato.getLocalidad());
        //System.out.println(tal.get(i).dato.getLocalidad());
    datosTal[2] = String.valueOf(tal.get(i).dato.getTama());
        //System.out.println(tal.get(i).dato.getTama());
    datosTal[3] = String.valueOf(tal.get(i).dato.getEstado());
        //System.out.println(tal.get(i).dato.getEstado());
    this.tal.addRow(datosTal); 
    
    }
    
    public void insertarDatoTablaTp(listaDoble tp, int i){
    
    String datosTal[] = new String[4];
    
    datosTal[0]= String.valueOf(tp.get(i).dato.getNumero());
        //System.out.println(tp.get(i).dato.getNumero());
    datosTal[1] = String.valueOf(tp.get(i).dato.getLocalidad());
        //System.out.println(tp.get(i).dato.getLocalidad());
    datosTal[2] = String.valueOf(tp.get(i).dato.getTama());
        //System.out.println(tp.get(i).dato.getTama());
    datosTal[3] = String.valueOf(tp.get(i).dato.getEstado());
        //System.out.println(tp.get(i).dato.getEstado());
    this.tp.addRow(datosTal); 
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPaso;
    private javax.swing.JLabel jLabelMvt;
    private javax.swing.JLabel jLabelTal;
    private javax.swing.JLabel jLabelTp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneGraficos;
    private javax.swing.JTable jTablePrincipal;
    private javax.swing.JTable jTableTal;
    private javax.swing.JTable jTableTp;
    // End of variables declaration//GEN-END:variables
}
