import java.util.*;

public class SceneFactory {

    public static Map<Integer, Scene> createScenes(Character player) {
        Map<Integer, Scene> scenes = new HashMap<>();

        scenes.put(0, new Scene(
                "Bir mağaranın girişindesin. İçeri girmek mi, köye geri dönmek mi?",
                List.of(
                        new Choice("Mağaraya gir", 1, () -> player.changeStat("courage", +10)),
                        new Choice("Köye geri dön", 2, () -> player.changeStat("charisma", +5))
                )
        ));

        scenes.put(1, new Scene(
                "Mağara karanlık ve sessiz. Bir parıltı görüyorsun.",
                List.of(
                        new Choice("Parıltıya yaklaş", 3, () -> player.changeStat("intelligence", +5)),
                        new Choice("Geri dön", 2, () -> player.changeStat("health", -10))
                )
        ));

        scenes.put(2, new Scene(
                "Köyde bir bilge seni bekliyor. Yeni şeyler öğrenebilirsin.",
                List.of(
                        new Choice("Bilgeyle konuş", -1, () -> player.changeStat("intelligence", +10)),
                        new Choice("Uyumaya git", -1, () -> player.changeStat("health", +10))
                )
        ));

        scenes.put(3, new Scene(
                "Parıltının kaynağı bir altın sandığı! Ama bir tuzak olabilir...",
                List.of(
                        new Choice("Sandığı aç", -1, () -> {
                            player.changeStat("luck", +10);
                            player.changeStat("health", -20);
                        }),
                        new Choice("Uzaklaş", -1, () -> player.changeStat("wisdom", +10))
                )
        ));

        return scenes;
    }
}
