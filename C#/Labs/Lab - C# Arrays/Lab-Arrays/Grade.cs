using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_Arrays
{

    public class Grade : IComparable<Grade>
    {
        /*   
        •	Member variables.There should be score (double) and description (string) member variables.Use auto-implemented properties for the member variables.
        •	This class should implement the IComparable<Grade> interface. Use the score member to do the comparison.
        •	ToString.Add a ToString method that returns a string containing the grade and description.*/

        public double Score { get; set; }
        public string Desp { get; set; }

        public int CompareTo(Grade other)
        {
            if (Score < other.Score) return -1;
            else if (Score > other.Score) return 1;
            return 0;
        }

        public Grade(int s, string d)
        {
            Score = s;
            Desp = d;
        }

        public override string ToString()
        {
            return Score.ToString();
        }
    }
}
