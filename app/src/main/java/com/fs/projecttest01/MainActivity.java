package com.fs.projecttest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private CurveLineDelegate dv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dv = new CurveLineDelegate(this, R.layout.activity_main);
        setContentView(dv.getContentView());
        getSupportActionBar().hide();
        dv.setTitle("主界面");
        dv.setName("张立松");
    }

}
