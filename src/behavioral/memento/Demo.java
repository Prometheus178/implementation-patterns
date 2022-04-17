package behavioral.memento;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Project project = new Project();
        Project.Saver saver = project.new Saver();
        GithubRepository github = new GithubRepository();
        System.out.println("Creating new project");
        project.setVersion("Version " + 1F);
        System.out.println(project);
        System.out.println("Save current version to github...");

        Memento save = saver.save();
        github.setMemento(save);

        System.out.println("Updating...");
        Thread.sleep(3000);
        project.setVersion("Version " + 1.1F);
        System.out.println(project);

        System.out.println("Something went wrong...");
        System.out.println("Rollback to previous version");

        Memento memento = github.getMemento();
        saver.load(memento);
        System.out.println("Current version is:");
        System.out.println(project);

    }
}
