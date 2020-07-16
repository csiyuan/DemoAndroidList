package sg.edu.rpc346.id19016011.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<String> movieList;
    ArrayAdapter<String> aaMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        movieList = new ArrayList<>();

        movieList.add("Pie - 9.0");
        movieList.add("Oreo - 8.0-8.1");
        movieList.add("Nougat - 7.0-7.1.2");
        movieList.add("Marshmallow - 6.0-6.0.1");
        movieList.add("Lollipop - 5.0-5.1.1");
        movieList.add("KitKat - 4.4-4.4.4");
        movieList.add("Jelly Bean - 4.1-4.3.1");

        aaMovie = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, movieList);
        lvMovie.setAdapter(aaMovie);
    }
}
