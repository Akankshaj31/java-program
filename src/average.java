public class average {
    public static void main(String[] args) {

            //numbers
            int[] nums = {100,60,85,72,95,85};

            float sum = 0;

            //compute sum
            int i=0;
            while(i < nums.length) {
                sum += nums[i];
                i++;
            }

            //compute average
            float average = (sum / nums.length);

            System.out.println("Average : "+average);
        if (sum>=90){
            System.out.println("you will get bicycle");
        }
        else if (sum>=70 && sum<90) {
            System.out.println("you will get chocolate");
        }
        else {
            System.out.println("study hard");
        }

    }
}
