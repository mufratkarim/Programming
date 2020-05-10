//Mufrat Karim Aritra	
//Assignment 3 (Class Creation)

#include <iostream>
#include <string>
using namespace std;

class Pizza {
private:
	string m_toppings;
	int m_size;
public:

	// constructors 
	Pizza() {
		m_toppings = "cheese";
		m_size = 0;
	}
	Pizza(string l_toppings, int l_size) {
		m_toppings = l_toppings;
		m_size = l_size;
	}

	//Setters
	void setToppings(string l_toppings) {
		m_toppings = l_toppings;
	}
	void setSize(int l_size) {
		m_size = l_size;
	}

	//Getters
	string getToppings() { return m_toppings; }
	int getSize() { return m_size; }

	//additionalToppingFunction
	void addToppings(string &additionalTopping) {
		m_toppings = m_toppings + " and " + additionalTopping;
	}
};

//Order (Extra Credit)  
void order(Pizza pizza) {
	cout << "The Pizza that You Ordered: " << pizza.getSize() << " inches, " << pizza.getToppings();
}

int main()
{
	string toppings = "cheese";
	string more, orderInfo;
	int size = 0;
	cout << "Would you like to make an order: ";
	cin >> orderInfo;
	while ((orderInfo == "Yes") || (orderInfo == "yes")) {
		Pizza CreatePizza(toppings, size);
		cout << "Default Topping: Cheese.\n\nAdditional Topping: ";
		cin >> toppings;
		CreatePizza.addToppings(toppings);
		cout << "Enter the size: ";
		cin >> size;
		CreatePizza.setSize(size);
		cout << "Would you like to add any more toppings?(Yes/No): ";
		cin >> more;
		while ((more == "Yes") || (more == "yes")) {
			cout << "Enter the name of the toppings: ";
			cin >> toppings;
			CreatePizza.addToppings(toppings);
			cout << "Would you like to add more toppings?(Yes/No): ";
			cin >> more;
		}
		if ((more != "Yes") || (more != "yes")) {
			order(CreatePizza);
		}
		cout << "\n\n\nWould you like to make another order?(Yes/No): ";
		cin >> orderInfo;
	}
}
