package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class InjuredSoldier1Tile extends Tile{
    public InjuredSoldier1Tile(int id) {
        super(Assets.injured1, id);
    }
    @Override
    public boolean isAlly(){return true;}
}
