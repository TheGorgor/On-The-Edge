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
                        new Choice("Hazırlan.", 4)
                )
        ));

        scenes.put(2, new Scene(
                "Her gün peynir-ekmek yiyorum. Yine de kahvaltının vazgeçilmezidir. Neyse ne, artık hazırlanmalıyım.",
                List.of(
                        new Choice("Hazırlan", 4)
                )
        ));

        scenes.put(3, new Scene(
                "Hemen yumurtayı haşlayıp yedim. Aaa.. Biz okul olarak geçen sene yumurta festivali düzenlemiştik. " +
                        "Birbirimize fırlatıyorduk. Neyse, artık hazırlanmam gerek.",
                List.of(

                        new Choice("Hazırlan", 4)
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
                        new Choice("Sınıfa geç.", 11)
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
                            player.changeStat("strength", +2);
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
                        new Choice("Sınıfa geç.", 11)
                )
        ));
        scenes.put(9, new Scene(
                "Ryan yumruğumun darbesi ile yere devrildi. \"Bu yaptığını unutmayacağım. Senden şikayetçi de " +
                        "olmayacağım çünkü cezanı bir bizzat kendim sana vereceğim.\" deyip tuvalete gitti. Allah'tan yanımda sadece Nathan vardı, herkes yemek yiyordu. ",
                List.of(
                        new Choice("Sınıfa geç.", 11)
                )
        ));
        scenes.put(10, new Scene(
                "\"Öyle olsun\" deyip gitti.",
                List.of(
                        new Choice("Sınıfa geç.", 11)
                )
        ));
        scenes.put(11, new Scene(
                "Sınıfa geçtim ve öğleden sonraki derslerime hazırlandım. Okul hızlı geçiyordu. Ryan'ın sesleri sürekli duyuluyordu. O itici, kaba sesi..." +
                        " Onu koridordan geçerken gördüm ve etrafında bir sürü kız vardı. Üstelik de pis pis konuşuyorlardı. Acaba böyle davranmak daha da ilgi çekip daha çekici" +
                        " mi yapıyor? Neyse, şimdi düşünmenin sırası değil. \nDersler oldukça hızlı geçti. Dönüşte Nathanlta beraber dödüm, tekrardan sohbet ettim. " +
                        "Eve geldiğimde annem bana kapıyı açtı ve hasta olduğunu dolayısıyla biraz uzanıp dinleneceğini söyledi." +
                        "\"Geçmiş olsun.\" dedim. \nÖdev verilmediği için biraz video izledim. Ardından programlama çalıştım. Saat geç olmuştu ki tam yatacakken babam geldi." +
                        " Bazenleri geç gelebiyor. ",
                List.of(
                        new Choice("Uyu", 12, () -> {
                            player.changeStat("health", +2);
                            player.changeStat("mental health", +1);
                            player.changeStat("friend/nathan", +1);
                        })
                )
        ));


        scenes.put(12, new Scene(
                player.hasChoiceMade(7,1) || player.hasChoiceMade(7,2) ? "Günaydın millet. Nathan'ın enerjisi sanırsam bana geçmiş. Bugün kendimi harika hissediyorum. " +
                        "Sonrasında okula gitmek için yola çıktım. Yolda Ryan karşıma çıktı. Göz göze geldik ve bana selam verdi. \n" +
                        "Dün gerçekleşen olaya rağmen bana selam verdi. İlginç... Bu yaptığımı unutmayacağını söylemişti. Sanki biraz daha saygı duymaya başladı. " :
                        "Günaydın millet. Nathan'ın enerjisi sanırsam bana geçmiş. Bugün kendimi harika hissediyorum. " +
                                "Her şey şahane gidiyor. Okula giderken Ryan'la karşılaştım ama selam vermeden yanımdan geçti. İnsanlık bitmiş ya, dövmedim  de suratına da tükürmedim çocuğun.",
                List.of(
                        player.hasChoiceMade(7,1) || player.hasChoiceMade(7,2) ? new Choice("Geri selam ver ve okula git", 13, () -> {
                            player.changeStat("friend/ryan", +1);
                            player.changeStat("confidence", +1);
                        }) : new Choice("Okula git.", 13)
                )
        ));

        scenes.put(13, new Scene(
                "Okula giderken Nathan'ı hiç görmedim. Dün oldukça mutlu olan çocuk, bugün nerede? Bu sefer okula erkenm gelmiştim Nathan'la daha çok sohbet etmek için. " +
                        "Çocuk yok. Neyse, hemen etrafıma baktım. Charlotte, Alexander ve John boş boş sıralarında oturuyorlar. Kime gitsem ya da kimseye gitmek zorunda mıyım?",
                List.of(
                        new Choice("Charlotte", 14, () -> {}),
                        new Choice("Alexander", 15,() -> {}),
                        new Choice("John", 16, () -> {}),
                        new Choice("Geç otur yerine", 17, () -> {})
                )
        ));
        scenes.put(14, new Scene(
                "Charlotte'un yanına gittim. Nasıl olduğunu sordum. Ryan hakkında konuştuk ve Ryan'ın eskisi gibi olmadığını söyledi. " +
                        "Ağzının bozulduğunu söyledi. Kesinlikle katılıyorum. " +
                        "Dersin başlamasına 1 dakika vardı, hemen \"Görüşürüz\" deyip dersime hazırlandım. ",
                List.of(
                        new Choice("Geç otur yerine", 18, () -> {
                            player.changeStat("friend/charlotte", +3);
                            player.changeStat("confidence", +1);
                            player.changeStat("happiness", +1);
                            player.changeStat("mental health", +1);
                            player.changeStat("popularity", +1);
                        })
                )
        ));
        scenes.put(15, new Scene(
                "Hemen Alexander'ın yanına gittim. \"Günaydın\" deyip elleri sıkışırken ayağa kalktı. Manyak bir boy atmış. İnanılmaz... Neyse ne..." +
                        " Nasıl olduğunu ve Nathan'dan haberi olup olmadığını sordum. Bilmiyormuş. " +
                        "Dersin başlamasına az kalmıştı dolayısıyla hemen \"Görüşürüz\" deyip dersime hazırlandım.",
                List.of(
                        new Choice("Geç otur yerine", 18, () -> {
                            player.changeStat("friend/alexander", +3);
                            player.changeStat("confidence", +1);
                            player.changeStat("happiness", +1);
                            player.changeStat("mental health", +1);
                            player.changeStat("popularity", +1);
                        })
                )
        ));
        scenes.put(16, new Scene(
                "Hızlıca John'un yanına gittim. \"Günaydın\" deyip nasıl olduğunu sordum. Gözlük takmaya başlamış, ben de kaç numara olduğunu sordum. 1.5'miş. " +
                        "Nathan'dan haberi olup olmadığını sordum. Hiçbir bilgisi yokmuş. " +
                        "Dersin başlamasına 1 dakikadan az kalmıştı ki hemen \"Görüşürüz\" deyip dersime hazırlandım.",
                List.of(
                        new Choice("Geç otur yerine", 18, () -> {
                            player.changeStat("friend/john", +3);
                            player.changeStat("confidence", +1);
                            player.changeStat("happiness", +1);
                            player.changeStat("mental health", +1);
                            player.changeStat("popularity", +1);
                        })
                )
        ));
        scenes.put(17, new Scene(
                "En iyisi bugünki tüm derslerime hazırlanayim. Matematik... Matematik... Fizik...\n" +
                        "Tüm derslerime hazırlandıktan sonra 1 dakikamın olduğunu fark ettim. Artık sırama geçmeliyim.",
                List.of(
                        new Choice("Geç otur yerine.", 18, () -> {
                            player.changeStat("confidence", -1);
                            player.changeStat("happiness", -1);
                            player.changeStat("popularity", -1);
                            player.changeStat("mental health", -1);
                        })
                )
        ));
        scenes.put(18, new Scene(
           "Matematik hocamı çok seviyorum. Hem bilgili hem de komik bir insan. Sabah sabah matematik çekilmez " +
                   "diyen arkadaşlarım kesinlikle yanılıyorlar. Ders hızlıca geçti. 2 art arda olamsına rağmen hızlıca geçti. " +
                   "Teneffüste 2 tane dengesiz arkadaş kuduruyorlardı. Pet şişeyle oyun oynuyorlar birbirlerine vuruyorlardı. " +
                   "Sonrasında pet şişe patladı ve Alexander'a geldi. Sırıl sıklam olmuştu üstü. Alexander oldukça sinirlenmişti ama kendisini " +
                   "kontrol ettiği çok belli oluyordu. Öğretmenlerden bir tanesine anlattı bu durumu. Öğretmen de gerekeni yapacağını belirtmiş. " +
                   "Ne kadar kontrollü bir insan olduğu anlaşılıyor Alexander'ın. " +
                   (player.hasChoiceMade(13, 1) ? "Charlotte alıngan bir kız değil, konuşmadım diye asla alınmaz. Sabah keşke Alexander ile konuşsaydım." :
                    player.hasChoiceMade(13,2) ? "İyi ki sabah Alexander ile sohbet etişim. En azından samimiyetimiz arttı.":
                    player.hasChoiceMade(13,3) ? "Sabah,John yerine Alexander ile sohbet etseydim keşke. Gerçi John da kötü bir insan değil. ":
                    player.hasChoiceMade(13,4) ? "Keşke Alexander ile sohbet etseydim sabah okula gelince.": " ") + "Neyse, " +
                   "Alexander'la sohbet etmeliyim, yoksa etmesem mi?",
           List.of(
                   new Choice("Alexander ile konuş.", 19, () -> {
                       player.changeStat("friend/alexander", +1);
                       player.changeStat("confidence", +1);
                       player.changeStat("happiness", +1);
                       player.changeStat("popularity", +1);
                   }),
                   new Choice(player.hasChoiceMade(13,4) ? "Geç otur yerine ve dersin başlamasını bekle." : "Geç otur yerine ve derse hazırlan.", 21, () -> {
                       player.changeStat("confidence", -1);
                       player.changeStat("happiness", -1);
                       player.changeStat("popularity", -1);
                   })
           )
        ));
        /*scenes.put(18, new Scene(
                player.hasChoiceMade(13,1) ? "ev" :
                player.hasChoiceMade(13,2) ? "ed" : "er",
                List.of(
                        new Choice()
                )
        ));*/
        scenes.put(19, new Scene(
                "Alexander'ın yanına gittim. Bu olay hakkında ne düşündüğünü sordum. Böyle dengesizlerle aynı ortamda bulunmak istemediğini söyledi. " +
                        "Rahatsız olduğunu ve böyle dengesizlerle uğraşmanın insanı daha da belaya sokacağını söyledi. Hak verdim. " +
                        "Dengesiz dedi ve aklıma Ryan geldi. Ona Ryan'dan bahsetsem mi? ",
                List.of(
                        new Choice("Ryan'dan bahset", 20, () -> {
                            player.changeStat("friend/alexander", +1);
                        }),
                        new Choice("\"Görüşürüz\" deyip sırana geç", 21)
                )
        ));
        scenes.put(20, new Scene(
                player.hasChoiceMade(7,1) ? "Ryan'ın suratına tükürdüğümden bahsettim. Gerçekten hak ettiğini söyledi ama " +
                        "başımın belaya girebileceğinden bahsetti. Ben de bana saygı duymaya başladığını söyledim. " +
                        "Sabah bana selam verdiğini söyledim. \"İlginç...\" dedi. Dersin başlamasına az kaldı. \"Görüşürüz, tekrardan geçmiş olsun\" " +
                        "dedim." :
                player.hasChoiceMade(7,2) ? "Ryan'ın suratına yumruk attığımdan bahsettim. Gerçekten hak ettiğini söyledi ama " +
                        "başımın ciddi anlamda belaya girebileceğinden bahsetti. Tam tersi, ben de bana saygı duymaya başladığını söyledim. " +
                        "Sabah yolda beni gördüğünde kavga falan olacak zannetmiştim ama bana selam verdiğini söyledim." +
                        " \"İlginç... Bu işte bir terslik var\" dedi. Dersin başlamasına az kalmıştı dolayısıyla \"Görüşürüz, tekrardan geçmiş olsun\" " +
                        "dedim." :
                        "Ryan'ın eskisi gibi olmadığından ve oldukça terbiyesizce konuştuğundan bahsettim. " +
                        "Onunla önceden iyi geçindiğimizden bahsettim. Yine çok yakın değildik ama oyunlurda, sporlarda beraber takım olduğumuzda " +
                        "oldukça iyi oynuyorduk. Alexander da bu dönemlerde insanlar çevrelerinden oldukça etkilenebildiğinden ama asıl etkinin ailede " +
                        "olduğundan bahsetti. Dersin başlamasına az kalmıştı dolayısıyla \"Görüşürüz, tekrardan geçmiş olsun\"" +
                        "dedim.",
                List.of(
                        new Choice("Sırana geç", 21, () -> {
                            player.changeStat("friend/alexander", +1);
                            player.changeStat("confidence", +1);
                            player.changeStat("popularity", +1);
                        })
                )
        ));
        scenes.put(21, new Scene(
                "Sırama geçtim. O sırada fizik hocası da sınıfa girmişti. Hoca yoklama alıyordu. " +
                        "Nathan'ın olmadığını onun dışında sınıfın tam olduğunu söyledik. Acaba Nathan nerede? Yüksek ihtimalle hastadır. " +
                        "Hoca Nathan'ın neden gelmediğini sordu. \"Bilmiyoruz\" dedik. Hoca 11. sınıf fiziğin en zor konusunu işleyeceğimizi söyledi. " +
                        "Dikkatlice dinlememizi söyledi. O sırada telefonum titreşti. Bakmalı mıyım?",
                List.of(
                        new Choice("Telefona bak", 22),
                        new Choice("Derse odaklan", 23, () -> {
                            player.changeStat("grade", +1);
                            player.changeStat("focus", +1);
                            player.changeStat("intelligence", +1);
                        })
                )
        ));
        scenes.put(22, new Scene(
                "Hoca görmeyecek şekilde hemen telefonuma baktım. Babam mesaj atmış. bugün gelemeyeceğini söylüyordu, belki de iki gün. " +
                        "Neyse, şimdi dersime odaklanmalıyım yoksa hoca bayağı bir kızacak.",
                List.of(
                        new Choice("Derse odaklan",23, () -> {
                            player.changeStat("grade", +1);
                            player.changeStat("focus", +1);
                            player.changeStat("intelligence", +1);
                        })
                )
        ));
        scenes.put(23, new Scene(
                (player.hasChoiceMade(21,2) ? "Hoca teneffüsümüzü almasına rağmen ders yine hızlı geçti. Hemen telefonuma baktım ve babamda silinmiş mesaj olduğu gözüküyor." :
                "Ders oldukça hızlı geçti. Tekrardan telefonumu açıp baktığımda babamın attığı mesajın silinmiş olduğunu gördüm.") + "Neyse... " +
                        "",
                List.of(
                        new Choice("Sıranda oturmaya devam et", 24)
                )
        ));
        //Sahne 24 ile insanların aynı zamanda kendi içerisinde kendilerine karşı verdikleri kararların da hayatlarını değiştirebilecekleri vurgulandı
        //Kilit nokta bura
        //Ayrıca burada oyuncuyu da oyuna çektim ve ana karakteri ona bağladım.
        //En sonunda bu fikrinden dolayı da aykırı olmanın verdiği özgüven ile kararlarda bulunacak
        //Bakalım oyuncu başına bela alacak mı?
        scenes.put(24, new Scene(
                "Hoca gelene kadar sırama oturdum. Etrafıma baktım; insanların boş bakışlarına, masaların üstündeki çiziklere, kitapların arasına sıkışmış umut kırıntılarına. " +
                        "Ve bir an durup sordum kendime: Bu hayat... gerçekten benim seçimim mi? Yoksa önüme serilmiş bir patikada, hiçbir yere varmayan adımlar mı atıyorum? " +
                        "Bu sabah Nathan'ı göremedim. Ryan değişti. Belki de herkes değişiyor. Belki de hepimiz, bilmediğimiz kararlara sürükleniyoruz. " +
                        "Şartlar mı şekillendiriyor bizi? Yoksa verdiğimiz kararlar mı şartları büküyor? " +
                        "Ryan'ı ve Nathan'ı düşündüm. İkisi de baskıcı ailelerin çocukları. İkisi de aynı fırtınada büyüdü. Ama biri fırtınaya direndi, diğeri fırtınayı kucakladı. " +
                        "Demek ki sadece şartlar değil; en büyük etken, insanın kendisine karşı verdiği kararlar. " +
                        "Ve belki de, en zoru, kendi içimizde verdiğimiz sessiz savaşlarda kim olduğumuza karar vermek. " +
                        "Aileler iyi niyetli olabilir. Ama iyi niyet bile insanı kurtarmaz bazen. Eğer her 'iyi' öğüt insanı adam etseydi, dünya meleklerle dolu olurdu. " +
                        "Belki de mesele, ne duyduğumuzda değil... neyi seçtiğimizde gizlidir. Peki ya, ben?",
                List.of(
                        new Choice("Kendi seçimlerimi yapacağım. Ne olursa olsun.", 25, () -> {
                            player.changeStat("confidence", +4);
                            player.changeStat("courage", +2);

                        })

                )
        ));

        scenes.put(25, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(26, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(27, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(28, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(29, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(30, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(31, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(32, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(33, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(34, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(35, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(36, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(37, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(38, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(39, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        scenes.put(40, new Scene(
                "",
                List.of(
                        new Choice()
                )
        ));
        return scenes;
    }
}
