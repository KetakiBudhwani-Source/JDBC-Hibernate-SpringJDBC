package com.ketaki;



import jakarta.persistence.*;

import java.util.List;

@Entity
public class Person {

    @Id
    private int pid;
    private String pname;
    private String tech;
    //@OneToOne
    //private Laptop laptop;
   // @OneToMany(mappedBy = "person")
//    @ManyToMany
//    private List<Laptop> laptops;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop> laptops;
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    /*public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
