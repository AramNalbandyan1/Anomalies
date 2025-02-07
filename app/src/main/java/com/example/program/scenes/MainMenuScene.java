package com.example.program.scenes;

import android.graphics.Color;

import com.example.my_framework.CoreFW;
import com.example.my_framework.SceneFW;
import com.example.program.R;

public class MainMenuScene extends SceneFW {


    public MainMenuScene(CoreFW coreFW) {
        super(coreFW);
    }

    @Override
    public void update() {

    }

    @Override
    public void drawing() {
        graphicsFW.clearScene(Color.BLACK);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_nameGame),100,100,Color.GREEN,60,null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_newGame),20,300,Color.GREEN,40,null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_nameGame),20,350,Color.GREEN,40,null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_nameGame),20,400,Color.GREEN,40,null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_nameGame),20,450,Color.GREEN,40,null);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
