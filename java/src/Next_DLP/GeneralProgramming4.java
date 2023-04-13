package Next_DLP;

public class GeneralProgramming4 {
    public static void main(String[] args) {
        System.out.println(populateDigit(3));
    }

    private static int populateDigit(int digit){
        int prev = digit;
        int result = prev;
        for(int i = 1; i < 4; i++){
            prev += digit * (int) Math.pow(10, i);
            result += prev;
        }
        return result;
    }
}
