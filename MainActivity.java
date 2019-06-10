package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    int ScoreA = 0;
    int ScoreB = 0;

    //global textview variables seem to break the app
//    TextView teamAtext = (TextView) findViewById(R.id.AScore);
//    TextView teamBtext = (TextView) findViewById(R.id.BScore);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    //check the id of the button, then run the scorePoints method with the appropriate parameters
    public void pointsButton(View view){

        switch (view.getId()){
            case R.id.A_3points:
                scorePoints('A',3);
                break;
            case R.id.A_2points:
                scorePoints('A', 2);
                break;
            case R.id.A_1points:
                scorePoints('A', 1);
                break;
            case R.id.B_3points:
                scorePoints('B', 3);
                break;
            case R.id.B_2points:
                scorePoints('B', 2);
                break;
            case R.id.B_1points:
                scorePoints('B', 1);
                break;
        }

    }//pointsButton method

    public void resetScore(View view){

        //when pressed, change all visual values and variable values to 0 to restart the score
        ScoreA = 0;
        ScoreB = 0;
        TextView teamAtext = (TextView) findViewById(R.id.AScore);
        TextView teamBtext = (TextView) findViewById(R.id.BScore);
        teamAtext.setText("" + ScoreA);
        teamBtext.setText("" + ScoreB);

    }



    //recebe char A ou B do botão e a quantidade de pontos e dá esses pontos à equipa que recebeu do char
    public void scorePoints(char team, int points){

//        String teamId = "R.id." + team + "Score";
//       TextView teamScore = (TextView) findViewById((parseInt(teamId)));


        if(team == 'A'){
            ScoreA += points;
            TextView teamAtext = (TextView) findViewById(R.id.AScore);
            teamAtext.setText("" + ScoreA);

        }else{
            ScoreB += points;
            TextView teamBtext = (TextView) findViewById(R.id.BScore);
            teamBtext.setText("" + ScoreB);
        }

    }

}
