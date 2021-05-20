package com.company.elements;

public class Bomb {
    private int rangeX;
    private int rangeY;
    private int time;

    public Bomb(int rangeX, int rangeY, int time) {
        this.rangeX = rangeX;
        this.rangeY = rangeY;
        this.time = time;
    }

    public int getRangeX() {
        return rangeX;
    }

    public void setRangeX(int rangeX) {
        this.rangeX = rangeX;
    }

    public int getRangeY() {
        return rangeY;
    }

    public void setRangeY(int rangeY) {
        this.rangeY = rangeY;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
