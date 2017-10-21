package com.google.android.gms.samples.vision.ocrreader;

import com.google.android.gms.vision.text.TextBlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quinnmchugh on 10/21/17.
 */

public class TextBlockTracker {
    private static List<TextBlock> blocks = new ArrayList<>();

    public static List<TextBlock> getBlocks(){ return blocks; }

    private static boolean isOn = false;

    public static void turnOn(){ isOn = true; }
    public static void turnOff(){ isOn = false; }

    public static boolean getStatus(){ return isOn; }

    public static void addBlock(TextBlock block){
        if (getStatus() == true){
            TextBlockTracker.blocks.add(block);
        }
    }

}
