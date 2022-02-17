package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree11Tile extends Tile{
    public Tree11Tile(int id) {
        super(Assets.tree11, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
