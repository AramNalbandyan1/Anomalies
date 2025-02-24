package com.example.my_framework;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

import java.io.IOException;
import java.io.InputStream;

public class GraphicsFW {
    private AssetManager  assetManager;
    private Bitmap frameBufferGame;
    private Canvas canvasGame;
    private Paint paintGame;
    private Bitmap  textureGame;

    public GraphicsFW(AssetManager assetManager, Bitmap frameBufferGame){
        this.assetManager = assetManager;
        this.frameBufferGame = frameBufferGame;
        this.canvasGame = new Canvas(frameBufferGame);
        this.paintGame = new Paint();
    }

    public void clearScene(int colorRGB){
        canvasGame.drawRGB( colorRGB, colorRGB, colorRGB);
    }

    public void drawPixel(int x, int y, int color){
        paintGame.setColor(color);
        canvasGame.drawPoint(x,y,paintGame);
    }

    public void drawLine(int startX, int startY, int stopX, int stopY, int color){
        paintGame.setColor(color);
        canvasGame.drawLine(startX, startY, stopX, stopY,paintGame);
    }

    public void drawText(String text, int x, int y, int color, int sizeText, Typeface font){
        paintGame.setColor(color);
        paintGame.setTextSize(sizeText);
        paintGame.setTypeface(font);
        canvasGame.drawText(text,x,y,paintGame);
    }

    public void drawTexture(Bitmap textureGame,int x, int y){
        canvasGame.drawBitmap(textureGame,x,y,null);
    }

    public int getWidthFrameBuffer(){
        return frameBufferGame.getWidth();
    }

    public int getHeigthFrameBuffer(){
        return frameBufferGame.getHeight();
    }

    public Bitmap newTexture(String fileName){
        InputStream inputStream = null;
        try{
            inputStream = assetManager.open(fileName);
            textureGame = BitmapFactory.decodeStream(inputStream);
            if(textureGame == null){
                throw new RuntimeException("Can not run this file" + fileName);
            }

        } catch (IOException e) {
            throw new RuntimeException("Can not run this file" + fileName);
        }

        if(inputStream != null){
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return textureGame;
    }


}
