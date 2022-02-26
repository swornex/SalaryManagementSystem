package com.iims.models;

public class Employee {
    private int id;
    private String name, address, contact, departmentName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee() {
    }

    public Employee(int id, String name, String address, String contact, String departmentName) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.departmentName = departmentName;
    }

    public Employee(String name, String address, String contact, String departmentName) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
