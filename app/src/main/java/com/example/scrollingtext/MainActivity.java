package com.example.scrollingtext;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button commentButton;
    EditText article;
    int initialLength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        commentButton = (Button) findViewById(R.id.addCommentButton);
        article = (EditText) findViewById(R.id.article);

        initialLength = article.length();
        commentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                article.setEnabled(true);
                addComment(article,commentButton);


            }
        });

    }
    protected void addComment(EditText article, Button commentButton) {

        commentButton.setText("Save Comment.");
        int commentLength = article.length();
        article.setText(article.getText() + "\n");

        if(initialLength < commentLength){
            article.setEnabled(false);
            commentButton.setText("Add Comment.");
            initialLength = article.length();
        }

    }
}