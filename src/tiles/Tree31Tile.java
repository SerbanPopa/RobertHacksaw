package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree31Tile extends Tile{
    public Tree31Tile(int id) {
        super(Assets.tree31, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
