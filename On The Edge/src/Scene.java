import java.util.List;

public class Scene {
    String description;
    List<Choice> choices;

    public Scene(String description, List<Choice> choices) {
        this.description = description;
        this.choices = choices;
    }

    public void display() {
        System.out.println("\n====================");
        System.out.println(description);
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i).text);
        }
    }
}
