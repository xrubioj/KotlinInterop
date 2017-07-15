package com.xrubio.kotlininterop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSupportActionBar().setTitle("Activity A");

        ButterKnife.bind(this);

        textView.setText("Injected! It worked!");
    }

    @OnClick(R.id.button_next)
    @SuppressWarnings("unused")
    public void onButtonNext() {
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}
