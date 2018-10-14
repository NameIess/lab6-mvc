package com.dimanosko.lab6.controller;

import com.dimanosko.lab6.model.Rectangle;
import com.dimanosko.lab6.service.RectangleService;

public class RectangleController {
    private RectangleService rectangleService;

    public RectangleController(RectangleService rectangleService) {
        this.rectangleService = rectangleService;
    }

    public Rectangle calculateArea(Rectangle rectangle) {
        return rectangleService.area(rectangle);
    }

    public Rectangle calculatePerimetr(Rectangle rectangle) {
        return  rectangleService.perimetr(rectangle);
    }
}
