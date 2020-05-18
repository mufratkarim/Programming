using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_Events
{
    /*
     * Part 5 – Create a Customer class
    Secretary class member variables:
    •	Name:string (auto-implemented property, see below)

    Customer methods
    •	void ProcessSaleEvent(Object sender, SaleEventArgs evtArgs). Should just print out the following:
    o	The string “Processed sale event”.
    o	The name of the customer that handled the event.
    o	The sale description (from the evtArgs parameter).
    •	void ProcessShipmentArrivedEvent(Object sender, ShipmentArrviedEventArgs evtArgs). Should just print out the following:
    o	The string “Processed shipment arrived event”.
    o	The name of the customer that handled the event.
    o	The shipment arrived description (from the evtArgs parameter).

     * 
     */
    public class Customer
    {
        public string Name { get; set; }

        public void ProcessShipmentArrivedEvent(Object sender, Company.ShipmentArrivedEventArgs evtArgs)
        {

            Console.WriteLine("Processed shipment arrived event");
            Console.WriteLine("Customer Name: " + Name);
            Console.WriteLine(evtArgs.ShipmentArrivedDescription);
        }

}
}
