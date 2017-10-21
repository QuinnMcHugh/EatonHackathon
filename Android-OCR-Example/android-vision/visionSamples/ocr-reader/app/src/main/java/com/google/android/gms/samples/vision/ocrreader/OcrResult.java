package com.google.android.gms.samples.vision.ocrreader;

import android.graphics.Point;
import android.util.Log;

import com.google.android.gms.vision.text.Text;
import com.google.android.gms.vision.text.TextBlock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by quinnmchugh on 10/21/17.
 */

public class OcrResult {
    private Map<String, String> machineInfo;

    public OcrResult(List<TextBlock> inputBlocks){
        machineInfo = new HashMap<>();
        this.parseInput(inputBlocks);
    }

    private void parseInput(List<TextBlock> inputBlocks){
        for (TextBlock block : inputBlocks){
            if (block.getComponents().isEmpty()) {
                Log.d("D", "Value: " + block.getValue());
                for (Point point : block.getCornerPoints()) {
                    Log.d("D", "Point: " + point.toString());
                }
            } else {
                for (Text line : block.getComponents()) {
                    Log.d("D", "Value: " + line.getValue());
                    for (Point point : line.getCornerPoints()) {
                        Log.d("D", "Point: " + point.toString());
                    }
                }
            }
        }
    }
}
