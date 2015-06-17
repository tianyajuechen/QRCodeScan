package com.example.qrcodescan;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by YANG
 * 2015/5/27 14:06
 */
public class CodeInfoActivity extends Activity{

    private EditText et_info;
    private ImageView iv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.code_info_layout);

        Bundle bundle = getIntent().getExtras();
        String code_info = bundle.getString("result");
        Bitmap bitmap = bundle.getParcelable("bitmap");
        et_info = (EditText) findViewById(R.id.et_info);
        iv = (ImageView) findViewById(R.id.iv_iamge);
        et_info.setText(code_info);
        iv.setImageBitmap(bitmap);
    }
}