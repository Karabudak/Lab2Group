package org.example.week2;

public class Student {
    private String name;
    private String surname;
    private String id;
    private String major;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name, String surname, String id, String major) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.major = major;
    }
}
