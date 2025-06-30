package java_practice;

public class sorting {
    public static void main(String [] args) {
        System.out.println("*********************************");

        int numberList[] = {5,6,4,234,1,67,76,3};

        for(int i=0; i<numberList.length - 1; i++) {
            for(int j=0; j<numberList.length - i - 1; j++){
                if(numberList[j] > numberList[j + 1]) {
                    int temp = numberList[j];
                    numberList[j] = numberList[j + 1];
                    numberList[j + 1] = temp;
                }
            }
        }
    System.out.println("sorter list: ");
        for(int num: numberList){
            System.out.println(num + " ");
        }



        System.out.println("*********************************");
    }
}
