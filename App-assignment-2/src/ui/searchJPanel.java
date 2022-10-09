/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.employeeData;
import model.employeeDetalis;

/**
 *
 * @author hp
 */
public class searchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form searchJPanel
     */
    employeeData data;
    employeeDetalis d;
    private String searchOption="";
    private String searchString="";
    ArrayList<String> searchItemsList = new ArrayList<String>();
    public searchJPanel(employeeData data) {
        initComponents();
        this.data = data;
    }
    
    private void showPopup(MouseEvent e)
    {
        PopupMenu.show(this,e.getX(),e.getY());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupMenu = new javax.swing.JPopupMenu();
        emp_name = new javax.swing.JMenuItem();
        emp_id = new javax.swing.JMenuItem();
        emp_age = new javax.swing.JMenuItem();
        emp_gender = new javax.swing.JMenuItem();
        emp_start_date = new javax.swing.JMenuItem();
        emp_level = new javax.swing.JMenuItem();
        emp_team_info = new javax.swing.JMenuItem();
        emp_position_title = new javax.swing.JMenuItem();
        emp_contact_info = new javax.swing.JMenuItem();
        emp_cell_phn_no = new javax.swing.JMenuItem();
        emp_email = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        emp_age1 = new javax.swing.JTextField();
        emp_gender1 = new javax.swing.JTextField();
        emp_start_date1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emp_level1 = new javax.swing.JTextField();
        emp_team_info1 = new javax.swing.JTextField();
        emp_position_title1 = new javax.swing.JTextField();
        emp_contact_info1 = new javax.swing.JTextField();
        emp_cell_phn_no1 = new javax.swing.JTextField();
        emp_email1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emp_name1 = new javax.swing.JTextField();
        emp_id1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        emp_photo_label = new javax.swing.JLabel();

        emp_name.setText("emp_name");
        emp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_nameActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_name);

        emp_id.setText("emp_id");
        emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_idActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_id);

        emp_age.setText("emp_age");
        emp_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_ageActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_age);

        emp_gender.setText("emp_gender");
        emp_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_genderActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_gender);

        emp_start_date.setText("emp_start_date");
        emp_start_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_start_dateActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_start_date);

        emp_level.setText("emp_level");
        emp_level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_levelActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_level);

        emp_team_info.setText("emp_team_info");
        emp_team_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_team_infoActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_team_info);

        emp_position_title.setText("emp_position_title");
        emp_position_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_position_titleActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_position_title);

        emp_contact_info.setText("emp_contact_info");
        emp_contact_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_contact_infoActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_contact_info);

        emp_cell_phn_no.setText("emp_cell_phn_no");
        emp_cell_phn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_cell_phn_noActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_cell_phn_no);

        emp_email.setText("emp_email");
        emp_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_emailActionPerformed(evt);
            }
        });
        PopupMenu.add(emp_email);

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jLabel1.setText("To search for an employee details, right click and select one of the search options.");

        jLabel2.setText("Enter a string to search");

        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        emp_age1.setVisible(false);

        emp_gender1.setVisible(false);

        emp_start_date1.setVisible(false);

        jLabel9.setVisible(false);
        jLabel9.setText("Name");

        jLabel10.setVisible(false);
        jLabel10.setText("ID");

        jLabel11.setVisible(false);
        jLabel11.setText("Age");

        jLabel3.setVisible(false);
        jLabel3.setText("Gender");

        jLabel4.setVisible(false);
        jLabel4.setText("Start-date");

        jLabel5.setVisible(false);
        jLabel5.setText("Level");

        jLabel6.setVisible(false);
        jLabel6.setText("Team Info");

        emp_level1.setVisible(false);

        emp_team_info1.setVisible(false);

        emp_position_title1.setVisible(false);

        emp_contact_info1.setVisible(false);

        emp_cell_phn_no1.setVisible(false);

        emp_email1.setVisible(false);

        jLabel7.setVisible(false);
        jLabel7.setText("Position Title");

        jLabel8.setVisible(false);
        jLabel8.setText("Contact Info");

        jLabel12.setVisible(false);
        jLabel12.setText("Cell Phn. No.");

        jLabel13.setVisible(false);
        jLabel13.setText("Email-ID");

        emp_name1.setVisible(false);

        emp_id1.setVisible(false);

        jLabel14.setVisible(false);

        emp_photo_label.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchText)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(emp_photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emp_cell_phn_no1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_contact_info1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_position_title1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_team_info1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_level1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_start_date1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_gender1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_age1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_id1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_name1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_email1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(emp_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(emp_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(emp_age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(emp_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emp_start_date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(emp_level1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(emp_team_info1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(emp_position_title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(emp_photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(emp_contact_info1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(emp_cell_phn_no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(emp_email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_nameActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_name";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_name());
        }
    }//GEN-LAST:event_emp_nameActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        if(evt.isPopupTrigger())
        {
            showPopup(evt);
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger())
        {
            showPopup(evt);
        }
    }//GEN-LAST:event_formMouseReleased

    private void emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_idActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_id";
        ArrayList<Integer> searchItemsList = new ArrayList<Integer>();
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_id());
        }
    }//GEN-LAST:event_emp_idActionPerformed

    private void emp_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_ageActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_age";
        ArrayList<Integer> searchItemsList = new ArrayList<Integer>();
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_age());
        }
    }//GEN-LAST:event_emp_ageActionPerformed

    private void emp_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_genderActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_gender";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(String.valueOf(d.getEmp_gender()));
        }
    }//GEN-LAST:event_emp_genderActionPerformed

    private void emp_start_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_start_dateActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_start_date";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_start_date());
        }
    }//GEN-LAST:event_emp_start_dateActionPerformed

    private void emp_levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_levelActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_level";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_level());
        }
    }//GEN-LAST:event_emp_levelActionPerformed

    private void emp_team_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_team_infoActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_team_info";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_team_info());
        }
    }//GEN-LAST:event_emp_team_infoActionPerformed

    private void emp_position_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_position_titleActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_position_title";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_position_title());
        }
    }//GEN-LAST:event_emp_position_titleActionPerformed

    private void emp_contact_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_contact_infoActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_contact_info";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_contact_info());
        }
    }//GEN-LAST:event_emp_contact_infoActionPerformed

    private void emp_cell_phn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_cell_phn_noActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_cell_phn_no";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_cell_phn_no());
        }
    }//GEN-LAST:event_emp_cell_phn_noActionPerformed

    private void emp_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_emailActionPerformed
        // TODO add your handling code here:
        this.searchOption = "emp_email";
        for (employeeDetalis d : data.getData())
        {
        searchItemsList.add(d.getEmp_email());
        }
    }//GEN-LAST:event_emp_emailActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        /*System.out.println(searchText.getText());
        System.out.println(this.searchOption);
        System.out.println(searchItemsList.indexOf(searchText.getText()));
        System.out.println(data.getData());*/
        jLabel14.setVisible(true);
        jLabel14.setText("Searching in: "+searchOption);
        if (searchItemsList.indexOf(searchText.getText())<0)
        {
            JOptionPane.showMessageDialog(this, "Sorry No employee with "+this.searchOption+": " +searchText.getText()+" found.");
            return;
        }
        else
        {
            int i=0;
            for (employeeDetalis d : data.getData())
            {
                if(i==searchItemsList.indexOf(searchText.getText()))
                {
                    jLabel1.setVisible(true);
                    jLabel2.setVisible(true);
                    jLabel3.setVisible(true);
                    jLabel4.setVisible(true);
                    jLabel5.setVisible(true);
                    jLabel6.setVisible(true);
                    jLabel7.setVisible(true);
                    jLabel8.setVisible(true);
                    jLabel9.setVisible(true);
                    jLabel10.setVisible(true);
                    jLabel11.setVisible(true);
                    jLabel12.setVisible(true);
                    jLabel13.setVisible(true);
                    emp_photo_label.setVisible(true);
                    emp_name1.setVisible(true);
                    emp_id1.setVisible(true);
                    emp_age1.setVisible(true);
                    emp_gender1.setVisible(true);
                    emp_start_date1.setVisible(true);
                    emp_level1.setVisible(true);
                    emp_team_info1.setVisible(true);
                    emp_position_title1.setVisible(true);
                    emp_contact_info1.setVisible(true);
                    emp_cell_phn_no1.setVisible(true);
                    emp_email1.setVisible(true);
                    emp_name1.setText(d.getEmp_name());
                    emp_id1.setText(String.valueOf(d.getEmp_id()));
                    emp_age1.setText(String.valueOf(d.getEmp_age()));
                    emp_gender1.setText(String.valueOf(d.getEmp_gender()));
                    emp_start_date1.setText(d.getEmp_start_date());
                    emp_level1.setText(d.getEmp_level());
                    emp_team_info1.setText(d.getEmp_team_info());
                    emp_position_title1.setText(d.getEmp_position_title());
                    emp_contact_info1.setText(d.getEmp_contact_info());
                    emp_cell_phn_no1.setText(String.valueOf(d.getEmp_cell_phn_no()));
                    emp_email1.setText(d.getEmp_email());
                    emp_photo_label.setIcon(new ImageIcon(new ImageIcon(d.getEmp_photo_label()).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT)));
                }
                i++;
                
            }
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopupMenu;
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenuItem emp_age;
    private javax.swing.JTextField emp_age1;
    private javax.swing.JMenuItem emp_cell_phn_no;
    private javax.swing.JTextField emp_cell_phn_no1;
    private javax.swing.JMenuItem emp_contact_info;
    private javax.swing.JTextField emp_contact_info1;
    private javax.swing.JMenuItem emp_email;
    private javax.swing.JTextField emp_email1;
    private javax.swing.JMenuItem emp_gender;
    private javax.swing.JTextField emp_gender1;
    private javax.swing.JMenuItem emp_id;
    private javax.swing.JTextField emp_id1;
    private javax.swing.JMenuItem emp_level;
    private javax.swing.JTextField emp_level1;
    private javax.swing.JMenuItem emp_name;
    private javax.swing.JTextField emp_name1;
    private javax.swing.JLabel emp_photo_label;
    private javax.swing.JMenuItem emp_position_title;
    private javax.swing.JTextField emp_position_title1;
    private javax.swing.JMenuItem emp_start_date;
    private javax.swing.JTextField emp_start_date1;
    private javax.swing.JMenuItem emp_team_info;
    private javax.swing.JTextField emp_team_info1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}
