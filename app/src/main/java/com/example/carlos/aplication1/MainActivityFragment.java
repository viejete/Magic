package com.example.carlos.aplication1;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button poisonDec1 , lifeDec1 , poisonInc1 , lifeInc1 , poisonDec2 , lifeDec2 , poisonInc2 , lifeInc2 , lifeSteal1 , lifeSteal2;
    private TextView scorePlayer1 , scorePlayer2;
    private int life1 = 20 , life2 = 20 , poison1 = 0  ,poison2 = 0;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        poisonDec1 =  (Button) view.findViewById(R.id.poisonDec1);
        lifeDec1 = (Button) view.findViewById(R.id.lifeDec1);
        poisonInc1 = (Button) view.findViewById(R.id.poisonInc1);
        lifeInc1 = (Button) view.findViewById(R.id.lifeInc1);
        poisonDec2 = (Button) view.findViewById(R.id.poisonDec2);
        lifeDec2 = (Button) view.findViewById(R.id.lifeDec2);
        poisonInc2 = (Button) view.findViewById(R.id.poisonInc2);
        lifeInc2 = (Button) view.findViewById(R.id.lifeInc2);
        lifeSteal1 = (Button) view.findViewById(R.id.lifeSteal1);
        lifeSteal2 = (Button) view.findViewById(R.id.lifeSteal2);

        scorePlayer1 = (TextView) view.findViewById(R.id.scorePlayer1);
        scorePlayer1.setText(life1 + "/" + poison1);
        scorePlayer2 = (TextView) view.findViewById(R.id.scorePlayer2);
        scorePlayer2.setText(life2 + "/" + poison2);

        poisonDec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (poison1 != 0) {
                    poison1--;
                    scorePlayer1.setText(life1 + "/" + poison1);
                }
            }
        });

        lifeDec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life1--;
                scorePlayer1.setText(life1 + "/" + poison1);
            }
        });

        poisonInc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poison1++;
                scorePlayer1.setText(life1 + "/" + poison1);
            }
        });

        lifeInc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life1++;
                scorePlayer1.setText(life1 + "/" + poison1);
            }
        });

        poisonDec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (poison2 != 0) {
                    poison2--;
                    scorePlayer2.setText(life2 + "/" + poison2);
                }
            }
        });

        lifeDec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life2--;
                scorePlayer2.setText(life2 + "/" + poison2);
            }
        });

        poisonInc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poison2++;
                scorePlayer2.setText(life2 + "/" + poison2);
            }
        });

        lifeInc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life2++;
                scorePlayer2.setText(life2 + "/" + poison2);
            }
        });

        lifeSteal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life1++;
                life2--;
                scorePlayer1.setText(life1 + "/" + poison1);
                scorePlayer2.setText(life2 + "/" + poison2);

            }
        });

        lifeSteal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life1--;
                life2++;
                scorePlayer1.setText(life1 + "/" + poison1);
                scorePlayer2.setText(life2 + "/" + poison2);

            }
        });

        return view;
    }

}
