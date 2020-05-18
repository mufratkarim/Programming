using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab_interfaces
{
    class Program
    {
        static void Main(string[] args)
        {

            VideoGameInfo vg = new VideoGameInfo();
            vg.Name = "Fifa 2030";
            vg.Price = 20.99;
            vg.Platform = "PC";


            IFileOperations[] a1 = new IFileOperations[10];
            DoSomething(vg);
            a1[0] = vg;
            a1[1] = new VideoGameInfo();
            a1[1].Open("abcd");
        }

        static void DoSomething(IDisplay a) {
            a.Show();
        }
    }
}
