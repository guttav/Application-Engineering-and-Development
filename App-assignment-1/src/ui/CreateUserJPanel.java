/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author hp
 */
public class CreateUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateUserJPanel
     */
    model.Product product = new model.Product();
    public CreateUserJPanel(model.Product product) {
        this.product = product;
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

        jLabel15 = new javax.swing.JLabel();
        usr_degree2_start = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        usr_affiliation = new javax.swing.JTextField();
        usr_age = new javax.swing.JTextField();
        usr_tel_phn_no = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        usr_lname = new javax.swing.JTextField();
        usr_street_line_1 = new javax.swing.JTextField();
        usr_major = new javax.swing.JTextField();
        usr_email_label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        usr_degree1 = new javax.swing.JTextField();
        usr_Degree2_end = new javax.swing.JTextField();
        usr_email = new javax.swing.JTextField();
        usr_dob_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        usr_fname_label = new javax.swing.JLabel();
        usr_degree1_start = new javax.swing.JTextField();
        usr_street_line_2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usr_career = new javax.swing.JTextField();
        usr_lname_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usr_tel_phn_no_label = new javax.swing.JLabel();
        usr_fname = new javax.swing.JTextField();
        usr_dob = new javax.swing.JTextField();
        usr_degree1_end = new javax.swing.JTextField();
        usr_country = new javax.swing.JTextField();
        save_btn = new javax.swing.JButton();
        usr_age_label = new javax.swing.JLabel();
        usr_degree2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        usr_city = new javax.swing.JTextField();
        photo_label = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(813, 700));

        jLabel15.setText("Degree 1 End");
        jLabel15.setAlignmentX(0.5F);

        usr_degree2_start.setAutoscrolls(false);

        jLabel10.setText("Affiliation");
        jLabel10.setAlignmentX(0.5F);

        usr_affiliation.setAutoscrolls(false);

        usr_age.setAutoscrolls(false);
        usr_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr_ageActionPerformed(evt);
            }
        });

        usr_tel_phn_no.setAutoscrolls(false);

        jLabel11.setText("Major");
        jLabel11.setAlignmentX(0.5F);

        jLabel12.setText("Career");
        jLabel12.setAlignmentX(0.5F);

        jLabel16.setText("Degree 2");
        jLabel16.setAlignmentX(0.5F);

        jLabel9.setText("Country");
        jLabel9.setAlignmentX(0.5F);

        jLabel18.setText("Degree 2 End");
        jLabel18.setAlignmentX(0.5F);

        usr_lname.setAutoscrolls(false);

        usr_street_line_1.setAutoscrolls(false);

        usr_major.setAutoscrolls(false);

        usr_email_label.setText("Email");
        usr_email_label.setAlignmentX(0.5F);

        jLabel13.setText("Degree 1");
        jLabel13.setAlignmentX(0.5F);

        usr_degree1.setAutoscrolls(false);

        usr_Degree2_end.setAutoscrolls(false);

        usr_email.setAutoscrolls(false);

        usr_dob_label.setText("DOB");
        usr_dob_label.setAlignmentX(0.5F);

        jLabel7.setText("Street Line 2");
        jLabel7.setAlignmentX(0.5F);

        jLabel14.setText("Degree 1 Start");
        jLabel14.setAlignmentX(0.5F);

        usr_fname_label.setText("First Name");
        usr_fname_label.setAlignmentX(0.5F);

        usr_degree1_start.setAutoscrolls(false);

        usr_street_line_2.setAutoscrolls(false);

        jLabel6.setText("Street Line 1");
        jLabel6.setAlignmentX(0.5F);

        usr_career.setAutoscrolls(false);

        usr_lname_label.setText("Last Name");
        usr_lname_label.setAlignmentX(0.5F);

        jLabel8.setText("City");
        jLabel8.setAlignmentX(0.5F);

        usr_tel_phn_no_label.setText("Tel. Phn. No.");
        usr_tel_phn_no_label.setAlignmentX(0.5F);

        usr_fname.setAutoscrolls(false);

        usr_dob.setAutoscrolls(false);

        usr_degree1_end.setAutoscrolls(false);
        usr_degree1_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr_degree1_endActionPerformed(evt);
            }
        });

        usr_country.setAutoscrolls(false);
        usr_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr_countryActionPerformed(evt);
            }
        });

        save_btn.setText("Save");
        save_btn.setMaximumSize(new java.awt.Dimension(55, 25));
        save_btn.setPreferredSize(new java.awt.Dimension(55, 25));
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        usr_age_label.setText("Age");
        usr_age_label.setAlignmentX(0.5F);

        usr_degree2.setAutoscrolls(false);

        jLabel17.setText("Degree 2 Start");
        jLabel17.setAlignmentX(0.5F);

        usr_city.setAutoscrolls(false);

        photo_label.setText("Upload Photo");
        photo_label.setMaximumSize(new java.awt.Dimension(95, 25));
        photo_label.setPreferredSize(new java.awt.Dimension(95, 25));
        photo_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photo_labelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usr_fname_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usr_lname_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usr_age_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usr_dob_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usr_email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(usr_tel_phn_no_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usr_fname)
                    .addComponent(usr_dob)
                    .addComponent(usr_lname)
                    .addComponent(usr_age)
                    .addComponent(usr_email)
                    .addComponent(usr_tel_phn_no)
                    .addComponent(usr_street_line_1)
                    .addComponent(usr_city)
                    .addComponent(usr_country)
                    .addComponent(usr_affiliation)
                    .addComponent(usr_major)
                    .addComponent(usr_career)
                    .addComponent(usr_degree1_start)
                    .addComponent(usr_degree1)
                    .addComponent(usr_degree1_end)
                    .addComponent(usr_degree2)
                    .addComponent(usr_degree2_start)
                    .addComponent(usr_Degree2_end, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(usr_street_line_2))
                .addGap(303, 303, 303))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usr_fname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usr_lname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usr_dob_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usr_age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_age, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usr_tel_phn_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_tel_phn_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usr_email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_street_line_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_street_line_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_country, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_affiliation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_major, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_career, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_degree1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_degree1_start, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_degree1_end, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_degree2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_degree2_start, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usr_Degree2_end, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usr_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usr_ageActionPerformed

    private void usr_degree1_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr_degree1_endActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usr_degree1_endActionPerformed

    private void usr_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usr_countryActionPerformed

    
    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
        product.setUsr_fname(usr_fname.getText());
        product.setUsr_lname(usr_lname.getText());
        product.setUsr_dob(usr_dob.getText());
        product.setUsr_age(usr_age.getText());
        product.setUsr_tel_phn_no(usr_tel_phn_no.getText());
        product.setUsr_email(usr_email.getText());
        product.setUsr_street_line_1(usr_street_line_1.getText());
        product.setUsr_street_line_2(usr_street_line_2.getText());
        product.setUsr_city(usr_city.getText());
        product.setUsr_country(usr_city.getText());
        product.setUsr_affiliation(usr_affiliation.getText());
        product.setUsr_major(usr_major.getText());
        product.setUsr_career(usr_career.getText());
        product.setUsr_degree1(usr_degree1.getText());
        product.setUsr_degree1_start(usr_degree1_start.getText());
        product.setUsr_degree1_end(usr_degree1_end.getText());
        product.setUsr_degree2(usr_degree2.getText());
        product.setUsr_degree2_start(usr_degree2_start.getText());
        product.setUsr_degree2_end(usr_Degree2_end.getText());
        JOptionPane.showMessageDialog(this,"Information is saved!!");
        
        
        
    }//GEN-LAST:event_save_btnActionPerformed

    
    private void photo_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photo_labelActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

	int returnValue = jfc.showOpenDialog(null);
	// int returnValue = jfc.showSaveDialog(null);

	if (returnValue == JFileChooser.APPROVE_OPTION) {
		File selectedFile = jfc.getSelectedFile();
                product.setUsr_photo_label(selectedFile.getAbsolutePath());
                JOptionPane.showMessageDialog(this,"Photo is uploaded!!"+" \n location: "+selectedFile.getAbsolutePath());
        }
        
    }//GEN-LAST:event_photo_labelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton photo_label;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField usr_Degree2_end;
    private javax.swing.JTextField usr_affiliation;
    private javax.swing.JTextField usr_age;
    private javax.swing.JLabel usr_age_label;
    private javax.swing.JTextField usr_career;
    private javax.swing.JTextField usr_city;
    private javax.swing.JTextField usr_country;
    private javax.swing.JTextField usr_degree1;
    private javax.swing.JTextField usr_degree1_end;
    private javax.swing.JTextField usr_degree1_start;
    private javax.swing.JTextField usr_degree2;
    private javax.swing.JTextField usr_degree2_start;
    private javax.swing.JTextField usr_dob;
    private javax.swing.JLabel usr_dob_label;
    private javax.swing.JTextField usr_email;
    private javax.swing.JLabel usr_email_label;
    private javax.swing.JTextField usr_fname;
    private javax.swing.JLabel usr_fname_label;
    private javax.swing.JTextField usr_lname;
    private javax.swing.JLabel usr_lname_label;
    private javax.swing.JTextField usr_major;
    private javax.swing.JTextField usr_street_line_1;
    private javax.swing.JTextField usr_street_line_2;
    private javax.swing.JTextField usr_tel_phn_no;
    private javax.swing.JLabel usr_tel_phn_no_label;
    // End of variables declaration//GEN-END:variables
}
