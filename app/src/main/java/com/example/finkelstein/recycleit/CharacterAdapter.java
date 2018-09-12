package com.example.finkelstein.recycleit;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {

    public List<Character> characterList;

    public CharacterAdapter(List<Character> characterList) {
        this.characterList = characterList;
    }

    @Override
    public int getItemCount() {
        return this.characterList.size();
    }

    @Override
    public CharacterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        CharacterViewHolder cvh = new CharacterViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder cvh, int i) {
        cvh.characterImage.setImageResource(characterList.get(i).getPhotoID());
        cvh.characterName.setText(characterList.get(i).getName());
    }

    static public class CharacterViewHolder extends RecyclerView.ViewHolder {
        public CardView cv;
        public ImageView characterImage;
        public TextView characterName;

        public CharacterViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cardview);
            characterImage = (ImageView)itemView.findViewById(R.id.character_photo);
            characterName = (TextView)itemView.findViewById(R.id.character_name);
        }
    }
}
