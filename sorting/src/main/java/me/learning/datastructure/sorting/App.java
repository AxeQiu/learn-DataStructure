package me.learning.datastructure.sorting;

import java.io.*;
import java.util.*;

import ar.com.hjg.pngj.ImageInfo;
import ar.com.hjg.pngj.PngWriter;
import ar.com.hjg.pngj.ImageLineInt;
import ar.com.hjg.pngj.chunks.PngChunkTextVar;
import ar.com.hjg.pngj.ImageLineHelper;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws Exception {

        File file = new File("test.png");
        FileOutputStream fos = new FileOutputStream(file);

        ImageInfo imi = new ImageInfo(800, 800, 8, false);

        // open image for writing to a output stream
        PngWriter png = new PngWriter(fos, imi);

        //add some optional metadata (chunks)
        png.getMetadata().setDpi(100.0);
        png.getMetadata().setTimeNow(0); // 0 seconds fron now = now
        png.getMetadata().setText(PngChunkTextVar.KEY_Title, "just a text image");
        png.getMetadata().setText("my key", "my text");

        Map<Integer, ImageLineInt> map = new LinkedHashMap<>(800, 1.0f);

        for (int x=799; x>=0; x--) {
            int y = x * x;
            ImageLineInt iline = new ImageLineInt(imi);
            for (int col = 0; col < imi.cols; col++) {
                int r = 0;
                int g = 0;
                int b = 0;
                ImageLineHelper.setPixelRGB8(iline, col, r, g, b);
            }
            if (y < 800 && y > 0) {
                ImageLineHelper.setPixelRGB8(iline, y, 255, 255, 255);
            }
            map.put(x, iline);
        }

        for (Integer row : map.keySet()) {
            png.writeRow(map.get(row));
        }
        png.end();
    }
}
