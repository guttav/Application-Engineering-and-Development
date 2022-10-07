/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author hp
 */
public class employeeData {
    
    private ArrayList<employeeDetalis> data;
    public employeeData()
    {
        this.data = new ArrayList<employeeDetalis>();
    }

    public ArrayList<employeeDetalis> getData() {
        return data;
    }

    public void setData(ArrayList<employeeDetalis> data) {
        this.data = data;
    }
    
    public employeeDetalis addNewEmployee()
    {
        employeeDetalis newEmployee = new employeeDetalis();
        data.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(employeeDetalis d)
    {
        data.remove(d);
    }
    
}
