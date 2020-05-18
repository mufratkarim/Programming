using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Json;
using System.Text;
using System.Threading.Tasks;

namespace lab_Serialization
{
    class Program
    {
        static void Main(string[] args)
        {
            // Save as JSON FILE
            Address c = new Address();

            String filename = "Address.json";
            c.City = "London";
            c.State = "China";

            FileStream writer = new FileStream(filename, FileMode.Create,
               FileAccess.Write);

            DataContractJsonSerializer ser;
            ser = new DataContractJsonSerializer(typeof(Address));

            ser.WriteObject(writer, c);
            writer.Close();


            // Restore as JSON File

            Address c2;
            String filename2 = "Address.json";
            FileStream reader = new FileStream(filename2, FileMode.Open, FileAccess.Read);


            DataContractJsonSerializer inputSerializer;
            inputSerializer = new DataContractJsonSerializer(typeof(Address));



            c2 = (Address)inputSerializer.ReadObject(reader);
            reader.Close();


            // Save as Person JSON FILE
            Person p = new Person();

            p.First = "George";
            p.Last = "Lopez";
            p.Age = 42;

            Address a1 = new Address();
            a1.City = "Nassau";
            a1.State = "Alaska";
            p.P_address = a1;

            String filename3 = "Person.json";

            FileStream writer2 = new FileStream(filename3, FileMode.Create,
               FileAccess.Write);

            DataContractJsonSerializer ser2;
            ser2 = new DataContractJsonSerializer(typeof(Person));

            ser2.WriteObject(writer2, p);
            writer2.Close();


            // Restore as PERSON JSON File

            Person p2;
            String filename4 = "Person.json";
            FileStream reader2 = new FileStream(filename4, FileMode.Open, FileAccess.Read);


            DataContractJsonSerializer inputSerializer2;
            inputSerializer2 = new DataContractJsonSerializer(typeof(Person));



            p2 = (Person)inputSerializer2.ReadObject(reader2);
            reader2.Close();

            // XML

            Address a3 = new Address();

            a3.City = "Jamaica";
            a3.State = "NY";

            string fileName6 = "address.xml";
            FileStream reader6 = new FileStream(fileName6, FileMode.Create,
   FileAccess.Write);

            DataContractSerializer ser3;
            ser3 = new DataContractSerializer(typeof(Address));

            ser3.WriteObject(reader6, a3);
            reader6.Close();

          



        }
    }
}
