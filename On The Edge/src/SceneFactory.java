import java.util.*;

public class SceneFactory {

    public static Map<Integer, Scene> createScenes(Character player) {
        Map<Integer, Scene> scenes = new HashMap<>();

        scenes.put(0, new Scene(
                "\tSabahın köründe okula gitmek nedir ya? Neyse, ne yapayım yani? Gitmek zorundayım. " +
                        "Yoksa değil miyim? Bence öyleyim. Her neyse. Annem uyanmamış hala, uyandırmasam daha iyi olur. " +
                        "Nasıl olsa artık 11. sınıf öğrencisiyim. \nNe yesem acaba? Yiyebileceğim bunlar var:",
                List.of(
                        new Choice("Nesquik", 1, () -> {
                            player.changeStat("happiness", +3);
                            player.changeStat("stress", -2);
                            player.changeStat("focus", +1);
                            player.changeStat("health", +1);
                            player.changeStat("strength", +1);
                        }),
                        new Choice("Peynir-Ekmek", 2, () -> {
                            player.changeStat("happiness", +2);
                            player.changeStat("stress", -1);
                            player.changeStat("focus", +2);
                            player.changeStat("health", +3);
                            player.changeStat("strength", +2);
                        }),
                        new Choice("Yumurta", 3, () -> {
                            player.changeStat("happiness", +1);
                            player.changeStat("stress", -1);
                            player.changeStat("focus", +3);
                            player.changeStat("health", +4);
                            player.changeStat("strength", +3);
                        })
                )
        ));

        scenes.put(1, new Scene(
                "Çok seviyorum be Nesquik'i. Bir daha yemek isterdim ama artık hazırlanmalıyım. Vakit daraldı.",
                List.of(
                        new Choice("Hazırlan.", 4, () -> {})
                )
        ));

        scenes.put(2, new Scene(
                "Her gün peynir-ekmek yiyorum. Yine de kahvaltının vazgeçilmezidir. Neyse ne, artık hazırlanmalıyım.",
                List.of(
                        new Choice("Hazırlan", 4, () -> {})
                )
        ));

        scenes.put(3, new Scene(
                "Hemen yumurtayı haşlayıp yedim. Aaa.. Biz okul olarak geçen sene yumurta festivali düzenlemiştik. " +
                        "Birbirimize fırlatıyorduk. Neyse, artık hazırlanmam gerek.",
                List.of(

                        new Choice("Hazırlan", 4, () -> {})
                )
        ));
        scenes.put(4, new Scene(
                "Hızlıca hazırlandım ve okula giderken yolda Nathan ile karşılaştım. 10. sınıfta onunla beraber oldukça güzel vakitler geçirmiştim. " +
                        "Ne yazık ki yazın hiç buluşamadık, şehir dışına gitmişlerdi. Hemen yanına gittim, yol boyunca da sohbet ettik. Hiçbir zaman boş konuşan birisi değil." +
                        " İşte Nathan'ı da bu yüzden seviyorum.\nOkula vardığımızda dersin başlamasına 2 dakika vardı dolayısıyla diğer arkadaşlarımla sohbet edecek vaktim yoktu." +
                        " Hemen dersime hazırlandım. \n" +
                        "Gün oldukça hızlı geçiyordu, bi' baktım öğle tenefffüsü olmuş. Nathan'ı oldukça mutlu gördüm. Sanki sınavdan yüz almış gibi davranıyordu ama ortada sınav" +
                        " mınav yok. Yanına gittim ve neden bu kadar mutlu olduğunu sordum. Meğersem Nathan geçen sene kaldığı derslerin sınavlarına girmiş. Bu sınavların hepsi de çok güzel " +
                        "geçmiş. Yalnız inanılmaz mutlu gözüküyor. \n" +
                        "O sırada önümüzden Ryan geçti. Geçen sene oldukça uslu bir çocuktu. Bugün de hiç konuşmamıştım onla. Tam ona nasılsın diyecekken Ryan, Nathan'ın gülüşleri fark etti. " +
                        "Ryan oldukça kaba bir şekilde \"Oglim, sen neğe güliyırsın\" dedi. Eskisi gibi hiç değil, böyle konuşmuyordu bu çocuk. Nathan bu kabalığa karşı " +
                        "ne diyeceğini bilemedi. Dolayısıyla bir şey yapmalıyım. Belki de... Yapmamalıyım. ",
                List.of(
                        new Choice("\"Bugünki sınavları oldukça güzel geçmiş\" de.", 5, () -> {
                            player.changeStat("honesty", +1);
                            player.changeStat("courage", +1);
                            player.changeStat("friend/nathan", +1);
                            player.changeStat("friend/ryan", +1);
                            player.changeStat("confidence", +2);
                        }),
                        new Choice("\"Babası PlayStation 5 almış\" de.", 5, () -> {
                            player.changeStat("honesty", -1);
                            player.changeStat("courage", +1);
                            player.changeStat("friend/nathan", +1);
                            player.changeStat("friend/ryan", +1);
                            player.changeStat("confidence", +2);
                        }),
                        new Choice("Bir şey söylemeyip duymamazlıktan gel.", 6, () -> {
                            player.changeStat("courage", +3);
                            player.changeStat("friend/nathan", +2);
                            player.changeStat("friend/ryan", -1);
                            player.changeStat("confidence", +3);
                        })
                )
        ));
        scenes.put(5, new Scene("Ryan \"Tamamdır babba, bu arada bizim oralarda böyle gülenlere deli derler.\" dedi ve gitti.",
                List.of(
                        new Choice("Sınıfa geç.", 11, () -> {})
                )
        ));
        scenes.put(6, new Scene("\"Hoop, duymuyor musunuz? Neğe güliyorsiniz oglum?\" dedi bağırarak. Oldukça kabalaşmaya başladı, yumruğunu sıktığı anlaşılıyordu. " +
                "Bu kadar hızlı sinirlenmiyordu bu çocuk. Kavga edecek gibi duruyor. Cevap hala Nathan'dan gelmiyordu. Ryan bama dönüp \"Neğe gülir bu lavuk\" dedi. " +
                "Bir şeyler yapmak zorundayım.",
                List.of(
                        new Choice("\"Bugünki sınavları oldukça güzel geçmiş\" de.", 5, () -> {
                            player.changeStat("honesty", +1);
                            player.changeStat("courage", +1);
                            player.changeStat("friend/nathan", +1);
                            player.changeStat("friend/ryan", +1);
                            player.changeStat("confidence", +2);
                        }),
                        new Choice("\"Babası PlayStation 5 almış\" de.", 5, () -> {
                            player.changeStat("honesty", -1);
                            player.changeStat("courage", +1);
                            player.changeStat("friend/nathan", +1);
                            player.changeStat("friend/ryan", +1);
                            player.changeStat("confidence", +2);
                        }),
                        new Choice("\"Lavuk mavuk falan hayırdır? Kendine gel, nerede olduğuna ve kiminle konuştuğuna dikkat et.\" de", 7, () -> {
                            player.changeStat("courage", +4);
                            player.changeStat("confidence", +4);
                            player.changeStat("friend/nathan", +7);
                            player.changeStat("friend/ryan", -2);
                        })
                )
        ));
        scenes.put(7, new Scene(
                "\"Dikkat etmezsem n'olur?\" dedi.",
                List.of(
                        new Choice("\"Bu olur!\" deyip suratına tükür.", 8, () -> {
                            player.changeStat("courage", +5);
                            player.changeStat("friend/nathan", +4);
                            player.changeStat("friend/ryan", -5);
                            player.changeStat("confidence", +5);
                        }),
                        new Choice("\"Aha, bu olur.\" deyip yumruk at.", 9,() -> {
                            player.changeStat("courage", +8);
                            player.changeStat("friend/nathan", +6);
                            player.changeStat("friend/ryan", -7);
                            player.changeStat("confidence", +7);
                        }),
                        new Choice("Özür dileyip Nathan'ın mutlu gününde olduğunu söyle.", 10, () -> {
                            player.changeStat("honesty", +1);
                            player.changeStat("courage", -7);
                            player.changeStat("friend/nathan", +1);
                            player.changeStat("friend/ryan", +1);
                            player.changeStat("confidence", -1);
                        })
        )
        ));
        scenes.put(8, new Scene(
                "\"Bu yaptığını unutmayacağım.\" deyip gitti. Allaah'tan etrafta kimse yoktu, sadece Nathan vardı yanımda, herkes yemek yiyordu.",
                List.of(
                        new Choice("Sınıfa geç.", 11, () -> {})
                )
        ));
        scenes.put(9, new Scene(
                "Ryan yumruğumun darbesi ile yere devrildi. \"Bu yaptığını unutmayacağım. Senden şikayetçi de " +
                        "olmayacağım çünkü cezanı bir bizzat kendim sana vereceğim.\" deyip tuvalete gitti. Allah'tan yanımda sadece Nathan vardı, herkes yemek yiyordu. ",
                List.of(
                        new Choice("Sınıfa geç.", 11, () -> {})
                )
        ));
        scenes.put(10, new Scene(
                "\"Öyle olsun\" deyip gitti.",
                List.of(
                        new Choice("Sınıfa geç.", 11, () -> {})
                )
        ));
        
        return scenes;
    }
}
