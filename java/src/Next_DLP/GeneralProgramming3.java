package Next_DLP;

public class GeneralProgramming3 {
    public static void main(String[] args) {
        System.out.println(isNoOdd(-2222480));
    }

    public static boolean isNoOdd(int num){
        if(num < 0){
            System.out.println("Passed negative value, so return false");
            return false;
        }
        int divider = 1;
        int quotient = num / divider, remainder = num % divider;
        while(quotient > 0){
            if(quotient % 2 != 0 || remainder % 2 != 0)
                return false;
            divider *= 10;
            quotient = num / divider;
            remainder = num % divider;
        }
        return true;
    }
}
