package com.example.cources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cources.model.AnimeModel;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmMigration;
import io.realm.RealmResults;
import io.realm.mongodb.User;

public class MainActivity extends AppCompatActivity {
    String appID = "application-test-gxchi";
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Realm.init(this);

        //Get a Realm instance for this thread
        RealmResults realm = test();
//        Realm realm = realmInstance();
//        realm.beginTransaction();
//
//        final RealmResults<AnimeModel> animeData = realm.where(AnimeModel.class).findAll();

        System.out.println("++++++++++++++++++++++++++++++");
//        System.out.println(animeData);
    }

    public void onSubmit(View view) {

        TextView textCustom = findViewById(R.id.textView);

        EditText editName = findViewById(R.id.editTextTextPersonName);
        String name = editName.getText().toString();

        textCustom.setText("Hello " + name);
    }

//    public Realm realmInstance() {
//
//        RealmConfiguration config = new RealmConfiguration.Builder()
//                .name("anime_db.anime")
//                .schemaVersion(2)
////                .deleteRealmIfMigrationNeeded()
//                .build();
//
//        return Realm.getInstance(config);
//    }

    public RealmResults test() {


        RealmConfiguration config = new RealmConfiguration.Builder(appID)
        .name("anime_db.anime")
        .schemaVersion(2)
        .build();

        Realm.setDefaultConfiguration(config);

        Realm realm = Realm.getDefaultInstance();
        final RealmResults<AnimeModel> animeData = realm.where(AnimeModel.class).findAll();

        System.out.println(animeData);
        return animeData;
    }
}