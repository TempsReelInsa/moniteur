/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MyPanel.java
 *
 * Created on 29 août 2011, 18:15:58
 */
package my.monitor;

import java.beans.PropertyChangeEvent;
import my.monitor.controller.MyController;
import my.monitor.model.enumeration.CommunicationStatus;

/**
 *
 * @author pehladik
 */
public class MyCommunicationPanel extends AbstractViewPanel {

    //  The controller used by this view
    private MyController controller;
    //  A local copy of the communication status
    private CommunicationStatus commStatus = CommunicationStatus.COMMUNICATION_DISCONNECTED;

    public MyCommunicationPanel() {
        initComponents();
    }

    /** Creates new form MyPanel */
    public MyCommunicationPanel(MyController controller) {
        this.controller = controller;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc=" Model Event Handling Code ">
    /**
     * Called by the controller when it needs to pass along a property change
     * from a model.
     * @param evt The property change event
     */
    public void modelPropertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals(
                MyController.COMMUNICATION_STATUS_PROPERTY)) {
            commStatus = (CommunicationStatus) evt.getNewValue();
            jTextStatusCon.setText(commStatus.description());
            if (commStatus != CommunicationStatus.COMMUNICATION_CONNECTED) {
                jButtonConnect.setText("Connect");
            } else {
                jButtonConnect.setText("Disonnect");
            }
        } else if (evt.getPropertyName().equals(
                MyController.COMMUNICATION_PORT_PROPERTY)) {
            jTextPort.setText(evt.getNewValue().toString());
        } else if (evt.getPropertyName().equals(
                MyController.COMMUNICATION_ADRESS_PROPERTY)) {
            jTextIp.setText((String) evt.getNewValue());
        } else if (evt.getPropertyName().equals(
                MyController.CHANGE_DEMARRAGE)) {
            jCheckBox1.setSelected(((Boolean)evt.getNewValue()).booleanValue());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jButtonConnect = new javax.swing.JButton();
        jTextPort = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextIp = new javax.swing.JTextField();
        jTextStatusCon = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(680, 100));
        setMinimumSize(new java.awt.Dimension(680, 100));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 14));
        jLabel11.setText("Connection");

        jButtonConnect.setFont(new java.awt.Font("Liberation Sans", 0, 12));
        jButtonConnect.setText("Connect");
        jButtonConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConnectMouseClicked(evt);
            }
        });
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jTextPort.setFont(new java.awt.Font("Liberation Sans", 0, 12));
        jTextPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPortActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 12));
        jLabel2.setText("IP address");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 12));
        jLabel3.setText("Port");

        jTextIp.setText("localhost");
        jTextIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIpActionPerformed(evt);
            }
        });

        jTextStatusCon.setEditable(false);
        jTextStatusCon.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jTextStatusCon.setText("Disconnected");
        jTextStatusCon.setFocusable(false);
        jTextStatusCon.setMaximumSize(new java.awt.Dimension(98, 27));
        jTextStatusCon.setMinimumSize(new java.awt.Dimension(98, 27));

        jCheckBox1.setText("Démarrage rapide");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextIp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConnect)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextStatusCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextPort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jCheckBox1)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButtonConnect)
                    .addComponent(jTextStatusCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIpActionPerformed

        controller.changeAdress(jTextIp.getText());
        
        if (commStatus != CommunicationStatus.COMMUNICATION_CONNECTED) {
            controller.changeCommStatus(CommunicationStatus.COMMUNICATION_CONNECTED);
        } else {
            controller.changeCommStatus(CommunicationStatus.COMMUNICATION_DISCONNECTED);
        }
}//GEN-LAST:event_jTextIpActionPerformed

    private void jTextPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPortActionPerformed
        controller.changePort(Integer.parseInt(jTextPort.getText()));
}//GEN-LAST:event_jTextPortActionPerformed

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        System.out.println(commStatus);
        controller.changeAdress(jTextIp.getText());

        if (commStatus != CommunicationStatus.COMMUNICATION_CONNECTED) {
            controller.changeCommStatus(CommunicationStatus.COMMUNICATION_CONNECTED);
        } else {
            controller.changeCommStatus(CommunicationStatus.COMMUNICATION_DISCONNECTED);
        }
}//GEN-LAST:event_jButtonConnectActionPerformed

    private void jButtonConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConnectMouseClicked
}//GEN-LAST:event_jButtonConnectMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        controller.changeDemarrageRapide(Boolean.valueOf(jCheckBox1.isSelected()));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextIp;
    private javax.swing.JTextField jTextPort;
    private javax.swing.JTextField jTextStatusCon;
    // End of variables declaration//GEN-END:variables
}
