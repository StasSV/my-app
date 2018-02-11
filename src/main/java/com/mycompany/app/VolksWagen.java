package com.mycompany.app;



import java.util.List;

public class VolksWagen implements Autodrom {
    private Beep beep;
    private List<Driver> drivers;

    public VolksWagen() { }

    public void beep() {
        System.out.println("beeeep");
        beep.BeeepBeep();
    }
    
    public void setBeep(Beep beep) {
        this.beep = beep;
    }

    public void makeBeep(Beep beep){
     this.beep = beep;
    }
    

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public void people() {
        System.out.println("");
        for (Person p : drivers) {
            p.personInfo();
            System.out.println("Let's drive");
        }
        System.out.println("Reached final point");
    }

}
