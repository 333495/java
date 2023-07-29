package org.cfx.test5;

import java.util.Objects;

/**
 * @author RTX 9090
 */
public class TransRecord implements Comparable{
    private String name;
    private Integer price;
    private String description;
    private String color;
    private String address;
    private String people;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }


    public TransRecord(String name, Integer price, String description, String color, String address, String people) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.color = color;
        this.address = address;
        this.people = people;
    }

    public TransRecord() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransRecord)) return false;
        TransRecord that = (TransRecord) o;
        return Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(description, that.description) && Objects.equals(color, that.color) && Objects.equals(address, that.address) && Objects.equals(people, that.people);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, color, address, people);
    };

    @Override
    public String toString() {
        return "TransRecord{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", people='" + people + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        TransRecord trans = (TransRecord)o;
        return this.getPrice() - trans.getPrice();
    }
}
