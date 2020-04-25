package edu.fjnu.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private Button btn_show;
    private View view_loginout;
    private Context mContext;
    private AlertDialog alert = null;
    private AlertDialog.Builder builder = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=MainActivity.this;
        btn_show = (Button) findViewById(R.id.btn_show);

        //初始化Builder
        builder = new AlertDialog.Builder(mContext);

        //加载自定义View并设置
        final LayoutInflater inflater = MainActivity.this.getLayoutInflater();
        view_loginout = inflater.inflate(R.layout.view_dialog_custom,null,false);
        builder.setView(view_loginout);
        builder.setCancelable(false);
        alert = builder.create();
        view_loginout.findViewById(R.id.btn_cancle).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                alert.dismiss();
            }
        });
        view_loginout.findViewById(R.id.btn_blog).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final EditText etUsername = v.findViewById(R.id.signaccont);
                final EditText etPassword = v.findViewById(R.id.signpasswd);
                Toast.makeText(getApplicationContext(),"登陆："+"账号： " + etUsername.getText().toString() + "  密码： " + etPassword.getText().toString(),Toast.LENGTH_SHORT).show();
                alert.dismiss();
            }
        });
        view_loginout.findViewById(R.id.btn_close).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"对话框已关闭~",Toast.LENGTH_SHORT);
                alert.dismiss();
            }
        });
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.show();
            }
        });



    }

    }


