using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_Arrays
{
    class Program
    {
        /*
                In Main declare and allocate an array of double.
        •	Load the array with double type data.The data should NOT be loaded in order(sort will be used on the next step).
        •	Display method.Write a static method called Display that takes a double array as a parameter.This method should iterate through all the array data and display it on the screen.
        •	Before sorting (next step) display all original data in the array by calling the Display method.
        •	Sort.Use the Sort method of the Array class to sort the array.
        •	After sorting display all data in the array by calling the Display method.
        •	Clone.Use the Clone method of the array instance to make a copy of the array.
        •	Display all data in the array clone on the screen.*/


        static void Display(Grade[] arr)
        {

            foreach(Grade x in arr)
            {
                Console.Write(x + " ");
            }


        }
        static void Main(string[] args)
        {

            Grade[] g = new Grade[4];
            g[0] = new Grade(95, "Hw1");
            g[1] = new Grade(55, "Hw1");
            g[2] = new Grade(75, "Hw1");
            g[3] = new Grade(85, "Hw1");

            Console.WriteLine("Before sorting:");
            Display(g);
            Array.Sort(g);
            Console.WriteLine("\nAfter sorting:");
            Display(g);


/*            double[] data = { 15, 23, 21, 38, 25, 39, 57 };
            double[] cloneData;
            Console.WriteLine("Before sorting:");
            Display(data);
            Array.Sort(data);
            Console.WriteLine("\nAfter sorting:");
            Display(data);

            cloneData = (double[])data.Clone();
            Console.WriteLine("\nClone Data:");
            Display(cloneData);*/


        }
    }
}
