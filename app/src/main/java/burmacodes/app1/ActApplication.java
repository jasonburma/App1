package burmacodes.app1;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Jason on 10/11/2017.
 */

public class ActApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
