package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House31Tile extends Tile{
    public House31Tile(int id) {
        super(Assets.house31, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
