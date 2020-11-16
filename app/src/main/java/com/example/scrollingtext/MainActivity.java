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

                addComment(article,commentButton);
            }
        });

    }
    protected void addComment(EditText article, Button commentButton) {

        if(commentButton.getText().equals("SAVE COMMENT.")){
            article.setEnabled(false);
            commentButton.setText("ADD COMMENT!");

        }else{
            article.setEnabled(true);
            commentButton.setText("SAVE COMMENT.");
            article.setText(article.getText() + "\n");

        }
    }
}