package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("MyBedroom",
                new Wall("north"),
                new Wall("west"),
                new Wall("south"),
                new Wall("east"),
                new Ceiling(5, PaintColor.WHITE),
                new Bed("normal", 2, 2, 1, 0),
                new Lamp(LampType.LAVA, true, 10),
                new Wardrobe(1, 2, 20.5),
                new Carpet(2,3, PaintColor.RED));

        System.out.println(bedroom);
    }
}