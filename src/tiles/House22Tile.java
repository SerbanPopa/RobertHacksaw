package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class House22Tile extends Tile{
    public House22Tile(int id) {
        super(Assets.house22, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
