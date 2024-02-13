package com.example.demo;

public class Student {

    private String nom;
    private String prenom;
    public Student(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom() {
        this.prenom = prenom;
    }
}
