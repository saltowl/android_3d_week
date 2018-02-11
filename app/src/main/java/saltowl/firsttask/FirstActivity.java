package saltowl.firsttask;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity
{

    private EditText mText1;
    private Button mButton1;

    private View.OnClickListener mOnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            if (!TextUtils.isEmpty(mText1.getText()))
            {
                Intent startSecondIntent =
                        new Intent(FirstActivity.this, SecondActivity.class);
                startSecondIntent.putExtra(SecondActivity.SOME_KEY, mText1.getText().toString());
                startActivity(startSecondIntent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mText1 = findViewById(R.id.sText);
        mButton1 = findViewById(R.id.sButton);

        mButton1.setOnClickListener(mOnClickListener);
    }
}
