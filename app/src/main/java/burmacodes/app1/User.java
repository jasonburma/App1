package burmacodes.app1;

import java.io.Serializable;
import java.security.PublicKey;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jason on 10/11/2017.
 */

public class User extends RealmObject implements Serializable {
    @PrimaryKey
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
