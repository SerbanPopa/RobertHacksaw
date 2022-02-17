package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House23Tile extends Tile{
    public House23Tile(int id) {
        super(Assets.house23, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
