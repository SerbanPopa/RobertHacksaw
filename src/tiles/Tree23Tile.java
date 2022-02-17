package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree23Tile extends Tile{
    public Tree23Tile(int id) {
        super(Assets.tree23, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
