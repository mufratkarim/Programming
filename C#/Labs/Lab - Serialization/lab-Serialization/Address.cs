using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace lab_Serialization
{
    [DataContract]
    class Address
    {
        private string city;
        private string state;


        [DataMember(Name ="City")]
        public string City { get { return city; } set { city = value; } }

        [DataMember(Name ="State")]
        public string State { get { return state; } set { state = value; } }


        public Address()
        {
            city = "Queens";
            state = "NY";



        }
    }
}
