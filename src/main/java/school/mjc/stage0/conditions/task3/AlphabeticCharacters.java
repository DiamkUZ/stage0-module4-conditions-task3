package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String vowelChars = "AEIOUaeiou";
        String consonantChars = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";

        if (vowelChars.contains("" + character)) {
            System.out.println("Vowel");

        } else if (consonantChars.contains("" + character)) {
            System.out.println("Consonant");
        } else System.out.println("wrong alphabet!");

    }
}
