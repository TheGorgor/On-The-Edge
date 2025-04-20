import java.util.List;

public class Choice {
    String text;
    int nextSceneId;
    Runnable effect;

    public Choice(String text, int nextSceneId, Runnable effect) {
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.effect = effect;
    }
}
