package com.example.weiyingzhu.takehomeassignment07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle("Second");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public void Start(View view){
    Intent intent = new Intent(this, MainActivity.class);
       startActivity(intent);

}
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this, "Your file is shared",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this, "Your file is saved",Toast.LENGTH_SHORT).show();
                return true;
//            default:
//                return super.onOptionsItemSelected(item);
        }
        return true;

    }
}
