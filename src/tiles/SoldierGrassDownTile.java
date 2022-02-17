package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class SoldierGrassDownTile extends Tile{
    public SoldierGrassDownTile(int id) {
        super(Assets.soldier_grass2, id);
    }

    public boolean isEnemy(){return true;}
}
