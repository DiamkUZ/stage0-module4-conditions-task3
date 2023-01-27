package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        String englishAlphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";

        if (englishAlphabet.contains("" + symbol)) {
            System.out.println("English");
        } else System.out.println("Non English");

    }
}
