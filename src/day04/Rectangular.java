package day04_Variables;

public class Rectangular {
    public static void main(String[] args) {

        double lenght = 10.2;
        double width = 12.8;

        double area = lenght * width;

        double perimeter = 2 * (lenght+width);

        System.out.println("lenght = " + lenght);
        System.out.println("width = " + width);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }


}
/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */