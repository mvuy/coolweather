package lbstest.example.com.lbstest;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;


/**
 * Created by lenovo on 2017/4/1.
 */

public class Login extends Activity {
    private SharedPreferences pref;

    private SharedPreferences.Editor editor;

    private CheckBox rememberPass;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_layout);
        Button button3 =(Button) findViewById(R.id.lost);
        button3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:13595081151"));
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.login);
        button4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Login.this, And.class);
                startActivity(intent);

            }
        });
        Button button7 = (Button) findViewById(R.id.remove);
        button7.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.remove:
                        ProgressDialog progressDialog = new ProgressDialog(Login.this);
                        progressDialog.setTitle("兄台你真的确定吗？");
                        progressDialog.setMessage("现在后悔还来得及...");
                        progressDialog.setCancelable(true);
                        progressDialog.show();
                }
            }
        });
        Button button8 = (Button) findViewById(R.id.remove_1);
        button8.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){

                AlertDialog.Builder dialog = new AlertDialog.Builder(Login.this);
                dialog.setTitle("点确定你将失去宝宝了 ");
                dialog.setMessage("别赶我走...");
                dialog.setCancelable(false);
                dialog.setPositiveButton("确定〒_〒", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                    }
                });
                dialog.setPositiveButton("取消(●'?'●)", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                    }
                });
                dialog.show();

            }
        });
    }
}
