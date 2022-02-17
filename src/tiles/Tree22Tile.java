package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree22Tile extends Tile{
    public Tree22Tile(int id) {
        super(Assets.tree22, id);
    }
    @Override
    public boolean isSolid(){return true;}
}
