package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House12Tile extends Tile{
    public House12Tile(int id) {
        super(Assets.house12, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
