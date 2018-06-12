package com.example.maxencedecussac.eyenightpro.activities;
import android.app.Application;
import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1TcAvt0wD6YDxEffIJ7qJtRQvMXzu7")
                .clientKey("XUNfi612hLNdS6V8TTb582YTou8qSX")
                .server("https://eyenight-dev.herokuapp.com/parse")
                .build()
        );
    }
}
