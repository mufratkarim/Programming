using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace lab_Serialization
{

    [DataContract]
    class Person
    {
        private string first, last;
        private int age;
        private Address p_address;

        public Person()
        {
            p_address = new Address();

        }

        [DataMember(Name = "First")]
        public string First { get { return first; } set { first = value; } }

        [DataMember(Name = "Last")]
        public string Last { get { return last; } set { last = value; } }

        [DataMember(Name = "Age")]
        public int Age { get { return age; } set { age = value; } }

        [DataMember(Name = "Address")]
        public Address P_address { get { return p_address; } set { p_address = value; } }


    }
}
