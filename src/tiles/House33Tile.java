package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House33Tile extends Tile{
    public House33Tile(int id) {
        super(Assets.house33, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
