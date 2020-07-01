package com.example.marketingapp.view.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.util.Log;
import android.widget.TextView;

import com.example.marketingapp.R;

public class DetailsProductActivity extends AppCompatActivity {

    TextView txtActDetProdOldPrice;

    String TAG ="aaa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_product);
        txtActDetProdOldPrice = findViewById(R.id.txtActDetProdOldPrice);

        StrikeOldPrice();




    }


    private void StrikeOldPrice()
    {
        SpannableString ss = new SpannableString(txtActDetProdOldPrice.getText().toString());
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();

        String aa = txtActDetProdOldPrice.getText().toString();
        int s = aa.length();
        ss.setSpan(strikethroughSpan,0,s, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        txtActDetProdOldPrice.setText(ss);
    }


}
