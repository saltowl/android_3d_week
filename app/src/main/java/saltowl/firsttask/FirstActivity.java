package saltowl.firsttask;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText mText;
    private Button mButton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view)
        {
            if (!TextUtils.isEmpty(mText.getText()))
                showSting(mText);
        }
    };

    private void showSting (EditText string)
    {
        Toast.makeText(this, string.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mText = findViewById(R.id.sText);
        mButton = findViewById(R.id.sButton);

        mButton.setOnClickListener(mOnClickListener);
    }
}
