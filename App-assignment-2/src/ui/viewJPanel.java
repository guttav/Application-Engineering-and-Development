/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.employeeData;
import model.employeeDetalis;

/**
 *
 * @author hp
 */
public class viewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewJPanel
     */
    
    private int selectedRowIndex;
    employeeData data;
    public viewJPanel(employeeData data) {
        initComponents();
        this.data=data;
        
        populateTable();
    }

    private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (employeeDetalis d : data.getData())
        {
            Object[] row = new Object[2];
            row[0] = d;
            row[1] = d.getEmp_id();
            
            model.addRow(row);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        emp_position_title = new javax.swing.JTextField();
        emp_contact_info = new javax.swing.JTextField();
        emp_cell_phn_no = new javax.swing.JTextField();
        emp_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emp_name = new javax.swing.JTextField();
        emp_id = new javax.swing.JTextField();
        emp_age = new javax.swing.JTextField();
        emp_gender = new javax.swing.JTextField();
        emp_start_date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emp_level = new javax.swing.JTextField();
        emp_team_info = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        emp_photo_label = new javax.swing.JLabel();

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employee");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        emp_position_title.setVisible(false);

        emp_contact_info.setVisible(false);

        emp_cell_phn_no.setVisible(false);

        emp_email.setVisible(false);

        jLabel5.setVisible(false);
        jLabel5.setText("Position Title");

        jLabel6.setVisible(false);
        jLabel6.setText("Contact Info");

        jLabel7.setVisible(false);
        jLabel7.setText("Cell Phn. No.");

        jLabel8.setVisible(false);
        jLabel8.setText("Email-ID");

        emp_name.setVisible(false);

        emp_id.setVisible(false);

        emp_age.setVisible(false);

        emp_gender.setVisible(false);

        emp_start_date.setVisible(false);

        jLabel9.setVisible(false);
        jLabel9.setText("Name");

        jLabel10.setVisible(false);
        jLabel10.setText("ID");

        jLabel11.setVisible(false);
        jLabel11.setText("Age");

        jLabel1.setVisible(false);
        jLabel1.setText("Gender");

        jLabel2.setVisible(false);
        jLabel2.setText("Start-date");

        jLabel3.setVisible(false);
        jLabel3.setText("Level");

        jLabel4.setVisible(false);
        jLabel4.setText("Team Info");

        emp_level.setVisible(false);

        emp_team_info.setVisible(false);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        emp_photo_label.setVisible(false);
        emp_photo_label.setText("emp-photo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emp_cell_phn_no, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_contact_info, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_position_title, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_team_info, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_level, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_start_date, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_gender, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_age, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(emp_email))
                        .addGap(18, 18, 18)
                        .addComponent(emp_photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnView)
                                .addGap(141, 141, 141)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(emp_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(emp_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(emp_start_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(emp_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emp_team_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(emp_photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(emp_position_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emp_contact_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emp_cell_phn_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(emp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        employeeDetalis selectedEmployee = (employeeDetalis) model.getValueAt(selectedRowIndex,0);
        
        data.deleteEmployee(selectedEmployee);
        System.out.println(selectedEmployee);
        JOptionPane.showMessageDialog(this,"Employee deleted.");
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed
    

    
    
    
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        this.selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        employeeDetalis selectedEmployee = (employeeDetalis) model.getValueAt(selectedRowIndex,0);
        
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
        emp_name.setVisible(true);
        emp_id.setVisible(true);
        emp_age.setVisible(true);
        emp_gender.setVisible(true);
        emp_start_date.setVisible(true);
        emp_level.setVisible(true);
        emp_team_info.setVisible(true);
        emp_position_title.setVisible(true);
        emp_contact_info.setVisible(true);
        emp_cell_phn_no.setVisible(true);
        emp_email.setVisible(true);
        emp_photo_label.setVisible(true);
        emp_name.setText(selectedEmployee.getEmp_name());
        emp_id.setText(String.valueOf(selectedEmployee.getEmp_id()));
        emp_age.setText(String.valueOf(selectedEmployee.getEmp_age()));
        emp_gender.setText(String.valueOf(selectedEmployee.getEmp_gender()));
        emp_start_date.setText(selectedEmployee.getEmp_start_date());
        emp_level.setText(selectedEmployee.getEmp_level());
        emp_team_info.setText(selectedEmployee.getEmp_team_info());
        emp_position_title.setText(selectedEmployee.getEmp_position_title());
        emp_contact_info.setText(selectedEmployee.getEmp_contact_info());
        emp_cell_phn_no.setText(String.valueOf(selectedEmployee.getEmp_cell_phn_no()));
        emp_email.setText(selectedEmployee.getEmp_email());
        emp_photo_label.setIcon(new ImageIcon(new ImageIcon(selectedEmployee.getEmp_photo_label()).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        this.selectedRowIndex = jTable1.getSelectedRow();
        System.out.println(this.selectedRowIndex);
        
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        String[] items_array = {emp_name.getText(),emp_id.getText(),emp_age.getText(),emp_gender.getText()
                                ,emp_start_date.getText(),emp_level.getText(),emp_team_info.getText(),emp_position_title.getText(),
                                emp_contact_info.getText(),emp_cell_phn_no.getText(),emp_email.getText()};
        
        employeeDetalis ed = data.addNewEmployee();
        
        ed.setEmp_name(items_array[0]);
        ed.setEmp_id(Integer.parseInt(items_array[1]));
        ed.setEmp_age(Integer.parseInt(items_array[2]));
        ed.setEmp_gender(items_array[3].charAt(0));
        ed.setEmp_start_date(items_array[4]);
        ed.setEmp_level(items_array[5]);
        ed.setEmp_team_info(items_array[6]);
        ed.setEmp_position_title(items_array[7]);
        ed.setEmp_contact_info(items_array[8]);
        ed.setEmp_cell_phn_no(items_array[9]);
        ed.setEmp_email(items_array[10]);
        JOptionPane.showMessageDialog(this,"Employee details are updated and added to end.");
        
        emp_name.setText("");
        emp_id.setText("");
        emp_age.setText("");
        emp_gender.setText("");
        emp_start_date.setText("");
        emp_level.setText("");
        emp_team_info.setText("");
        emp_position_title.setText("");
        emp_contact_info.setText("");
        emp_cell_phn_no.setText("");
        emp_email.setText("");
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        employeeDetalis selectedEmployee = (employeeDetalis) model.getValueAt(selectedRowIndex,0);
        
        data.deleteEmployee(selectedEmployee);
        populateTable();

        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField emp_age;
    private javax.swing.JTextField emp_cell_phn_no;
    private javax.swing.JTextField emp_contact_info;
    private javax.swing.JTextField emp_email;
    private javax.swing.JTextField emp_gender;
    private javax.swing.JTextField emp_id;
    private javax.swing.JTextField emp_level;
    private javax.swing.JTextField emp_name;
    private javax.swing.JLabel emp_photo_label;
    private javax.swing.JTextField emp_position_title;
    private javax.swing.JTextField emp_start_date;
    private javax.swing.JTextField emp_team_info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
