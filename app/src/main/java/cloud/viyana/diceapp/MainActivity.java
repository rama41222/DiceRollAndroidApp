package cloud.viyana.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button flipButton;
        flipButton = (Button) findViewById(R.id.button_flip);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_dice_slot_1);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_dice_slot_2);

        final int [] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        flipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Click", "Flip button");
                Random diceRoll = new Random();
                int randNumberLeft = diceRoll.nextInt(5) ;
                int randNumberright = diceRoll.nextInt(5);

                Log.d("dicee", "rand no= " + randNumberLeft + "--" + randNumberright );
                leftDice.setImageResource(diceArray[randNumberLeft]);
                rightDice.setImageResource(diceArray[randNumberright]);
            }
        });
    }
}
