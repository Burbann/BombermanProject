package com.company.characters;

abstract public class Character {
    private int x;
    private int y;

    public Character(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void move();
    public abstract void die();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
