package burmacodes.app1;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by Jason on 10/9/2017.
 */

public class Acts extends RealmObject{
    private String id;
    private String name;
    private String venue;
    private byte[] image;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
