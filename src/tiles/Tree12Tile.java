package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree12Tile extends Tile{
    public Tree12Tile(int id) {
        super(Assets.tree12, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
