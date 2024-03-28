public class HomeWork {

    public static void main(String[] args) {
//        int[] numbers = {25, 151, 15, 10};
        int[] numbers = {10, 15, 25, 151};

        int[] numbersSortedArray = {25, 151, 15, 10};


        /*  // 1. Verilmis ededler siyahisindaki reqemlerinin cemi tek olan ededlerin ededi oratsini tapan alqoritm
        int temp;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            int digitSum = 0;

            while (temp > 0) {
                int lastNum = temp % 10;
                digitSum += lastNum;
                temp /= 10;
            }

            if (digitSum % 2 == 1) {
                System.out.print(numbers[i] + " ");
                sum += numbers[i];
                count ++;
            }

        }
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("count = " + count);
        System.out.println("sum / count = " + (double) sum / count);*/






        /* // 2. Verilen arrayi tersine cevirin, meselen [1,2,3,4] -> [4,3,2,1]

        for (int i = 0; i < numbers.length; i ++ ) {
            System.out.print(numbers[numbers.length - i - 1] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }*/




//        3. Verilen arrayin elementlerinin sorted (kicikden boyuye dogru) olub olmadigini cap edin. Meselen: [1,2,3,5] -> Sorted
//                [1,3,5,4] -> Unsorted
        int temp;
        for (int i = 0; i < numbersSortedArray.length; i++) {
            for (int j = i + 1; j < numbersSortedArray.length; j++) {

                if(numbersSortedArray[i] > numbersSortedArray[j]) {
                    temp = numbersSortedArray[j];
                    numbersSortedArray[j] = numbersSortedArray[i];
                    numbersSortedArray[i] = temp;
                }

            }
        }

        for (int i = 0; i < numbersSortedArray.length; i++) {
            if(numbers[i] != numbersSortedArray[i]) {
                System.out.println("Unsorted");
                return;
            }
            System.out.println("Sorted");
            return;
        }










    }

}
