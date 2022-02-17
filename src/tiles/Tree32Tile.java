package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree32Tile extends Tile{
    public Tree32Tile(int id) {
        super(Assets.tree32, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
