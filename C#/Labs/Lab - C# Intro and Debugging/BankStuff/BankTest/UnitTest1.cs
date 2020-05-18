using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using BankStuff;

namespace BankTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void Withdraw_WithValidAmount_UpdatesBalance()
        {
            // Arrange
            double beginningBalance = 100.00;
            double withdrawAmount = 40.00;
            double expected = 60;

            BankAccount account = new BankAccount();
            account.Balance = beginningBalance;

            // Act
            account.WithDraw(withdrawAmount);

            // Assert
            double actual = account.Balance;
            Assert.AreEqual(expected, actual, 0.001, "Account not withdrawn correctly");
        }
    }
}
