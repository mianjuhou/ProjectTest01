package com.fs.projecttest01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by fangdean on 2016/3/15.
 */
public class CurveLineDelegate extends ViewDelegate {

    public CurveLineDelegate(Context context, int layout) {
        super(context, layout);
    }

    public CurveLineDelegate(LayoutInflater inflater, int layout) {
        super(inflater, layout);
    }

    public void setName(final String name){
        getButton(R.id.btn_set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getTextView(R.id.tv_name).setText(name);
            }
        });
    }
    
}
