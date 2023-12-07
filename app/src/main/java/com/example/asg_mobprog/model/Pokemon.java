package com.example.asg_mobprog.model;

public class Pokemon {

    public String name;
    public int height;
//    public String image;
    public int weight;

    // Add more fields as needed based on the PokeAPI response

//    public Pokemon(String name,String image, int height, int weight) {
//        this.name = name;
//        this.height = height;
//        this.image = image;
//        this.weight = weight;
//    }
    public Pokemon(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    public int getImage() {
        return weight;
    }
    // Add getter methods for other fields as needed
}
