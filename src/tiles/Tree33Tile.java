package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree33Tile extends Tile{
    public Tree33Tile(int id) {
        super(Assets.tree33, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
