package Tile;

import TheGame.Id;

import java.awt.*;

public class Tile {
    public int x, y;
    public int width, height;

    public boolean solid;
    public Id id;

    public Tile(int x, int y, int width, int height, boolean solid, Id id){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.solid = solid;
        this.id height = id;
    }
    public void render(Graphics g) {

    }
    public void tick(){
        x+=velX;
        y+=velY;

    }
    public int velX, velY;

    public void setVelX(int velX) {
        this.velX = velX;
    }
    public void setVelY(int velY) {
        this.velY = velY;
    }
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
    public boolean isSolid() {
        return solid;
    }
    public void setSolid(boolean solid) {
        this.solid = solid;
    }
    public Id getId(){return id;}


}
