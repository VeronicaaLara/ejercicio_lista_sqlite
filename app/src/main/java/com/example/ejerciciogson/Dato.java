package com.example.ejerciciogson;

public class Dato {


    private String name;
    private String email;

    public Dato(String name, String email){

        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Dato{" +
                "name='" + name + '\'' +
                ", email=" + email +
                '}';
    }
}
