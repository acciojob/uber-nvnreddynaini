package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer perKmRate;
    boolean available;

    @OneToOne(mappedBy = "cab", cascade = CascadeType.ALL)
    private Driver driver;

    public Cab(Integer id, Integer perKmRate, boolean available) {
        this.id = id;
        this.perKmRate = perKmRate;
        this.available = available;
    }

    public Cab(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public Cab() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(Integer perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}