public class Loops {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("Hello");
        }
        for (int i = 50; i < 56; i++){
            System.out.println(i * 3);
        }

        int[] selectedNumbers = {3,5,7,9,1,2,4,10,6,8};
        int counter = 0;

        while (selectedNumbers[counter] < 7){
            System.out.println(selectedNumbers[counter]);
            counter++;
        }




        System.out.println("Finished");
    }


}
