package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class LogTile extends Tile{
    public LogTile(int id) {
        super(Assets.log, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}
