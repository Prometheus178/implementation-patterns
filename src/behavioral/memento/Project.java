package behavioral.memento;

import java.util.Date;

public class Project {

    private String version;
    private Date date;

    public void setVersion(String version) {
        this.version = version;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Project: \n" +
                "version='" + version +
                "\nDate=" + date;
    }

    class Saver{

        public Memento save(){
            return new Memento(version);
        }
        public void load(Memento memento){
            version = memento.getVersion();
            date = memento.getDate();
        }

    }


}
