using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BankStuff
{
    public class BankAccount
    {
        public double Balance { get; set; }
        public void Deposit(double amount)
        {
            Balance += amount;
        }

        public void WithDraw(double amount)
        {
            if (amount <= Balance)
            {
                Balance -= amount;
            }
        }


    }
}
