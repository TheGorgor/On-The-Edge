import java.util.ArrayList;
import java.util.List;

public class ChoiceHistory {
    // Store choices as (sceneId, choiceIndex) pairs
    private List<ChoiceRecord> choiceHistory = new ArrayList<>();

    public void recordChoice(int sceneId, int choiceIndex) {
        choiceHistory.add(new ChoiceRecord(sceneId, choiceIndex));
    }

    public boolean hasChoiceMade(int sceneId, int choiceIndex) {
        return choiceHistory.stream()
                .anyMatch(record -> record.sceneId == sceneId && record.choiceIndex == choiceIndex);
    }

    public List<ChoiceRecord> getChoicesFromScene(int sceneId) {
        return choiceHistory.stream()
                .filter(record -> record.sceneId == sceneId)
                .collect(java.util.stream.Collectors.toList());
    }

    public int getChoiceCountForScene(int sceneId) {
        return (int) choiceHistory.stream()
                .filter(record -> record.sceneId == sceneId)
                .count();
    }

    public ChoiceRecord getLastChoice() {
        if (choiceHistory.isEmpty()) {
            return null;
        }
        return choiceHistory.get(choiceHistory.size() - 1);
    }

    // Static inner class to represent a choice record
    public static class ChoiceRecord {
        public final int sceneId;
        public final int choiceIndex;

        public ChoiceRecord(int sceneId, int choiceIndex) {
            this.sceneId = sceneId;
            this.choiceIndex = choiceIndex;
        }
    }
}