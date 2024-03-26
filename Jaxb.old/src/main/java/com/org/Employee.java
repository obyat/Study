package com.org;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"name", "age"})
public class Employee {
    private String name;
    private int age;

    // Constructors, getters, and setters
    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Xml Element
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}