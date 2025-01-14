package org.example.model;

public class Wall {
    private String direction;

    //constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    //getter
    public String getDirection() {
        return direction;
    }

    //method
    public void create() {
        System.out.println("Wall has been built.");
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
