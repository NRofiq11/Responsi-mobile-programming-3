package com.example.responsmp3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.responsmp3.R;

import static com.example.responsmp3.view.LoginActivity.fromHtml;

public class RecoveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);
        TextView tvRecovery= (TextView)findViewById(R.id.tvRecovery);

        tvRecovery.setText(fromHtml("Back to " +
                "</font><font color='#FF7600'>Login</font>"));
        tvRecovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecoveryActivity.this, LoginActivity.class));
            }
        });
    }
    public static Spanned fromHtml(String html){
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        }else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}