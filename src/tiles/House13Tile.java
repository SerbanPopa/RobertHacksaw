package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House13Tile extends Tile{
    public House13Tile(int id) {
        super(Assets.house13, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
