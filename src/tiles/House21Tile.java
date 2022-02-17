package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House21Tile extends Tile{
    public House21Tile(int id) {
        super(Assets.house21, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
