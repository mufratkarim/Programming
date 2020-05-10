print("This is the MKA Bank.\n\
You can create your Checking/Savings Account in here.\n\
You can deposit, withdraw and check your statements**Ex.Checking('Name', Amount)\n\
After checking functionalities, don't forget to close the account!")

class Account:
    def __init__(self, name, balance, min_balance):
        self.name = name
        self.balance = balance
        self.min_balance = min_balance

    def deposit(self, amount):
        self.balance += amount
        print("Total Balance after deposit: ${}".format(self.balance))

    def withdraw(self, amount):
        if self.balance - amount >= self.min_balance:
            self.balance -= amount
            print("Total Balance after withdrawal: ${}".format(self.balance))
        else:
            print("Sorry not enough funds")

    def statement(self):
        print("Account Balance: ${}".format(self.balance))

    def __del__(self):
        print("Account Closed!")


class Checking(Account):
    def __init__(self, name, balance): ## Options that user inputs
        super().__init__(name, balance, min_balance = 25)

    def __str__(self):
        return "{}'s Checking Account Balance : ${}.\nMinium Account Balance : {}".format(self.name, self.balance, self.min_balance)

class Savings(Account):
    def __init__(self, name, balance): ## Options that user inputs
        super().__init__(name, balance, min_balance = 0)

    def __str__(self):
        return "{}'s Savings Account Balance : ${}.\nMinium Account Balance : {}".format(self.name, self.balance, self.min_balance)         
