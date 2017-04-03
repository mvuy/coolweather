package lbstest.example.com.lbstest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 * Created by lenovo on 2017/4/1.
 */

public class Success extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.success_layout);
        Button button6 = (Button) findViewById(R.id.start);
        button6.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Success.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
