package group8.tcss450.uw.edu.mytestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onEricButtonClick(View view)
    {
        TextView display = findViewById(R.id.displayTextView);
        display.setText("Eric can program a button!");
    }
}
