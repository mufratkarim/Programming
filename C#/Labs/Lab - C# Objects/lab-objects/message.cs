using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace lab_objects
{
    public partial class message
    {

        public static int count;
        static message()
        {
            count = 0;

        }


        public string TitleAndBody() => Title + "\n" + Body;

        private string title;
        private string body;
        public enum priority { HIGH, NORMAL, LOW};


        // Auto Implemented Properties
        public string Title { get => title; set => title = value; }
        public string Body { get => body; set => body = value; }      

        public message(string t, string b, priority p, IPAddress i)
        {
            title = t;
            body = b;
            m_priority = p;
            destinationAddress = i;
            version = 1;


        }

        public message() : this("NOTITTLE", "NOBODY", priority.HIGH, System.Net.IPAddress.Parse("127.0.0.1"))
        {

        }

        public override string ToString()
        {
            string s = "";
            s += title + ", " + Body + ", " + destinationAddress.ToString() ;
            return s;
        }

        public override bool Equals(object obj)
        {
            message m = (message)obj;
            bool result = Title.Equals(title);
            return result;
        }



    }
}
