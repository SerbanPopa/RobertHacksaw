package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class SoldierGrassUpTile extends Tile{
    public SoldierGrassUpTile(int id) {
        super(Assets.soldier_grass_1, id);
    }

    public boolean isEnemy(){return true;}
}
