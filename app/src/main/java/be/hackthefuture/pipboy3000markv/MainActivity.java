package be.hackthefuture.pipboy3000markv;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    Typeface custom;
    JSONObject json;

    private static String url_login = "http://cloud.cozmos:2400/api/users/login";
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custom = Typeface.createFromAsset(getBaseContext().getAssets(),"fonts/fof.ttf");
        setFonts();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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

    public void buttonLogin_click(View v){
        User user = new User();

        HttpReader httpReader = new HttpReader();
        httpReader.setOnResultReadyListener(new HttpReader.OnResultReadyListener() {
            @Override
            public void resultReady(String result) {

            }
        });
        httpReader.execute("http://eduphp.khk.be/PR2/execute.php?page=androidvak&klasId=11");
    }

    public void setFonts() {
        TextView textViewName = (TextView)findViewById(R.id.name);
        TextView textViewPassword = (TextView)findViewById(R.id.password);
        Button buttonRegister = (Button)findViewById(R.id.register);
        Button buttonLogin = (Button)findViewById(R.id.login);

        textViewName.setTypeface(custom);
        textViewPassword.setTypeface(custom);
        buttonLogin.setTypeface(custom);
        buttonRegister.setTypeface(custom);
    }

    public void buttonRegister_click(View v){

    }
}
