package behavioral.memento;

import java.util.Date;

public class Memento {

    private final String version;
    private final Date Date;

    public Memento(String version){
        this.version = version;
        this.Date = new Date();
    }
    public String getVersion() {
        return version;
    }

    public java.util.Date getDate() {
        return Date;
    }
}
