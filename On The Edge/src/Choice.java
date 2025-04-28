import java.util.List;

public class Choice {
    String text;
    int nextSceneId;
    Runnable effect;

    // Original constructor
    public Choice(String text, int nextSceneId, Runnable effect) {
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.effect = effect;
    }

    // Default constructor for empty choices (for scene templates)
    public Choice() {
        this.text = "";
        this.nextSceneId = -1;
        this.effect = () -> {};
    }

    // Constructor without effect
    public Choice(String text, int nextSceneId) {
        this.text = text;
        this.nextSceneId = nextSceneId;
        this.effect = () -> {};
    }

    // Factory method to create a choice that depends on previous choices
    public static Choice createConditional(
            Character player,
            int checkSceneId,
            int checkChoiceIndex,
            String text,
            int trueNextSceneId,
            int falseNextSceneId,
            Runnable effect) {

        int nextSceneId = player.hasChoiceMade(checkSceneId, checkChoiceIndex) ?
                trueNextSceneId : falseNextSceneId;

        return new Choice(text, nextSceneId, effect);
    }
}