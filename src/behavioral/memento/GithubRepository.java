package behavioral.memento;

/**
 * Caretaker
 */
public class GithubRepository {

    private Memento memento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
