package model;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Person {
    private int id;
    private String name;
    private String photo;
    private ArrayList<String> idActivities;

    public Person() {
    }

    public Person(int id, String name, String photo,
                  ArrayList<String> idActivities) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.idActivities = idActivities;
    }

    public Person(int id, String name, String photo) {
        this.id = id;
        this.name = name;
        this.photo = photo;
    }


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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ArrayList<String> getIdActivities() {
        return idActivities;
    }

    public void setIdActivities(ArrayList<String> hobbies) {
        this.idActivities= idActivities;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
