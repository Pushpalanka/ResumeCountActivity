package com.example.pushpalanka.firstapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

public class DisplayMessageActivity extends ActionBarActivity {
    public static int count = 0;
    private TextView textViewMessage, textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(HomeActivity.EXTRA_MESSAGE);

        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        textViewMessage.setText(getResources().getString(R.string.message)+": "+message);

        textViewCount = (TextView)findViewById(R.id.textViewCount);

//        TextView textView = new TextView(this);
//
//        textView.setTextSize(40);
//        textView.setText(message);
//
//        setContentView(textView);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        count++;

        textViewCount.setText(getResources().getString(R.string.count)+": "+ count);



    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() { }

//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_display_message,
//                    container, false);
//            return rootView;
//        }
    }
}