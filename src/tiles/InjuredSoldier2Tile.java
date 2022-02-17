package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class InjuredSoldier2Tile extends Tile{
    public InjuredSoldier2Tile(int id) {
        super(Assets.injured2, id);
    }
    @Override
    public boolean isAlly(){return true;}
}
