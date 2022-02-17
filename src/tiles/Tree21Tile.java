package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree21Tile extends Tile{
    public Tree21Tile(int id) {
        super(Assets.tree21, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
