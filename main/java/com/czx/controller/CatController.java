package main.java.com.czx.controller;

import main.java.com.czx.entity.Cat;

class CatController{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("狸狸");
        cat.run();
    }
}