package entities.creatures;

import gfx.Animation;
import gfx.Assets;
import main.Game;
import main.Handler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Creature{

    private Animation animDown, animUp, animLeft, animRight;

    public Player(Handler handler, float x, float y){
        super(handler, x,y, Creature.DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);

        bounds.x=0;
        bounds.y=0;
        bounds.width=48;
        bounds.height=48;

        animDown=new Animation(500, Assets.doctor_down);
        animUp=new Animation(500, Assets.doctor_up);
        animLeft=new Animation(500, Assets.doctor_left);
        animRight=new Animation(500, Assets.doctor_right);

    }

    @Override
    public void tick() {
        animDown.tick();
        animUp.tick();
        animLeft.tick();
        animRight.tick();

        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
    }

    private void getInput(){
        xMove=0;
        yMove=0;

        if(handler.getKeyManager().up){
            yMove=-speed;
        }
        if(handler.getKeyManager().down){
            yMove=speed;
        }
        if(handler.getKeyManager().left){
            xMove=-speed;
        }
        if(handler.getKeyManager().right){
            xMove=speed;
        }
    }

    @Override
    public void render(Graphics g) {

        g.drawImage(getCurrentAnimationFrame(),(int) (x-handler.getGameCamera().getxOffset()),(int) (y-handler.getGameCamera().getyOffset()) ,width,height,null);

    }

    private BufferedImage getCurrentAnimationFrame(){
        if (xMove < 0) {
            return animLeft.getCurrentFrames();
        }else if(xMove>0){
            return animRight.getCurrentFrames();
        }else if(yMove<0){
            return animUp.getCurrentFrames();
        }else{
            return animDown.getCurrentFrames();
        }
    }
}
