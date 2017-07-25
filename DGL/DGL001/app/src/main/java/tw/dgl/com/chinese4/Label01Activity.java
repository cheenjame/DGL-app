package tw.dgl.com.chinese4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import tw.dgl.com.R;
import tw.dgl.com.chinese;

public class Label01Activity extends AppCompatActivity implements View.OnClickListener{
    private Button bluehome_btn,home_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//去標題
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_label01);
        bluehome_btn=(Button)findViewById(R.id.bluehome_btn);
        home_btn=(Button)findViewById(R.id.home_btn);
        home_btn.setOnClickListener(this);
        bluehome_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_btn:
                Intent intent10=new Intent(Label01Activity.this,chinese.class);
                startActivity(intent10);

                break;
            case R.id.bluehome_btn:
                onBackPressed();
                break;
        }
    }
}
