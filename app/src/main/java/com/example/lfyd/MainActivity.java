package com.example.lfyd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Articles> articlesArrayList;
    NewsrvAdapter newsrvAdapter;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rcv);
        editText = (EditText)findViewById(R.id.et);
        articlesArrayList = new ArrayList<>();
        news();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }

    private void filter(String text) {
        List<Articles> list =new ArrayList<>();
        for(Articles item : articlesArrayList){
            if(item.getProduct1().toLowerCase().contains(text.toLowerCase())){
                list.add(item);
            }
        }
        for(Articles item : articlesArrayList){
            if(item.getProduct2().toLowerCase().contains(text.toLowerCase())){
                list.add(item);
            }
        }
        for(Articles item : articlesArrayList){
            if(item.getProduct3().toLowerCase().contains(text.toLowerCase())){
                list.add(item);
            }
        }
        newsrvAdapter = new NewsrvAdapter(list , getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(newsrvAdapter);
    }

    private void news() {
        articlesArrayList.clear();
        articlesArrayList.add(new Articles("Shivam Motors" ,"Bhagwan takies agra","buy 2 bike get 5 services free", "buy 1 bike get 2 helmets" ,"40% on bike1" , "20% on bike 2" , "10% on bike 3" , "bike1" ,"ebike2" , "mbike3" ));
        articlesArrayList.add(new Articles("Random store 1" ,"Bhagwan takies agra","buy 2 apples get 1 apple free", "buy 5 banana get 2 apples" ,"40% on mango" , "20% on banana" , "10% on apple" , "mango" ,"banana" , "apple" ));
        articlesArrayList.add(new Articles("Random store 2" ,"Bhagwan takies agra","buy 2 apples get 1 apple free", "buy 5 banana get 2 apples" ,"40% on mango" , "20% on banana" , "10% on apple" , "mango" ,"banana" , "apple" ));
        articlesArrayList.add(new Articles("Random store 3" ,"Bhagwan takies agra","buy 2 phone get 1 phone free", "buy 4 phone get 2 phone free" ,"40% on watch" , "20% on earphone" , "10% on phone" , "watch" ,"earphone" , "phone" ));
        articlesArrayList.add(new Articles("Random store 4" ,"Bhagwan takies agra","buy 2 laptop get 1 laptop free", "buy 5 laptop get 2 laptop free" ,"40% on earphone" , "20% on phone" , "10% on laptop" , "earphone" ,"phone" , "laptop" ));
        articlesArrayList.add(new Articles("Random store 5" ,"Bhagwan takies agra","buy 2 house get 1 house free", "buy 5 house get 2 house free" ,"40% on flat" , "20% on house" , "10% on apartment" , "house" ,"flat" , "apartment" ));
        articlesArrayList.add(new Articles("Random store 6" ,"Bhagwan takies agra","buy 2 apples get 1 apple free", "buy 5 apples get 2 apple free" ,"40% on mango" , "20% on banana" , "10% on apple" , "mango" ,"banana" , "apple" ));
        articlesArrayList.add(new Articles("Random store 7" ,"Bhagwan takies agra","buy 2 potato get 1 potato free", "buy 5 potato get 2 potato free" ,"40% on mango" , "20% on banana" , "10% on potato" , "mango" ,"banana" , "potato" ));
        articlesArrayList.add(new Articles("Random store 8" ,"Bhagwan takies agra","buy 2 Car get 1 Car free", "buy 4 Car get 2 Car free" ,"40% on car service" , "20% on fuel" , "10% on car" , "bmw" ,"audi" , "maruti 800" ));
        articlesArrayList.add(new Articles("Random store 9" ,"Bhagwan takies agra","buy 2 tv get 1 tv free", "buy 3 tv get 2 tv free" ,"40% on phone" , "20% on laptop" , "10% on tv" , "phone" ,"laptop" , "tv" ));
        articlesArrayList.add(new Articles("Random store 10" ,"Bhagwan takies agra","buy 2 get 1 on every item", "buy 4 get 1 on every item" ,"Mango is free with banana" , "20% on banana" , "10% on apple" , "mango" ,"banana" , "apple" ));
        articlesArrayList.add(new Articles("Random store 11" ,"Bhagwan takies agra","50% of every item", "51% of every item" ,"40% on earphone" , "20% on charger" , "10% on otg" , "earphone" ,"charger" , "otg" ));
        articlesArrayList.add(new Articles("Random store 12" ,"Bhagwan takies agra","buy 2 apples get 1 apple free", "buy 5 banana get 2 apples" ,"40% on mango" , "20% on banana" , "10% on apple" , "mango" ,"banana" , "apple" ));
        articlesArrayList.add(new Articles("Random store 13" ,"Bhagwan takies agra","buy 2 potato get 1 apple free", "buy 5 banana get 2 apples" ,"40% on potato" , "20% on banana" , "10% on apple" , "potato" ,"banana" , "apple" ));
        articlesArrayList.add(new Articles("Random store 14" ,"Bhagwan takies agra","buy 2 mango get 1 banana free", "buy 5 banana get 2 apples" ,"40% on mango" , "20% on banana" , "10% on apple" , "mango" ,"banana" , "apple" ));
        newsrvAdapter = new NewsrvAdapter(articlesArrayList , getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(newsrvAdapter);
    }
}