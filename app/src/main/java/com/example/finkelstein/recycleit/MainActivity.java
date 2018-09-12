package com.example.finkelstein.recycleit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Character> characterArrayList = new ArrayList<Character>();

        characterArrayList.add(new Character("Link", R.mipmap.link));
        characterArrayList.add(new Character("Mario", R.mipmap.mario));
        characterArrayList.add(new Character("Ms. Pacman", R.mipmap.ms_pac_man));
        characterArrayList.add(new Character("Qbert", R.mipmap.qbert));
        characterArrayList.add(new Character("Samus Aran", R.mipmap.samus));

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        CharacterAdapter adapter = new CharacterAdapter(characterArrayList);
        mRecyclerView.setAdapter(adapter);


    }
}
