package com.iims.models;

public class Salary {
    private int id, employeeId, basicSalary, allowance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public Salary() {
    }

    public Salary(int id, int employeeId, int basicSalary, int allowance) {
        this.id = id;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    public Salary(int employeeId, int basicSalary, int allowance) {
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    public Salary(int basicSalary, int allowance){
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", basicSalary=" + basicSalary +
                ", allowance=" + allowance +
                '}';
    }
}
