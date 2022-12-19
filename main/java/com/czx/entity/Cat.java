package main.java.com.czx.entity;

public class Cat{
    private String name;

    public Cat() {
    
    }

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name);
    }
}