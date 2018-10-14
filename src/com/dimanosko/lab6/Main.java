package com.dimanosko.lab6;

import com.dimanosko.lab6.controller.RectangleController;
import com.dimanosko.lab6.model.Rectangle;
import com.dimanosko.lab6.service.impl.RectangleServiceImpl;

public class Main {
    public static void main(String[] args) {
        RectangleController controller = new RectangleController(new RectangleServiceImpl());
        Rectangle rectangle = new Rectangle(15,10, "yellow");

        controller.calculateArea(rectangle);
        controller.calculatePerimetr(rectangle);

        System.out.println(rectangle);
    }
}
