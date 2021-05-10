/*
* ASS - 6
* SHAPE USING INHERITANCE
*/


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Shape
{
    float side1;
    float side2;

    void display()
    {
        System.out.println("Shape class Display");
    }
}

class Rectangle extends Shape
{
    Rectangle()
    {

    }

    Rectangle(float side1, float side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    void display()
    {
        System.out.println("Perimeter of rectangle = " + 2 *(side1 + side2));
        System.out.println("area of rectangle = " + (side1 * side2));
    }
}

class Square extends Rectangle
{
    Square(float side1)
    {
        this.side1 = side1;  
    }
  
    void display()
    {
        System.out.println("Perimeter of square = " + (4 * side1 ));
        System.out.println("area of square = " + (side1 * side1));
    }
}




class Shape_Ass6
{
    public static void main(String[] args)throws IOException
    {
        float side1, side2, radius;

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        Shape ob;

        // for rectangle
        System.out.print("==================Rectangle===================\nEnter side1 = ");
        side1 = Float.parseFloat(buf.readLine());
        System.out.print("Enter side2 = ");
        side2 = Float.parseFloat(buf.readLine());

        ob = new Rectangle(side1, side2);
        ob.display();

        // for square
        System.out.println("=================Square=======================\nEnter side1 = ");
        side1 = Float.parseFloat(buf.readLine());

        ob = new Square(side1);
        ob.display();
    }
}