package bd.ac.bauet.csebauet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        setTitle("Developer");
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/ESSB.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

    public void goToFb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com/fahim.saiyan"));
        startActivity(browserIntent);
    }

    public void goToTwtr(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com/master_fahim"));
        startActivity(browserIntent);
    }

    public void goToGPlus(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://plus.google.com/+FahimFaisal94"));
        startActivity(browserIntent);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}