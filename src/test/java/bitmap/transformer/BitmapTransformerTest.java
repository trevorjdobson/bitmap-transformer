package bitmap.transformer;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BitmapTransformerTest {
    BitmapTransformer classOnTheTest = new BitmapTransformer();
    String path = "./src/main/resources/images/coffee.bmp";
    String outPutPath = "./src/main/resources/images/";

    @Test
    public void changeToGrey() throws IOException {
            assertEquals("Grey Success",classOnTheTest.changeToGrey(path,outPutPath+"grey.bmp"));
    }

    @Test
    public void flipImage() throws IOException {
        assertEquals("Flip Success",classOnTheTest.flipImage(path,outPutPath+"flip.bmp"));
    }

    @Test
    public void resize() throws IOException {
        assertEquals("Resize Success",classOnTheTest.resize(path,outPutPath+"resized.bmp"));
    }
}
