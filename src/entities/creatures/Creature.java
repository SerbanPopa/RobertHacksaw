package entities.creatures;

import entities.Entity;
import main.Game;
import main.Handler;
import tiles.Tile;

public abstract class Creature extends Entity {

    public static final int DEFAULT_HEALTH=1;
    public static final float DEFAULT_SPEED=1.0f;
    public int score=0;
    public static final int DEFAULT_CREATURE_WIDTH = 48,DEFAULT_CREATURE_HEIGHT=48;

    protected int health;
    protected float speed;
    protected float xMove,yMove;


    public Creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        health=DEFAULT_HEALTH;
        speed=DEFAULT_SPEED;
        xMove=0;
        yMove=0;
    }

    public void move(){
        moveX();
        moveY();
    }

    public void moveX(){
       if(xMove>0){
            int tx=(int) (x+xMove+bounds.x+bounds.width)/ Tile.TILEWIDTH;
            if(!collisionWithTile(tx, (int)(y+bounds.y)/Tile.TILEHEIGHT)&&
            !collisionWithTile(tx,(int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT)){
                x+=xMove;
            }else{
                x=tx*Tile.TILEWIDTH-bounds.x-bounds.width-1;
            }
           if(!collisionWithEnemy(tx, (int)(y+bounds.y)/Tile.TILEHEIGHT)&&
                   !collisionWithEnemy(tx,(int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT)){
               x+=xMove;
           }else{
               x=1;
               y=1;
               System.out.println("Time spent with your comrades: "+score);
               System.exit(0);
           }
           if(!collisionWithAlly(tx, (int)(y+bounds.y)/Tile.TILEHEIGHT)&&
                   !collisionWithAlly(tx,(int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT)){
               x+=xMove;
           }else{
               score++;
           }
       }else if(xMove<0){
           int tx=(int) (x+xMove+bounds.x)/ Tile.TILEWIDTH;
           if(!collisionWithTile(tx, (int)(y+bounds.y)/Tile.TILEHEIGHT)&&
                   !collisionWithTile(tx,(int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT)){
               x+=xMove;
           }else{
               x=tx*Tile.TILEWIDTH+Tile.TILEWIDTH-bounds.x;
           }
           if(!collisionWithEnemy(tx, (int)(y+bounds.y)/Tile.TILEHEIGHT)&&
                   !collisionWithEnemy(tx,(int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT)){
               x+=xMove;
           }else{
               x=1;
               y=1;
               System.out.println("Time spent with your comrades: "+score);
               System.exit(0);
           }
           if(!collisionWithAlly(tx, (int)(y+bounds.y)/Tile.TILEHEIGHT)&&
                   !collisionWithAlly(tx,(int)(y+bounds.y+bounds.height)/Tile.TILEHEIGHT)){
               x+=xMove;
           }else{
               score++;
           }
       }
    }

    public void moveY(){
        if(yMove<0){
            int ty=(int)(y+yMove+ bounds.y)/Tile.TILEHEIGHT;

            if(!collisionWithTile((int)(x+bounds.x)/Tile.TILEWIDTH,ty)&&
                    !collisionWithTile((int)(x+bounds.x+bounds.width)/Tile.TILEWIDTH,ty)){
                y+=yMove;
            }else{
                y=ty*Tile.TILEHEIGHT+Tile.TILEHEIGHT-bounds.y;
            }
            if(!collisionWithEnemy((int)(x+bounds.x)/Tile.TILEWIDTH,ty)&&
                    !collisionWithEnemy((int)(x+bounds.x+bounds.width)/Tile.TILEWIDTH,ty)){
                y+=yMove;
            }else{
                x=1;
                y=1;
                System.out.println("Time spent with your comrades: "+score);
                System.exit(0);
            }
            if(!collisionWithAlly((int)(x+bounds.x)/Tile.TILEWIDTH,ty)&&
                    !collisionWithAlly((int)(x+bounds.x+bounds.width)/Tile.TILEWIDTH,ty)){
                y+=yMove;
            }else{
                score++;
            }
        }else if(yMove>0){
            int ty=(int)(y+yMove+ bounds.y+bounds.height)/Tile.TILEHEIGHT;

            if(!collisionWithTile((int)(x+bounds.x)/Tile.TILEWIDTH,ty)&&
                    !collisionWithTile((int)(x+bounds.x+bounds.width)/Tile.TILEWIDTH,ty)){
                y+=yMove;
            }else{
                y=ty*Tile.TILEHEIGHT - bounds.y-bounds.height-1;
            }
            if(!collisionWithEnemy((int)(x+bounds.x)/Tile.TILEWIDTH,ty)&&
                    !collisionWithEnemy((int)(x+bounds.x+bounds.width)/Tile.TILEWIDTH,ty)){
                y+=yMove;
            }else{
                x=1;
                y=1;
                System.out.println("Time spent with your comrades: "+score);
                System.exit(0);
            }
            if(!collisionWithAlly((int)(x+bounds.x)/Tile.TILEWIDTH,ty)&&
                    !collisionWithAlly((int)(x+bounds.x+bounds.width)/Tile.TILEWIDTH,ty)){
                y+=yMove;
            }else{
                score++;
            }
        }
    }

    protected boolean collisionWithTile(int x, int y){
        return handler.getWorld().getTile(x,y).isSolid();
    }
    protected boolean collisionWithEnemy(int x, int y){
        return handler.getWorld().getTile(x,y).isEnemy();
    }
    protected boolean collisionWithAlly(int x, int y){
        return handler.getWorld().getTile(x,y).isAlly();
    }

    public float getxMove() {
        return xMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
