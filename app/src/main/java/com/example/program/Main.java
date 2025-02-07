package com.example.program;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.my_framework.CoreFW;
import com.example.my_framework.SceneFW;
import com.example.program.scenes.MainMenuScene;

public class Main extends CoreFW {
    public SceneFW getStartScene() {
        return new MainMenuScene(this);
    }

}