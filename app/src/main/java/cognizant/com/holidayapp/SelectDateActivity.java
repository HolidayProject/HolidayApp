package cognizant.com.holidayapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;


public class SelectDateActivity extends ActionBarActivity {

   DatePicker initDate ;
    DatePicker endDate ;
    Button buttonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  initDate = (DatePicker) findViewById(R.id.datePicker);
        endDate = (DatePicker) findViewById(R.id.datePicker2);
        buttonNext = (Button) findViewById(R.id.button);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ShowDate.class);
                intent.putExtra("startDay",initDate.getDayOfMonth());
                intent.putExtra("endDay",endDate.getDayOfMonth());
                intent.putExtra("startMonth",initDate.getMonth());
                intent.putExtra("endMonth",endDate.getMonth());
                intent.putExtra("startYear",initDate.getYear());
                intent.putExtra("endYear",endDate.getYear());
                startActivity(intent);
            }
        });*/





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //pulltestd
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
