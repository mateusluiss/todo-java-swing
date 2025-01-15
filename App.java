package projeto;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.DefaultListModel;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class App extends javax.swing.JFrame {
    
    private int contador;
    private String horarioMarcado;
    DefaultListModel<String> listModel = new DefaultListModel<>();
    
    ArrayList<String> listaHorarios = new ArrayList<>();
    
    public App() {
        initComponents();
        verificarHorario();
        listModel = new DefaultListModel<>();
        listaTarefas.setModel(listModel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TarefaField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        DataField = new javax.swing.JFormattedTextField();
        HorarioField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTarefas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TarefaField.setText("Nome da Tarefa");
        TarefaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TarefaFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TarefaFieldFocusLost(evt);
            }
        });
        TarefaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarefaFieldActionPerformed(evt);
            }
        });

        addButton.setText("Adicionar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        DataField.setText("(dd/mm/aaaa)");
        DataField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DataFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DataFieldFocusLost(evt);
            }
        });

        HorarioField.setText("(HH:mm)");
        HorarioField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HorarioFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HorarioFieldFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ADICIONAR NOVAS TAREFAS");

        listaTarefas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaTarefas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(HorarioField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TarefaField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TarefaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(HorarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        if (!TarefaField.getText().equals("") && !DataField.getText().equals("") && !HorarioField.getText().equals("") && !DataField.getText().equals("(dd/mm/aaaa)") && !HorarioField.equals("(HH:mm)")) {
            contador++;
            listaHorarios.add(HorarioField.getText());
            listModel.addElement(contador + ". " + TarefaField.getText()+" - "+HorarioField.getText()+" ("+DataField.getText()+")");
            TarefaField.setText("");
            DataField.setText("");
            HorarioField.setText("");
            JOptionPane.showMessageDialog(this, "Tarefa adicionada com sucesso!", "Lista de Tarefas", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void TarefaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TarefaFieldFocusGained
        TarefaField.setText("");
        TarefaField.setForeground(Color.black);
    }//GEN-LAST:event_TarefaFieldFocusGained

    private void TarefaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarefaFieldActionPerformed
        TarefaField.setForeground(Color.gray);
    }//GEN-LAST:event_TarefaFieldActionPerformed

    private void TarefaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TarefaFieldFocusLost

    }//GEN-LAST:event_TarefaFieldFocusLost

    private void DataFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DataFieldFocusGained
        DataField.setText("");
        DataField.setForeground(Color.black);
    }//GEN-LAST:event_DataFieldFocusGained

    private void HorarioFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HorarioFieldFocusGained
        HorarioField.setText("");
        HorarioField.setForeground(Color.black);
    }//GEN-LAST:event_HorarioFieldFocusGained

    private void DataFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DataFieldFocusLost

    }//GEN-LAST:event_DataFieldFocusLost

    private void HorarioFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HorarioFieldFocusLost

    }//GEN-LAST:event_HorarioFieldFocusLost
    
    
    private void verificarHorario() {


        // Thread para verificar continuamente o horário
        new Thread(() -> {
            while (true) {
                try {
                    
                    // Pega o horário atual
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                    String horarioAtual = sdf.format(new Date());
                    
                    if(listaHorarios.size() > 0){
                        for(int i = 0; i<listaHorarios.size(); i++){
                            String horarioLista = listaHorarios.get(i);
                            if (horarioAtual.compareTo(horarioLista) == 0) {
                                // Exibe a notificação
                                JOptionPane.showMessageDialog(this, "É hora da sua tarefa!", "Notificação", JOptionPane.INFORMATION_MESSAGE);
                                listaHorarios.remove(i);                                
                                break; // Encerra o loop após exibir a notificação
                            }
                        }
                    }
                    
                    

                    Thread.sleep(1000); // Verifica a cada 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DataField;
    private javax.swing.JFormattedTextField HorarioField;
    private javax.swing.JTextField TarefaField;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaTarefas;
    // End of variables declaration//GEN-END:variables
}
