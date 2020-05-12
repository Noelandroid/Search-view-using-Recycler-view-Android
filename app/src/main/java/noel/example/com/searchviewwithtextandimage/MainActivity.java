package noel.example.com.searchviewwithtextandimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    EditText search;
    private List<Movies> movielist;

     private  MovieAdapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.recycler);
        search=findViewById(R.id.editText_search);

                additems();
                recycle();



            search.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                        retrieve(editable.toString());
                }
            });










    }

    private void recycle() {

        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter=new MovieAdapter(movielist);
        recycler.setAdapter(adapter);
    }

    private void additems() {
        movielist=new ArrayList<>();
        movielist.add(new Movies(R.drawable.avengers,"Avengers","2019"));
        movielist.add(new Movies(R.drawable.dolittle,"Dolittle","2020"));
        movielist.add(new Movies(R.drawable.joker,"Joker","2019"));
        movielist.add(new Movies(R.drawable.jumanji,"Jumanji","1995"));
        movielist.add(new Movies(R.drawable.mafia,"Mafia","2020"));
        movielist.add(new Movies(R.drawable.parasite,"Parasite","2019"));
        movielist.add(new Movies(R.drawable.spenser,"Spenser","2020"));


    }

    private  void  retrieve(String text){
        ArrayList<Movies> filternames = new ArrayList<>();

        try {
            for (Movies s:movielist){
                if (s.getName().toLowerCase().contains(text.toLowerCase())){
                    filternames.add(s);
                }

            }



        }catch (Exception e){}

        adapter.retrieveList(filternames);
    }
}


