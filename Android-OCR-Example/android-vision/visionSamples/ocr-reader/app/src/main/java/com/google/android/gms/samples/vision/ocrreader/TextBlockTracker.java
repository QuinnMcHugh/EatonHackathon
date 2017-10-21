package com.google.android.gms.samples.vision.ocrreader;

import com.google.android.gms.vision.text.TextBlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quinnmchugh on 10/21/17.
 */

public class TextBlockTracker {
    private static List<TextBlock> blocks = new ArrayList<>();

    public static void addBlock(TextBlock block){
        TextBlockTracker.blocks.add(block);
    }


}
