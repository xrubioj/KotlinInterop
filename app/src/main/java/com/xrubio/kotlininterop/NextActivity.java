package com.xrubio.kotlininterop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NextActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        this.getSupportActionBar().setTitle("Activity B");

        ButterKnife.bind(this);

        textView.setText("Injected! It worked!");
    }
}
