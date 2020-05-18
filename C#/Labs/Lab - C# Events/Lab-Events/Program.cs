using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_Events
{
    class Program
    {
        static void Main(string[] args)
        {

            Company company = new Company();
            company.Name = "Asus";
            Customer jobs = new Customer();
            jobs.Name = "Jobs";
            Customer mark = new Customer();
            mark.Name = "Mark";

            int choice;

            do
            {
                ShowMenu();

                choice = Convert.ToInt32(Console.ReadLine());

                switch (choice)
                {
                    case 1:
                        company.ShipmentArrivedEvent += jobs.ProcessShipmentArrivedEvent;
                        Console.WriteLine(jobs.Name);
                        break;
                    case 9:
                        company.FireShipmentArrived("That means, it worked");
                        break;

                }

            } while (choice != 11);

        }

        private static void ShowMenu()
        {
            Console.WriteLine("Enter your option: ");
        }
    }
}
