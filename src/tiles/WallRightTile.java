package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class WallRightTile extends Tile{
    public WallRightTile(int id) {
        super(Assets.wall_right, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}