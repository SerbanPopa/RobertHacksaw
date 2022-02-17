package tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    public static Tile[] tiles=new Tile[256];
    public static Tile dirtTile=new DirtTile(0);
    public static Tile grassTile=new GrassTile(1);
    public static Tile wallTile=new WallTile(2);
    public static Tile wallLeftTile=new WallLeftTile(21);
    public static Tile wallRightTile=new WallRightTile(22);
    public static Tile waterTile=new WaterTile(3);
    public static Tile rockTile=new RockTile(4);
    public static Tile pathwayTile=new PathwayTile(5);
    public static Tile sandTile=new SandTile(6);
    public static Tile bridge1Tile=new Bridge1Tile(7);
    public static Tile bridge2Tile=new Bridge2Tile(8);
    public static Tile bridge3Tile=new Bridge3Tile(9);
    public static Tile logTile=new LogTile(10);
    public static Tile stoneTile=new StoneTile(11);
    public static Tile house11Tile=new House11Tile(91);
    public static Tile house12Tile=new House12Tile(92);
    public static Tile house13Tile=new House13Tile(93);
    public static Tile house21Tile=new House21Tile(94);
    public static Tile house22Tile=new House22Tile(95);
    public static Tile house23Tile=new House23Tile(96);
    public static Tile house31Tile=new House31Tile(97);
    public static Tile house32Tile=new House32Tile(98);
    public static Tile house33Tile=new House33Tile(99);
    public static Tile tree11Tile=new Tree11Tile(81);
    public static Tile tree12Tile=new Tree12Tile(82);
    public static Tile tree13Tile=new Tree13Tile(83);
    public static Tile tree21Tile=new Tree21Tile(84);
    public static Tile tree22Tile=new Tree22Tile(85);
    public static Tile tree23Tile=new Tree23Tile(86);
    public static Tile tree31Tile=new Tree31Tile(87);
    public static Tile tree32Tile=new Tree32Tile(88);
    public static Tile tree33Tile=new Tree33Tile(89);
    public static Tile injured1Tile=new InjuredSoldier1Tile(40);
    public static Tile injured2Tile=new InjuredSoldier2Tile(41);
    public static Tile soldierStoneUpTile=new SoldierStoneUpTile(50);
    public static Tile soldierStoneDownTile=new SoldierStoneDownTile(51);
    public static Tile soldierGrassUpTile=new SoldierGrassUpTile(60);
    public static Tile soldierGrassDownTile=new SoldierGrassDownTile(61);


    public static final int TILEWIDTH=48, TILEHEIGHT=48;
    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id){
        this.texture=texture;
        this.id=id;

        tiles[id]=this;
    }

    public void tick(){

    }

    public void render(Graphics g, int x, int y){
        g.drawImage(texture,x,y,TILEWIDTH,TILEHEIGHT,null);
    }

    public boolean isSolid(){
        return false;
    }
    public boolean isEnemy(){return false;}
    public boolean isAlly(){return false;}
    public int getId(){
        return id;
    }
}
