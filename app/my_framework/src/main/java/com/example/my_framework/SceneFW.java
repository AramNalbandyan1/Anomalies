package com.example.my_framework;

public abstract class SceneFW {
    public CoreFW coreFW;
    public int sceneWidth;
    public int sceneHeight;
    public GraphicsFW graphicsFW;
    public SceneFW(CoreFW coreFW){
        this.coreFW = coreFW;
        sceneWidth = coreFW.getGraphicsFW().getWidthFrameBuffer();
        sceneHeight = coreFW.getGraphicsFW().getHeigthFrameBuffer();
        graphicsFW = coreFW.getGraphicsFW();
    }
    public abstract void update();
    public abstract void drawing();
    public abstract void pause();
    public abstract void resume();
    public abstract void dispose();
}
