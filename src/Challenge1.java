public class Challenge1 {
    public static void main(String[] args) {
        int[] fibonacciNum = new int[40];
        fibonacciNum[0] = 0;
        fibonacciNum[1] = 1;
        int counter = 2;
        int a = 0;
        int b = 0;

        //Task 1
        System.out.println("Number 1");
        System.out.println(fibonacciNum[0]);
        System.out.println("Number 2");
        System.out.println(fibonacciNum[1]);

        while(counter < 40){
            a = counter-1;
            b = counter-2;
            fibonacciNum[counter] = fibonacciNum[a] + fibonacciNum[b];
            System.out.println("Number " + counter);
            System.out.println(fibonacciNum[counter]);
            counter++;
        }

        int answer2 = 0;
        int answer3 = 0;
        int answer4 = 0;
        int answer5 = 0;
        double answer6 = 0.0;

        // Task 2
        counter = 0;
        while (counter < 40){
            answer2 += fibonacciNum[counter];
            counter++;
        }

        // Task 3
        counter = 0;
        while (counter < 40){
            System.out.println(fibonacciNum[counter] % 2);
            if((fibonacciNum[counter] % 2) < 1){
                answer3++;
            }
            counter++;
        }

        // Task 4 & 5
        counter = 0;
        while (counter < 40){
            if((fibonacciNum[counter] % 3) < 1){
                answer4++;
                answer5 += fibonacciNum[counter];
            }
            counter++;
        }

        // Task 6
        answer6 = ((double)answer2 / 40);

        System.out.println("Answer 2: " + answer2);
        System.out.println("Answer 3: " + answer3);
        System.out.println("Answer 4: " + answer4);
        System.out.println("Answer 5: " + answer5);
        System.out.println("Answer 6: " + answer6);
    }
}
