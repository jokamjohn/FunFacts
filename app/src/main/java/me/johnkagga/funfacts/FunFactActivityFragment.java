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

    private static final String KEY_FACT = "KEY_FACT";
    private static final String KEY_COLOR = "KEY_COLOR";

    FunBook mFunBook = new FunBook();
    ColorWheel mColorWheel = new ColorWheel();

    private RelativeLayout mLayout;
    private TextView factText;
    private Button mFactButton;

    private String mFact;
    private int mColor;

    public FunFactActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mLayout =(RelativeLayout)rootView.findViewById(R.id.relative_layout);
        factText = (TextView)rootView.findViewById(R.id.factTextView);
        mFactButton = (Button)rootView.findViewById(R.id.show_facts_button);
        View.OnClickListener factListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFact = mFunBook.getFact();
                mColor = mColorWheel.getColor();

                mLayout.setBackgroundColor(mColor);
                factText.setText(mFact);
                mFactButton.setTextColor(mColor);

            }
        };

        mFactButton.setOnClickListener(factListener);

        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //Saving the fact state
        outState.putString(KEY_FACT,mFact);

        //Saving the color state
        outState.putInt(KEY_COLOR,mColor);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        //Getting saved fields and also updating the views
        if (savedInstanceState != null)
        {
            mFact = savedInstanceState.getString(KEY_FACT);
            factText.setText(mFact);

            mColor = savedInstanceState.getInt(KEY_COLOR);
            mLayout.setBackgroundColor(mColor);
            mFactButton.setTextColor(mColor);
        }

    }
}
