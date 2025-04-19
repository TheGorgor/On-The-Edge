import java.util.HashMap;
import java.util.Map;

public class Character {

    private final Map<String, Integer> stats = new HashMap<>();

    public Character() {
        // Zihinsel
        stats.put("intelligence", 60);
        stats.put("focus", 50);
        stats.put("creativity", 50);
        stats.put("stress", 20);

        // Fiziksel
        stats.put("strength", 55);
        stats.put("agility", 60);
        stats.put("stamina", 50);
        stats.put("health", 100);

        // Sosyal
        stats.put("charisma", 45);
        stats.put("empathy", 60);
        stats.put("confidence", 50);

    }

    // Aynı kullanım şekli: player.changeStat("stat_adi", miktar)
    public void changeStat(String stat, int amount) {
        if (!stats.containsKey(stat)) {
            System.out.println("Bilinmeyen istatistik: " + stat);
            return;
        }

        int oldValue = stats.get(stat);
        int newValue = clamp(oldValue + amount);
        stats.put(stat, newValue);

        String sign = (amount > 0) ? "+" : "";
        System.out.printf("%s %s%d (%d → %d)\n", capitalize(stat), sign, amount, oldValue, newValue);
    }

    public int getStat(String stat) {
        return stats.getOrDefault(stat, 0);
    }

    private int clamp(int value) {
        return Math.max(0, Math.min(100, value));
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
