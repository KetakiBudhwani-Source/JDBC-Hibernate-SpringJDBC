package com.ketaki;

import jakarta.persistence.*;

import java.util.List;

//@Embeddable

@Entity
@Cacheable
public class Laptop {

    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;
    //@ManyToOne
    //private Person person;
//    @ManyToMany(mappedBy = "laptops")
//    private List<Person> persons;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    /*public void setPerson(Person person) {
        this.person = person;
    }*/

   /* public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }*/
    /* @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }*/

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
