package com.example.androidtp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Article article = null;
    String Tag = "Article";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        article = new Article(1, "Pain au chocolat", "Une description", "chocolatine.org", 1.10f, 4.5f, false);

        TextView articleName = findViewById(R.id.article_name);
        TextView articleDescription = findViewById(R.id.article_description);
        TextView articlePrice = findViewById(R.id.article_price);
        RatingBar ArticleRating = findViewById(R.id.rating_bar);
        ToggleButton buyingButton = findViewById(R.id.buy_button);

        articleName.setText(article.getName());
        articleDescription.setText(article.getDescription());
        articlePrice.setText(String.valueOf(article.getPrice())+" €");
        ArticleRating.setRating(article.getRating());
        buyingButton.setChecked(article.isBuyed());
    }

    public void onClickUrl(View view){
        Toast.makeText(this, article.getUrl(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, InfoURLActivity.class);
        intent.putExtra("article", article);
        startActivity(intent);
    }

    public void onClickBuy(View view){
        article.setIsBuyed(!article.isBuyed());
        Log.i(Tag, "Cet article est acheté : "+ article.isBuyed());
    }
}