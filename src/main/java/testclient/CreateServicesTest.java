/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testclient;

import factory.EmailServiceFactory;
import facade.Facade;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import singleton.EmailServiceConfig;

/**
 *
 * @author Fabricio
 */
public class CreateServicesTest extends javax.swing.JFrame {

    Facade cliente = new Facade();
    String serviceName;
    EmailServiceConfig config;
    private DefaultListModel<String> listModel;
    private String user;
    private char[] password;

    /**
     * Creates new form EmailSendTest
     */
    public CreateServicesTest(String user, char[] password) {
        listModel = new DefaultListModel<>();
        config = EmailServiceConfig.getInstance();

        this.user = user;
        this.password = password;
        String passwordString = new String(password);
        config.addService("javamail", EmailServiceFactory.createEmailService("javamail", "mail.smtp.host", user, passwordString));
        config.addService("pop3", EmailServiceFactory.createEmailService("pop3", "mail.pop.host", user, passwordString));
        config.addService("imap", EmailServiceFactory.createEmailService("imap", "imap.domain.host", user, passwordString));

        initComponents();
        labelEmailInfo.setText(user);

        listCurrentlyServices.setModel(listModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelServicios = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelServiceName = new javax.swing.JTextField();
        labelHostName = new javax.swing.JTextField();
        buttonAddNewService = new javax.swing.JButton();
        txtPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        labelUser = new javax.swing.JTextField();
        labelPassword = new javax.swing.JTextField();
        panelServiciosExistentes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCurrentlyServices = new javax.swing.JList<>();
        buttonSelect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelEmailInfo = new javax.swing.JLabel();

        panelServicios.setLocation(400, 300);
        panelServicios.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelServiciosComponentShown(evt);
            }
        });
        panelServicios.setVisible(false);

        jLabel2.setText("Nombre del servicio:");

        jLabel3.setText("Host del servicio:");

        buttonAddNewService.setText("Utilizar Servicio");
        buttonAddNewService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddNewServiceActionPerformed(evt);
            }
        });

        txtPassword.setText("Contraseña");
        txtPassword.setEnabled(false);

        txtUser.setText("Usuario (@gmail.com)");
        txtUser.setEnabled(false);

        labelUser.setEnabled(false);

        labelPassword.setEnabled(false);

        javax.swing.GroupLayout panelServiciosLayout = new javax.swing.GroupLayout(panelServicios);
        panelServicios.setLayout(panelServiciosLayout);
        panelServiciosLayout.setHorizontalGroup(
            panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServiciosLayout.createSequentialGroup()
                .addGroup(panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelServiciosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHostName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelServiciosLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(buttonAddNewService)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelServiciosLayout.setVerticalGroup(
            panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServiciosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelHostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(buttonAddNewService)
                .addGap(50, 50, 50))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelServiciosExistentes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelServiciosExistentesComponentShown(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Servicios Disponibles");

        listCurrentlyServices.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCurrentlyServices);

        buttonSelect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSelect.setText("Seleccionar");
        buttonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelServiciosExistentesLayout = new javax.swing.GroupLayout(panelServiciosExistentes);
        panelServiciosExistentes.setLayout(panelServiciosExistentesLayout);
        panelServiciosExistentesLayout.setHorizontalGroup(
            panelServiciosExistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServiciosExistentesLayout.createSequentialGroup()
                .addGroup(panelServiciosExistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelServiciosExistentesLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelServiciosExistentesLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(buttonSelect))
                    .addGroup(panelServiciosExistentesLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel4)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        panelServiciosExistentesLayout.setVerticalGroup(
            panelServiciosExistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelServiciosExistentesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(buttonSelect)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelEmailInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(panelServiciosExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmailInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addComponent(panelServiciosExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddNewServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddNewServiceActionPerformed
        serviceName = labelServiceName.getText();
        if (serviceName.equalsIgnoreCase("javamail")) {
            txtPassword.setEnabled(true);
            txtUser.setEnabled(true);
            labelUser.setEnabled(true);
            labelPassword.setEnabled(true);
        } else {
            config.addService(serviceName, EmailServiceFactory.createEmailService(serviceName, labelHostName.getText(), null, null));
            System.out.println("Servicio correctamente establecido");
            SendEmailTest emailPanel = new SendEmailTest(config, cliente, serviceName);
            emailPanel.setVisible(true);
            // this.setVisible(false);
        }

    }//GEN-LAST:event_buttonAddNewServiceActionPerformed

    private void panelServiciosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelServiciosComponentShown
        txtPassword.setEnabled(false);
        txtUser.setEnabled(false);
        labelUser.setEnabled(false);
        labelPassword.setEnabled(false);


    }//GEN-LAST:event_panelServiciosComponentShown

    private void panelServiciosExistentesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelServiciosExistentesComponentShown


    }//GEN-LAST:event_panelServiciosExistentesComponentShown

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listModel.clear();

        listModel.addElement(config.getService("javamail").toString());
        listModel.addElement(config.getService("pop3").toString());
        listModel.addElement(config.getService("imap").toString());
        listCurrentlyServices.setModel(listModel);
    }//GEN-LAST:event_formWindowActivated

    private void buttonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelectActionPerformed

        serviceName = listCurrentlyServices.getSelectedValue().toLowerCase();
        serviceName = serviceName.replaceFirst("servicio", "").trim();
        if ("javamailapi".equalsIgnoreCase(serviceName)) {
            serviceName = "javamail";
        }
        System.out.println(serviceName);
        SendEmailTest emailPanel = new SendEmailTest(config, cliente, serviceName);
        emailPanel.setVisible(true);
       // this.setVisible(false);


    }//GEN-LAST:event_buttonSelectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddNewService;
    private javax.swing.JButton buttonSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEmailInfo;
    private javax.swing.JTextField labelHostName;
    private javax.swing.JTextField labelPassword;
    private javax.swing.JTextField labelServiceName;
    private javax.swing.JTextField labelUser;
    private javax.swing.JList<String> listCurrentlyServices;
    private javax.swing.JPanel panelServicios;
    private javax.swing.JPanel panelServiciosExistentes;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
