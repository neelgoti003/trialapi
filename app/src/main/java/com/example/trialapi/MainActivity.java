package com.example.trialapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.superListView);

        getData();




    }
    private void getData() {
        Call<List<RespModel>> call = RetrofitInstance.getInstance().getMyApi().getsuperHeroes();
        call.enqueue(new Callback<List<RespModel>>() {
            @Override
            public void onResponse(Call<List<RespModel>> call, Response<List<RespModel>> response) {
                List<RespModel> myheroList = response.body();
                String[] oneHeroes = new String[myheroList.size()];

                for (int i = 0; i < myheroList.size(); i++) {
                    oneHeroes[i] =  "Phonetics :"+ myheroList.get(i).getPhonetics() +
                            "\nPhonetic :"+ myheroList.get(i).getPhonetic() +
                            "\nWord :"+ myheroList.get(i).getWord() +
                            "\nLicense :"+ myheroList.get(i).getLicense() +
                            "\nSource Urls :"+ myheroList.get(i).getSourceUrls();

                }

                listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, oneHeroes));
            }

            @Override
            public void onFailure(Call<List<RespModel>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }
        });
    }
}


