package ru.netology.childclass;

import ru.netology.parentclass.Product;

public class Smartphohe extends Product {
    protected String maker;

    public Smartphohe(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
    }

}
