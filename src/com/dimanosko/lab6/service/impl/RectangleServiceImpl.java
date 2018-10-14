package com.dimanosko.lab6.service.impl;

import com.dimanosko.lab6.model.Rectangle;
import com.dimanosko.lab6.service.RectangleService;

public class RectangleServiceImpl implements RectangleService {

    @Override
    public Rectangle perimetr(Rectangle rectangle) {
        rectangle.setPerimetr((rectangle.getSideA() + rectangle.getSideB()) * 2);
        return  rectangle;
    }

    @Override
    public Rectangle area(Rectangle rectangle) {
        rectangle.setAre(rectangle.getSideA() * rectangle.getSideB());
        return rectangle;
    }
}
