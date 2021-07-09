package com.example.lfyd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String name , location , offer1, offer2 , discount1,discount2, discount3 , product1, product2, product3;
    TextView tt1 , tt2 , tt3 , tt4 , tt5 , tt6 , tt7 , tt8 , tt9 , tt10 , tt11 , tt;
    Button btn , bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = getIntent().getStringExtra("name");
        location = getIntent().getStringExtra("Location");
        offer1 = getIntent().getStringExtra("offer1");
        offer2 = getIntent().getStringExtra("offer2");
        discount1 = getIntent().getStringExtra("discount1");
        discount2 = getIntent().getStringExtra("discount2");
        discount3 = getIntent().getStringExtra("discount3");
        product1 = getIntent().getStringExtra("product1");
        product2 = getIntent().getStringExtra("product2");
        product3 = getIntent().getStringExtra("product3");
        tt4 = (TextView)findViewById(R.id.tt4);
        tt = (TextView)findViewById(R.id.tt);
        tt1 = (TextView)findViewById(R.id.tt1);
        tt2 = (TextView)findViewById(R.id.tt2);
        tt3 = (TextView)findViewById(R.id.tt3);
        tt5 = (TextView)findViewById(R.id.tt5);
        tt6 = (TextView)findViewById(R.id.tt6);
        tt7 = (TextView)findViewById(R.id.tt7);
        tt8 = (TextView)findViewById(R.id.tt8);
        tt9 = (TextView)findViewById(R.id.tt9);
        tt10 = (TextView)findViewById(R.id.tt10);
        tt11 = (TextView)findViewById(R.id.tt11);
        btn = (Button)findViewById(R.id.btn2);
        bt = (Button)findViewById(R.id.btn3);
        tt4.setText(name);
        tt1.setText(product1);
        tt2.setText(product2);
        tt3.setText(product3);
        tt6.setText(discount1);
        tt7.setText(discount2);
        tt8.setText(discount3);
        tt10.setText(offer1);
        tt11.setText(offer2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Displaytrack(location);
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(Intent.ACTION_SEND);
                si.setType("text/plain");
                String s = "Shop Name "+ name + " " + location + " visit shop for extra discounts";
                si.putExtra(Intent.EXTRA_TEXT ,s);
                si.putExtra(Intent.EXTRA_SUBJECT , "Get lfyd app from playstore");
                startActivity(Intent.createChooser(si ,"Share using"));
            }
        });
    }
    private void Displaytrack(String location) {

            /*Uri uri = Uri.parse("https://www.google.co.in./maps/dir/"+location.trim());
            Intent intent = new Intent(Intent.ACTION_VIEW , uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);*/
             Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in./maps/dir/"+"/"+location.trim()));
            startActivity(intent);
        /*catch (ActivityNotFoundException e){
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW , uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }*/
    }
}