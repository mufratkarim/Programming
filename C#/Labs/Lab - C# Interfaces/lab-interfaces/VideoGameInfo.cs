using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab_interfaces
{
    public class VideoGameInfo:IDisplay, IFileOperations
    {
        public string Name { get; set; }
        public string Platform { get; set; }
        public double Price { get; set; }

        private StreamWriter sw;
        public void Open(string filename)
        {
            sw = new StreamWriter(filename);
        }

        public void Save()
        {
            sw.WriteLine(Name + "\n" + Platform + "\n" + Price);
        }

        public void Show()
        {
            Console.WriteLine(Name + "\n" + Platform + "\n" + Price);

        }
    }
}
