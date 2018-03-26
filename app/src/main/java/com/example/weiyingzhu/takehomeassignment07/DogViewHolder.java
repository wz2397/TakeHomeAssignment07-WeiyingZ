package com.example.weiyingzhu.takehomeassignment07;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by weiyingzhu on 18/3/22.
 */

public class DogViewHolder extends RecyclerView.ViewHolder{

    public CardView cardView;
    public TextView dogName;
    public ImageView dogPhoto;

    public DogViewHolder(View itemView,final Context context) {
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        dogName=(TextView)itemView.findViewById(R.id.text);
        dogPhoto=(ImageView)itemView.findViewById(R.id.image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,dogName.getText(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
