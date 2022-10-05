package company.a.b.c.kata.welcome;

import java.util.HashMap;

public class Welcome {

    public static String greet(String language) {

        final HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("IP_ADDRESS_INVALID", "Welcome");
        hashMap.put("IP_ADDRESS_NOT_FOUND", "Welcome");
        hashMap.put("IP_ADDRESS_REQUIRED", "Welcome");
        hashMap.put("english", "Welcome");
        hashMap.put("czech", "Vitejte");
        hashMap.put("danish", "Velkomst");
        hashMap.put("dutch", "Welkom");
        hashMap.put("estonian", "Tere tulemast");
        hashMap.put("finnish", "Tervetuloa");
        hashMap.put("flemish", "Welgekomen");
        hashMap.put("french", "Bienvenue");
        hashMap.put("german", "Willkommen");
        hashMap.put("irish", "Failte");
        hashMap.put("italian", "Benvenuto");
        hashMap.put("latvian", "Gaidits");
        hashMap.put("lithuanian", "Laukiamas");
        hashMap.put("polish", "Witamy");
        hashMap.put("spanish", "Bienvenido");
        hashMap.put("swedish", "Valkommen");
        hashMap.put("welsh", "Croeso");

        return hashMap.get(language);
    }
}

//if (greeting.containsKey(language)) {
//      return greeting.get(language);
//    }
//    return greeting.get("english");