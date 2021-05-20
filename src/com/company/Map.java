package com.company;

import com.company.characters.Enemy;
import com.company.elements.Stone;

import java.util.ArrayList;

public class Map {
    private int sizeX;
    private int sizeY;
    private ArrayList<Stone> stones = new ArrayList<>();
    private ArrayList<Enemy> enemies = new ArrayList<>();

    public Map(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public ArrayList<Stone> getStones() {
        return stones;
    }

    public void setStones(ArrayList<Stone> stones) {
        this.stones = stones;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }
}
