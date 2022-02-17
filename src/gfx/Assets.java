package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 48, height = 48;

    public static BufferedImage dirt, stone, sand, rock, water, log, bridge1, bridge2, bridge3;
    public static BufferedImage wall_left, wall_corner_left, wall, wall_corner_right, wall_right, grass, pathway;
    public static BufferedImage house11, house12, house13, house21, house22, house23, house31, house32, house33;
    public static BufferedImage bloc11, bloc12, bloc13, bloc21, bloc22, bloc23, bloc31, bloc32, bloc33;
    public static BufferedImage hole11, hole12, hole13, hole21, hole22, hole23, hole31, hole32, hole33;
    public static BufferedImage tree11, tree12, tree13, tree21, tree22, tree23, tree31, tree32, tree33;
    public static BufferedImage injured1, injured2, soldier_stone_1, soldier_stone2, soldier_grass_1, soldier_grass2;
    public static BufferedImage ltree11, ltree12, ltree21, ltree22, ltree31, ltree32;
    public static BufferedImage[] doctor_down, doctor_up, doctor_left, doctor_right;

    public static void init() {

        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Sprite.PNG"));
        SpriteSheet doctor = new SpriteSheet(ImageLoader.loadImage("/textures/RobertHacksaw.png"));

        doctor_down=new BufferedImage[2];
        doctor_up=new BufferedImage[2];
        doctor_left=new BufferedImage[2];
        doctor_right=new BufferedImage[2];

        doctor_down[0]=doctor.crop(1,1,width,height);
        doctor_down[1]=doctor.crop(48,1,width,height);
        doctor_left[0]=doctor.crop(1,48,width,height);
        doctor_left[1]=doctor.crop(48,48,width,height);
        doctor_right[0]=doctor.crop(1,96,width,height);
        doctor_right[1]=doctor.crop(48,96,width,height);
        doctor_up[0]=doctor.crop(1,144,width,height);
        doctor_up[1]=doctor.crop(48,144,width,height);


        dirt = sheet.crop(1, 1, width, height);
        stone = sheet.crop(49,1,width,height);
        sand= sheet.crop(97,1,width,height);
        rock=sheet.crop(145,1,width,height);
        water=sheet.crop(193,1,width,height);
        log=sheet.crop(241,1,width,height);
        bridge1=sheet.crop(289,1,width,height);
        bridge2=sheet.crop(337,1,width,height);
        bridge3=sheet.crop(385,1,width,height);
        wall_left=sheet.crop(433,1,width,height);
        wall_corner_left=sheet.crop(481,1,width,height);
        wall=sheet.crop(529,1,width,height);
        wall_corner_right=sheet.crop(577,1,width,height);
        wall_right=sheet.crop(625,1,width,height);
        grass= sheet.crop(673,1,width,height);
        pathway=sheet.crop(721,1,width,height);
        house11 = sheet.crop(1, 49, width, height);
        house12 = sheet.crop(49,49,width,height);
        house13= sheet.crop(97,49,width,height);
        bloc11=sheet.crop(145,49,width,height);
        bloc12=sheet.crop(193,49,width,height);
        bloc13=sheet.crop(241,49,width,height);
        hole11=sheet.crop(289,49,width,height);
        hole12=sheet.crop(337,49,width,height);
        hole13=sheet.crop(385,49,width,height);
        tree11=sheet.crop(433,49,width,height);
        tree12=sheet.crop(481,49,width,height);
        tree13=sheet.crop(529,49,width,height);
        injured1=sheet.crop(577,49,width,height);
        injured2=sheet.crop(625,49,width,height);
        ltree11= sheet.crop(673,49,width,height);
        ltree12=sheet.crop(721,49,width,height);
        house21 = sheet.crop(1, 97, width, height);
        house22 = sheet.crop(49,97,width,height);
        house23= sheet.crop(97,97,width,height);
        bloc21=sheet.crop(145,97,width,height);
        bloc22=sheet.crop(193,97,width,height);
        bloc23=sheet.crop(241,97,width,height);
        hole21=sheet.crop(289,97,width,height);
        hole22=sheet.crop(337,97,width,height);
        hole23=sheet.crop(385,97,width,height);
        tree21=sheet.crop(433,97,width,height);
        tree22=sheet.crop(481,97,width,height);
        tree23=sheet.crop(529,97,width,height);
        soldier_stone_1=sheet.crop(577,97,width,height);
        soldier_grass_1=sheet.crop(625,97,width,height);
        ltree21= sheet.crop(673,97,width,height);
        ltree22=sheet.crop(721,97,width,height);
        house31 = sheet.crop(1, 145, width, height);
        house32 = sheet.crop(49,145,width,height);
        house33= sheet.crop(97,145,width,height);
        bloc31=sheet.crop(145,145,width,height);
        bloc32=sheet.crop(193,145,width,height);
        bloc33=sheet.crop(241,145,width,height);
        hole31=sheet.crop(289,145,width,height);
        hole32=sheet.crop(337,145,width,height);
        hole33=sheet.crop(385,145,width,height);
        tree31=sheet.crop(433,145,width,height);
        tree32=sheet.crop(481,145,width,height);
        tree33=sheet.crop(529,145,width,height);
        soldier_stone2=sheet.crop(577,145,width,height);
        soldier_grass2=sheet.crop(625,145,width,height);
        ltree31= sheet.crop(673,145,width,height);
        ltree32=sheet.crop(721,145,width,height);

    }
}
