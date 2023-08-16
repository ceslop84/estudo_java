
public class Anagram {

    static boolean isAnagram(String a, String b) {
        boolean greaterThan50 = (a.length()>50) && (b.length()>50);
        if (greaterThan50){
            System.out.println("Input lenght out of range.");
            return false;
        }

        if (a.length() != b.length()){
            return false;
        }

        char[] chars = generateList(a);
        int[] freqA = new int[chars.length];
        int[] freqB = new int[chars.length];
        int i = 0;
        for (char ch : chars){
            calculateFrequencie(ch, i, freqA, a);
            calculateFrequencie(ch, i, freqB, b);
            i++;
        }
        return compare(freqA, freqB);
    }

    public static char[] generateList(String a){
        int i = 0;
        char[] chars = new char[a.length()];
        for (char ch : a.toCharArray()){
            char chUpper = Character.toUpperCase(ch);
            int index = findPosition(chUpper, chars);
            if (index<0){
                chars[i] = chUpper;
            }
            i++;
        }
        return chars;
    }

    public static void calculateFrequencie(char ch, int i, int[] freq, String str ){
        for (char c : str.toCharArray()){
            if (Character.toUpperCase(c) == ch){
                freq[i] += 1;
            }
        }
    }

    public static int findPosition(char ch, char[] chars){
        int i=0;
        for (char c: chars){
            if (Character.toUpperCase(c)==ch){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean compare(int[] freqA, int[] freqB){
        int i = 0;
        for (int f : freqA) {
            if (f!=freqB[i]){
                return false;
            }
            i++;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String a = "anagramm";
        String b = "marganaa";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}