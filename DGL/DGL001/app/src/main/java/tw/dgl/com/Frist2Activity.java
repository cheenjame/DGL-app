package tw.dgl.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tw.dgl.com.Label.LabelActivity;

public class Frist2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist2);
    }

    public void but1(View v) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
    public void but2(View v){
        Intent it=new Intent(this,Policy.class);
        startActivity(it);
    }
    public void but3(View v){
        Intent it=new Intent(this,Segregation.class);
        startActivity(it);
    }
    public void but4(View v){
        Intent it=new Intent(this,LabelActivity.class);
        startActivity(it);
    }
    public void but5(View v){
        Intent it=new Intent(this,test1.class);
        startActivity(it);
    }
    public void but6(View v){
        Intent it=new Intent(this,test1.class);
        startActivity(it);
    }

    public void but7(View v) {
        Intent it = new Intent(this, FristActivity.class);
        startActivity(it);
    }



}
