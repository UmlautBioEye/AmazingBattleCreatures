package com.example.mrb.amazingbattlecreatures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.view.View;

public class AmazingBattleCreatures extends AppCompatActivity {

    TextView txtvwBattleOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazing_battle_creatures);

        txtvwBattleOutput = (TextView) findViewById(R.id.txtvwBattleOutput);
        // The line below allows the inside of the TextView to Scroll vertically
        txtvwBattleOutput.setMovementMethod(new ScrollingMovementMethod());
    }

    public void duel(View vw)
    {
        boolean blnNoWinner = true;
        boolean blnFirstBCWins = false;
        boolean blnSecondBCWins = false;

        BattleCreature bcOne;
        BattleCreature bcTwo;

        // Thanks to Mr Hardman for checking the original numbers! These ones work better.
        bcOne = new BattleCreature("Mondoise", 200, 10, 33);
        bcTwo = new BattleCreature("Tuesachu", 200, 25, 15);

        bcOne.restore();
        bcTwo.restore();

        txtvwBattleOutput.setText("");

        while(blnNoWinner)
        {
            // Thanks to Mr Hardman for the logic assist!
            if((bcTwo.isDefeated() == false) && (bcOne.isDefeated() == false))
            {
                bcOne.attack(bcTwo);
                txtvwBattleOutput.append(bcTwo.getLastAction());
                blnFirstBCWins = bcOne.hasWon();
            }
           if((bcOne.isDefeated() == false) && (bcTwo.isDefeated() == false))
           {
               bcTwo.attack(bcOne);
               txtvwBattleOutput.append(bcOne.getLastAction());
               blnSecondBCWins = bcTwo.hasWon();
           }

            blnNoWinner = !blnFirstBCWins && !blnSecondBCWins;
        }

    }

}
