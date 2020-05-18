using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_Events
{

    public class Company
    {
        public string Name { get; set; }
        public event EventHandler<ShipmentArrivedEventArgs> ShipmentArrivedEvent;
        public event EventHandler<SaleEventArgs> SaleEvent;

        public void FireShipmentArrived(string sd)
        {
            if (ShipmentArrivedEvent == null)
                return;

            Company.ShipmentArrivedEventArgs evtArgs = new Company.ShipmentArrivedEventArgs(sd);
            ShipmentArrivedEvent(this, evtArgs);

        }

        public void FireSale(string sd)
        {
            if (SaleEvent == null)
                return;

            Company.SaleEventArgs evtArgs = new Company.SaleEventArgs(sd);
            SaleEvent(this, evtArgs);
        }

        public class ShipmentArrivedEventArgs : EventArgs
        {
            public string ShipmentArrivedDescription { get; set; }

            public ShipmentArrivedEventArgs(string sd)
            {
                ShipmentArrivedDescription = sd;
            }
        }

        public class SaleEventArgs : EventArgs
        {
            public string SaleDescription { get; set; }

            public SaleEventArgs(string sd)
            {
                SaleDescription = sd;
            }
        }


    }
}
