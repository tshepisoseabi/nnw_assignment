package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //I am creating a manual array that will contain 5 integers

        int[] numbersToBeDivided= {20,0,5,78,60,71};
        int highestCommonFactor = highestCommonFactor(numbersToBeDivided);

        System.out.print("The highest common factor is: "+ highestCommonFactor);
    }

    public static int highestCommonFactor(int[] numbers) {

        int cmf = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Values Passed to be calculated = "+ cmf + "," + numbers[i]);
            cmf = calculateCommonFactor(cmf,numbers[i]);

            System.out.println(i + ".Common Factor = "+cmf);
        }

        return cmf;
    }

    public static int calculateCommonFactor(int firstValue,int secondValue){

        while (secondValue != 0) {
            int temp = secondValue;
            secondValue = firstValue % secondValue;
            firstValue = temp;
        }
        return firstValue;

    }

}