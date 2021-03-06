package com.example.hz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final ArrayList first_word = new ArrayList();
    final ArrayList second_word = new ArrayList();
    final ArrayList third_word = new ArrayList();
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_arrays();
        show_result();
    }

    private void show_result(){
        final Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.vivod);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = choose_first_word();
                String second = choose_second_word();
                String third = choose_third_word();

                String sentence = first + " " + second + " " + third ;

                textView.setText(sentence);
            }
        });
    }

    private void init_arrays() {
        String[] first = {"Получишь", "Схлопочешь", "Найдешь"};
        String[] second = {"леденец", "стол", "стул"};
        String[] third = {"сегодня", "от брата", "никогда"};
        first_word.addAll(Arrays.asList(first));
        second_word.addAll(Arrays.asList(second));
        third_word.addAll(Arrays.asList(third));
    }
    private String choose_first_word(){
        int lenght = first_word.size();
        int x = r.nextInt(lenght);
        return (String) first_word.get(x);
    }
    private String choose_second_word(){
        int lenght = second_word.size();
        int x = r.nextInt(lenght);
        return (String) second_word.get(x);
    }
    private String choose_third_word(){
        int lenght = third_word.size();
        int x = r.nextInt(lenght);
        return (String) third_word.get(x);
    }
}