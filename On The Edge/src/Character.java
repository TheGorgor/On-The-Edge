import java.util.HashMap;
import java.util.Map;

public class Character {

    private final Map<String, Integer> stats = new HashMap<>();
    private final ChoiceHistory choiceHistory = new ChoiceHistory();

    public Character() {
        //Akademik
        stats.put("grade", 70);

        // Zihinsel
        stats.put("intelligence", 60);
        stats.put("focus", 50);
        stats.put("creativity", 50);
        stats.put("stress", 20);
        stats.put("happiness", 60);
        stats.put("courage", 50);
        stats.put("mental health", 75);

        // Fiziksel
        stats.put("strength", 55);
        stats.put("agility", 60);
        stats.put("stamina", 50);
        stats.put("health", 100);

        // Sosyal
        stats.put("charisma", 45);
        stats.put("empathy", 60);
        stats.put("confidence", 50);
        stats.put("honesty", 50);
        stats.put("popularity", 50);

        //İlişkiler/Arkadaşlar
        stats.put("friend/emily", 50);
        stats.put("friend/john", 50);
        stats.put("friend/arthur", 50);
        stats.put("friend/charlotte", 50);
        stats.put("friend/lucas", 50);
        stats.put("friend/william", 50);
        stats.put("friend/amelia", 50);
        stats.put("friend/isabella", 50);
        stats.put("friend/alexander", 50);
        stats.put("friend/scarlett", 50);
        stats.put("friend/nathan", 50);
        stats.put("friend/samuel", 50);
        stats.put("friend/stella", 50);
        stats.put("friend/chloe", 50);
        stats.put("friend/violet", 50);
        stats.put("friend/ryan", 50);

        //İlişkiler/Aile-Akrabalar
        stats.put("mom/ava", 90);
        stats.put("dad/henry", 90);
        stats.put("cousin/evelyn", 85);

        //Hobiler
        stats.put("chess", 50);
        stats.put("football", 50);
        stats.put("programming", 50);
        stats.put("robotics", 50);
        stats.put("3D modelling", 50);
        stats.put("theatre", 50);

    }

    // Aynı kullanım şekli: player.changeStat("stat_adi", miktar)
    public void changeStat(String stat, int amount) {
        if (!stats.containsKey(stat)) {
            return;
        }

        int oldValue = stats.get(stat);
        int newValue = clamp(oldValue + amount);
        stats.put(stat, newValue);
    }

    public int getStat(String stat) {
        return stats.getOrDefault(stat, 0);
    }

    private int clamp(int value) {
        return Math.max(0, Math.min(100, value));
    }

    public void recordChoice(int sceneId, int choiceIndex) {
        choiceHistory.recordChoice(sceneId, choiceIndex);
    }

    public boolean hasChoiceMade(int sceneId, int choiceIndex) {
        return choiceHistory.hasChoiceMade(sceneId, choiceIndex);
    }

    public ChoiceHistory getChoiceHistory() {
        return choiceHistory;
    }

    public void showStats() {
        System.out.println("\n===== Karakter İstatistikleri =====");
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            System.out.printf("%-12s : %d\n", capitalize(entry.getKey()), entry.getValue());
        }
    }

    private String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}