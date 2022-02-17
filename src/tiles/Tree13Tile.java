package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree13Tile extends Tile{
    public Tree13Tile(int id) {
        super(Assets.tree13, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
