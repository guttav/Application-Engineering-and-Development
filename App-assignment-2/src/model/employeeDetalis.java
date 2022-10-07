/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hp
 */
public class employeeDetalis {
    
        private String emp_name;
        private int emp_id;
        private int emp_age;
        private String emp_gender;
        private String emp_start_date;
        private String emp_level;
        private String emp_team_info;
        private String emp_position_title;
        private String emp_contact_info;
        private String emp_cell_phn_no;
        private String emp_email;
        private String emp_photo_label;

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
    }

    public String getEmp_start_date() {
        return emp_start_date;
    }

    public void setEmp_start_date(String emp_start_date) {
        this.emp_start_date = emp_start_date;
    }

    public String getEmp_level() {
        return emp_level;
    }

    public void setEmp_level(String emp_level) {
        this.emp_level = emp_level;
    }

    public String getEmp_team_info() {
        return emp_team_info;
    }

    public void setEmp_team_info(String emp_team_info) {
        this.emp_team_info = emp_team_info;
    }

    public String getEmp_position_title() {
        return emp_position_title;
    }

    public void setEmp_position_title(String emp_position_title) {
        this.emp_position_title = emp_position_title;
    }
    
    public String getEmp_contact_info() {
        return emp_contact_info;
    }

    public void setEmp_contact_info(String emp_contact_info) {
        this.emp_contact_info = emp_contact_info;
    }

    public String getEmp_cell_phn_no() {
        return emp_cell_phn_no;
    }

    public void setEmp_cell_phn_no(String emp_cell_phn_no) {
        this.emp_cell_phn_no = emp_cell_phn_no;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_photo_label() {
        return emp_photo_label;
    }

    public void setEmp_photo_label(String emp_photo_label) {
        this.emp_photo_label = emp_photo_label;
    }
    
    @Override
    public String toString(){
        return emp_name;
    }
}
