package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House32Tile extends Tile{
    public House32Tile(int id) {
        super(Assets.house32, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
