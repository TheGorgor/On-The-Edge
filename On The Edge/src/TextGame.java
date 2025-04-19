import java.util.Map;

public class TextGame {
    public static void main(String[] args) {
        Character player = new Character();
        Map<Integer, Scene> scenes = SceneFactory.createScenes(player);

        int currentSceneId = 0;

        while (currentSceneId != -1) {
            Scene scene = scenes.get(currentSceneId);
            scene.display();
            int choice = InputHelper.getIntInput("Seçiminiz: ") - 1;

            if (choice >= 0 && choice < scene.choices.size()) {
                Choice selected = scene.choices.get(choice);
                selected.effect.run();
                currentSceneId = selected.nextSceneId;

            } else {
                System.out.println("Geçersiz seçim.");
            }
        }

        System.out.println("\nOyun bitti! 👋");
        player.showStats();
    }
}
