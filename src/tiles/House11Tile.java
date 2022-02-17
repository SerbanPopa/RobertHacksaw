package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House11Tile extends Tile{
    public House11Tile(int id) {
        super(Assets.house11, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
