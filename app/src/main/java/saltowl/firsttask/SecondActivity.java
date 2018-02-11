package saltowl.firsttask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    public static String SOME_KEY = "SOME_KEY";
    private TextView mText2;
    private Button mButton2;

    private View.OnClickListener mOnSecondButtonClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mText2 = findViewById(R.id.tvSText);
        mButton2 = findViewById(R.id.sButton2);

        Bundle bundle = getIntent().getExtras();
        mText2.setText(bundle.getString(SOME_KEY));

        mButton2.setOnClickListener(mOnSecondButtonClickListener);
    }

}
