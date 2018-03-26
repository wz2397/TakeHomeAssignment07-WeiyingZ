package com.example.weiyingzhu.takehomeassignment07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Dog> dogs;
    private DogAdapter dogsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recylerView = (RecyclerView) findViewById(R.id.recycler_view);
        recylerView.setHasFixedSize(true);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
        dogsAdapter=new DogAdapter(dogs, this);
        recylerView.setAdapter(new DogAdapter(dogs, this));
        recylerView.setAdapter(dogsAdapter);


    }
//    public void StartSecond(View view){
//        Intent intent = new Intent(this,Second.class);
//        startActivity(intent);
//
//    }

    private void initialData() {
        dogs = new ArrayList<>();
        dogs.add(new Dog("Terrier", R.drawable.terrier));
        dogs.add(new Dog("Husky", R.drawable.husky));
        dogs.add(new Dog("Hound", R.drawable.hound));
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                dogs.add(getRandomDog());
                dogsAdapter.notifyDataSetChanged();

            default:
                return super.onOptionsItemSelected(item);

                case R.id.share:
                Toast.makeText(this, "Your file is shared",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this,Second.class);
                    startActivity(intent);
                return true;
            case R.id.save:
                Toast.makeText(this, "Your file is saved",Toast.LENGTH_SHORT).show();
                return true;
//            default:
//                return super.onOptionsItemSelected(item);
        }
        }
//    public void Start(View view) {
//        Intent intent = new Intent(this, Second.class);
//        startActivity(intent);
//    }


    private Dog getRandomDog(){
        int num =(int)(Math.random()*2);
        if (num==0)
            return new Dog("Terrier", R.drawable.terrier);
        else if (num==1)
            return new Dog("Husky", R.drawable.husky);
        else
            return new Dog ("Hound", R.drawable.hound);
    }


}
