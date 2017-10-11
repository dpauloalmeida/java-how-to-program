package com.deitel.exercicios.Capitulo24.Cap24_4;

import java.util.Calendar;

import java.util.Calendar;

public class Employees {
    private String socialNumber;
    private String firstName;
    private String lastName;
    private Calendar birthday;
    private String employeetype;
    private String departamentName;

    public Employees(String firstName, String lastName, Calendar birthday,
                    String employeetype, String departamentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.employeetype = employeetype;
        this.departamentName = departamentName;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getEmployeetype() {
        return employeetype;
    }

    public String getDepartamentName() {
        return departamentName;
    }


}
