package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class BitmapTransformer {

    public  String changeToGrey(String PATH, String outputPath) throws IOException {
        int width, height;  //Variable declarations
        File bmpFile = new File (PATH);
        BufferedImage bmpImage = ImageIO.read(bmpFile);
        width = bmpImage.getWidth();
        height = bmpImage.getHeight();

        for (int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                Color mycolor = new Color(bmpImage.getRGB(x, y));
                if (mycolor.getBlue() == 0 && mycolor.getRed() == 0 && mycolor.getGreen() == 0) {
                    Color grey = new Color(100,100,100);
                    int rgb = grey.getRGB();
                    bmpImage.setRGB(x, y, rgb );

                }

            }
        }

        File outfile = new File(outputPath);
        ImageIO.write(bmpImage, "bmp", outfile);


        return "Grey Success";
    }


    public String flipImage(String PATH, String outputPath) throws IOException {
        int width, height;  //Variable declarations
        File bmpFile = new File (PATH);
        BufferedImage bmpImage = ImageIO.read(bmpFile);
        width = bmpImage.getWidth();
        height = bmpImage.getHeight();


        int[][] pixels = new int[width][height];
        for( int i = 0; i < width; i++ )
            for( int j = 0; j < height; j++ )
                pixels[i][j] = bmpImage.getRGB( i, j );

        for(int i = 0; i < pixels.length / 2; i++) {
            int[] temp = pixels[i];
            pixels[i] = pixels[pixels.length - i - 1];
            pixels[pixels.length - i - 1] = temp;
        }
        for(int j = 0; j < pixels.length; j++){
            for(int i = 0; i < pixels[j].length / 2; i++) {
                int temp = pixels[j][i];
                pixels[j][i] = pixels[j][pixels[j].length - i - 1];
                pixels[j][pixels[j].length - i - 1] = temp;
            }
        }


        for(int j = 0; j < pixels.length; j++){
            for(int i = 0; i < pixels[j].length; i++) {
                int rgb = pixels[j][i];
                bmpImage.setRGB(j, i, rgb );

            }
        }

        File outfile = new File(outputPath);
        ImageIO.write(bmpImage, "bmp", outfile);


        return "Flip Success";


    }



    public String resize(String PATH, String outputPath) throws IOException {
        System.out.println("in resize");
        File bmpFile = new File (PATH);
        BufferedImage bmpImage = ImageIO.read(bmpFile);

        Image tmp = bmpImage.getScaledInstance(bmpImage.getWidth(), bmpImage.getHeight(), Image.SCALE_SMOOTH);

        BufferedImage resized = new BufferedImage(bmpImage.getWidth()/2 + 50, bmpImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        File outfile = new File(outputPath);
        ImageIO.write(resized, "png", outfile);

        return "Resize Success";

    }
}
