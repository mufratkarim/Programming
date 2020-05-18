using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab_objects
{
    class Driver
    {
        static void Main(string[] args)
        {
            message m = new message();

            Console.WriteLine(m.ToString());
            Console.WriteLine(m.TitleAndBody());
        }
    }
}
