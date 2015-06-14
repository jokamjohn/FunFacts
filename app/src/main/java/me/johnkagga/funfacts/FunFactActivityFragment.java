package me.johnkagga.funfacts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class FunFactActivityFragment extends Fragment {

    FunBook mFunBook = new FunBook();
    ColorWheel mColorWheel = new ColorWheel();

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

        final RelativeLayout mLayout =(RelativeLayout)rootVeiw.findViewById(R.id.relative_layout);
        final TextView factText = (TextView)rootVeiw.findViewById(R.id.factTextView);
        final Button factbutton = (Button)rootVeiw.findViewById(R.id.show_facts_button);
        View.OnClickListener factListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFunBook.getFact();
                int color = mColorWheel.getColor();
                mLayout.setBackgroundColor(color);
                factText.setText(fact);
                factbutton.setTextColor(color);

            }
        };

        factbutton.setOnClickListener(factListener);

        return rootVeiw;
    }
}
