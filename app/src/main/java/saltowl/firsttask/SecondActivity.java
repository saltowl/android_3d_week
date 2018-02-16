package saltowl.firsttask;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
            invokeWebSearch();
        }
    };

    public void invokeWebSearch()
    {
        try
        {
            Bundle bundle = getIntent().getExtras();
            String q = bundle.getString(SOME_KEY);
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, q);
            startActivity(intent);
        }
        catch (ActivityNotFoundException e)
        {
            showMessage(R.string.error_browser);
            e.printStackTrace();
        }
    }

    private void showMessage(@StringRes int string)
    {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

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
