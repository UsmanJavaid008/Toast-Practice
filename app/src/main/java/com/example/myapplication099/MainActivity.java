package com.example.myapplication099;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callNumber(View view) {
        Uri uri = Uri.parse("tel:+923338166661");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

    public void sendEmail(View view) {
        Intent intent = new Intent();
        intent.setType("text/plain");
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ujavaid1013@gmail.com", "bcsf18m008@pucit.edu.pk"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
        intent.putExtra(Intent.EXTRA_TEXT, "message");
        startActivity(intent);
    }

    public void openWebsite(View view) {
        String url = "https://github.com/UsmanJavaid008";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello! I'm Toast", Toast.LENGTH_LONG);
    }

     public void showCustomizedToast(View view) {
        setContentView(R.layout.toast_layout);
        view = LayoutInflater.from(MainActivity.this).inflate(R.layout.toast_layout, null);
        Toast toast = new Toast(MainActivity.this);
        TextView tvMessage = view.findViewById(R.id.textView3);
        tvMessage.setText("Toast is Showing");
        toast.setView(view);
        toast.setGravity(Gravity.LEFT,100,200);
        toast.show();
    }
}