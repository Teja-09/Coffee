package com.example.teja.urcoffee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int quantity=0;
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){

        quantity = quantity + 1;
        price=quantity*5;
        display(quantity);
        displayPrice(price);
    }
    public void decrement(View view){
        if(quantity>0)
        {
            quantity = quantity - 1;

        }
        price=quantity*5;
        display(quantity);
        displayPrice(price);
    }
    public void submitOrder(View view) {
        if(price>0)
        {
            String pricemessage="₹ "+price+"\n\nYou will get these with in 5 minutes.."+"\n\n Thank you☕ !!!"+"\n\n Have A Great Day."+"\n 😊🙂";
            displayMessage(pricemessage);
        }else
        {
            String pricemessage="Please select No.Of coffees";
            displayMessage(pricemessage);
        }
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
