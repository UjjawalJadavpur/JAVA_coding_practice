
import java.util.Set;

public class countVowel {

    public static void main(String[] args) {

        String str = "a bss  ikkk p P e ou";
        // int length = str.length();
        int vowel = 0, consonant = 0;

        Set<Character> vowelset = Set.of(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        );

        // Set<Character> vowels = new HashSet<>(
        //         Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        // );

        for (Character ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelset.contains(ch)) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("vowel : " + vowel + " consonant : " + consonant);

    }
}
