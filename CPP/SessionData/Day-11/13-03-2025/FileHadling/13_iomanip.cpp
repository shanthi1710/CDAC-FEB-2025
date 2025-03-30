// setw example
#include <iostream>     // std::cout, std::endl
#include <iomanip>      // std::setw

int main () {
	
  std::cout << std::setw(10);
  std::cout << 99 << std::endl;
  
  std::cout << std::setfill ('x') << std::setw (10);
  std::cout << 99 << std::endl;
  
  double f =3.14159;
  std::cout << std::setprecision(5) << f << '\n';
  std::cout << std::setprecision(9) << f << '\n';
  std::cout << std::fixed;
  std::cout << std::setprecision(5) << f << '\n';
  std::cout << std::setprecision(9) << f << '\n';
  
  std::cout << std::setbase(16); //2 or 8
  std::cout << 110 << std::endl;
  
  long double price;
  std::cout << "Please, enter the price: ";
  std::cin >> std::get_money(price);

  if (std::cin.fail()) std::cout << "Error reading price\n";
  else std::cout << "The price entered is: " << price << '\n';
  
  std::cout << "Price:" << std::put_money(10.50L) << '\n';
  
  
 
  return 0;
}