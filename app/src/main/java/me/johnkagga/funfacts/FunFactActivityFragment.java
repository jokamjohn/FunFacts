package me.johnkagga.funfacts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * A placeholder fragment containing a simple view.
 */
public class FunFactActivityFragment extends Fragment {

    public FunFactActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.fragment_main, container, false);

        final TextView factText = (TextView)rootVeiw.findViewById(R.id.factTextView);
        Button factbutton = (Button)rootVeiw.findViewById(R.id.show_facts_button);
        View.OnClickListener factListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] facts = {
                        "Ants stretch when they wake up in the morning",
                        "Ostriches run faster than horses",
                        "Olympic medals are actually made mostly of silver",
                        "You are born with 300 bones, by the time you adult you will hav 206",
                        "It takes about 8 minutes for the light from the sun to reach the earth",
                        "Some bamboo plants can grow 8 metres a day",
                        "Tanzania is bigger than Uganda",
                        "some penguins can leap 2-3 hours a day from the water",
                        "John Kagga is Jokam",
                        "My mummy is the best mummy ever"
                };


                String fact = "";
                //Adding a Random generator
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(3);
                if (randomNumber == 0){
                    fact = "Ants stretch when they wake up in the morning";

                }else if (randomNumber == 1){
                    fact = "Ostriches run faster than horses";

                }else if (randomNumber == 2){
                    fact = "Olympic medals are actually made mostly of silver";

                }else {
                    fact = "Something wrong happened";
                }
                factText.setText(fact);

            }
        };

        factbutton.setOnClickListener(factListener);
        return rootVeiw;
    }
}
