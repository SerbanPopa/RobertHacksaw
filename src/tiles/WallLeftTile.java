package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class WallLeftTile extends Tile{
    public WallLeftTile(int id) {
        super(Assets.wall_left, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}
