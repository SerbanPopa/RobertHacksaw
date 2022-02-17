package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class SoldierStoneDownTile extends Tile{
    public SoldierStoneDownTile(int id) {
        super(Assets.soldier_stone2, id);
    }

    public boolean isEnemy(){return true;}
}
