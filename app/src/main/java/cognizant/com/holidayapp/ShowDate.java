package cognizant.com.holidayapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ShowDate extends ActionBarActivity {

    TextView textInit;
    TextView textEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_date);
         //tarini test
        Bundle b = getIntent().getExtras();
        int startDay = b.getInt("startDay");
        int endDay =   b.getInt("endDay");
        int startMonth = b.getInt("startMonth");
        int endMonth =   b.getInt("endMonth");
        int startYear = b.getInt("startYear");
        int endYear =   b.getInt("endYear");

        textInit= (TextView) findViewById(R.id.dateText);
        textEnd =(TextView) findViewById(R.id.endDateText);

        textInit.setText("You have selected from"+": "+startDay+"-"+startMonth+"-"+startYear);
        textEnd.setText("To"+": "+endDay+"-"+endMonth+"-"+endYear);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_date, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
