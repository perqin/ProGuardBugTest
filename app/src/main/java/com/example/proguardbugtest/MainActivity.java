package com.example.proguardbugtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.base.Account;
import com.example.gui.GuiMain;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("account: " + new Account());
        System.out.println("account name: " + new GuiMain().tryGetAccountName());

        findViewById(R.id.startButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra("meta", new SerializableMeta("Perqin", 233));
                startActivity(intent);
            }
        });
    }
}
