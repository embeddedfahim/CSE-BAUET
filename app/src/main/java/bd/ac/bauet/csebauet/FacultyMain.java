package bd.ac.bauet.csebauet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class FacultyMain extends AppCompatActivity {

    ListView lst;
    TextView textView;

    @Nullable

    String[] name = {"Dr. Mirza A.F.M Rashidul Hasan", "Prof. Dr. Md. Shahid Uz Zaman", "Dr. Md. Al Mamun", "Md. Golam Sarwar Bhuyan", "Must. Asma Yasmin", "Ananya Sarker", "Nayreet Islam [On Leave]", "Dardina Tasmere", "Md. Sabbir Ejaz", "Md. Omar Faruq", "Md. Almash Alam", "Md. Sumon Mia", "Md. Muktar Hossain", "Md. Abdullah Al Rahat Kutubi", "Mithun Kumar"};
    String[] qual = {"B.Sc, M.Sc, M.Phil, Ph.D, D.Engg", "B.Sc, M.Sc, Ph.D", "B.Sc, M.Sc, Ph.D", "B.Sc, M.Sc, Ph.D (Pursuing)", "B.Sc, M.Sc", "B.Sc, M.Sc (Pursuing)", "B.Sc, M.Sc (Pursuing)", "B.Sc, M.Sc (Pursuing)", "B.Sc", "B.Sc", "B.Sc", "B.Sc", "B.Sc", "B.Sc", "B.Sc"};
    String[] desig = {"Associate Professor and Head", "Professor", "Professor", "Associate Professor", "Assistant Professor", "Lecturer", "Lecturer", "Lecturer", "Lecturer", "Lecturer", "Lecturer", "Lecturer (ICE)", "Lecturer", "Lecturer", "Lecturer"};
    Integer[] img = {R.drawable.mirza, R.drawable.suz, R.drawable.mamun, R.drawable.bhuiyan, R.drawable.asma, R.drawable.ananya, R.drawable.rupok, R.drawable.tonu, R.drawable.sabbir, R.drawable.mof, R.drawable.almash, R.drawable.sumon, R.drawable.muktar, R.drawable.rahat, R.drawable.mithun};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/ESSB.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        setTitle("Faculty Members");
        setContentView(R.layout.activity_faculty_main);

        lst = (ListView) findViewById(R.id.listview);
        CustomListView customListView = new CustomListView(this, name, desig, qual, img);
        lst.setAdapter(customListView);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(FacultyMain.this, Mirza.class);
                    startActivity(intent);
                }
                if(position == 1) {
                    Intent intent = new Intent(FacultyMain.this, SUZ.class);
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(FacultyMain.this, Mamun.class);
                    startActivity(intent);
                }
                if(position == 3) {
                    Intent intent = new Intent(FacultyMain.this, GSB.class);
                    startActivity(intent);
                }
                if(position == 4) {
                    Intent intent = new Intent(FacultyMain.this, Asma.class);
                    startActivity(intent);
                }
                if(position == 5) {
                    Intent intent = new Intent(FacultyMain.this, Ananya.class);
                    startActivity(intent);
                }
                if(position == 6) {
                    Intent intent = new Intent(FacultyMain.this, Rupok.class);
                    startActivity(intent);
                }
                if(position == 7) {
                    Intent intent = new Intent(FacultyMain.this, Tonu.class);
                    startActivity(intent);
                }
                if(position == 8) {
                    Intent intent = new Intent(FacultyMain.this, Sabbir.class);
                    startActivity(intent);
                }
                if(position == 9) {
                    Intent intent = new Intent(FacultyMain.this, MOF.class);
                    startActivity(intent);
                }
                if(position == 10) {
                    Intent intent = new Intent(FacultyMain.this, Anik.class);
                    startActivity(intent);
                }
                if(position == 11) {
                    Intent intent = new Intent(FacultyMain.this, Sumon.class);
                    startActivity(intent);
                }if(position == 12) {
                    Intent intent = new Intent(FacultyMain.this, Muktar.class);
                    startActivity(intent);
                }
                if(position == 13) {
                    Intent intent = new Intent(FacultyMain.this, Rahat.class);
                    startActivity(intent);
                }
                if(position == 14) {
                    Intent intent = new Intent(FacultyMain.this, Mithun.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}