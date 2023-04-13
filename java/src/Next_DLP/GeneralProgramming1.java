package Next_DLP;

public class GeneralProgramming1 {
    public static void main(String[] args){
        int[] numbers = new int[100];
        int i = 0;
        int n1 = 1, n2 = 1;
        while(i < 100){
            int fn = n1 + n2;
            if(fn % 2 == 0)
                numbers[i++] = fn;
            n2 = n1;
            n1 = fn;
        }

        long sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }
}
