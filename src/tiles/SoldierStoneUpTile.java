package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class SoldierStoneUpTile extends Tile{
    public SoldierStoneUpTile(int id) {
        super(Assets.soldier_stone_1, id);
    }

    public boolean isEnemy(){return true;}
}
