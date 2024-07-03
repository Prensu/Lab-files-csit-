#include <iostream>
#include <string.h>

using namespace std;

class Employee {
  private:
    int eid;
    string ename;
    double salary;

  public:
    Employee(int id, string name, double sal) {
      eid = id;
      ename = name;
      salary = sal;
    }

    void display() {
      cout << "Employee ID: " << eid << endl;
      cout << "Employee Name: " << ename << endl;
      cout << "Employee Salary: $" << salary << endl;
    }
};

class Company {
  private:
    string name;
    string location;
    Employee employees[10];

  public:
    Company(string cname, string cloc, Employee emp_list[]) {
      name = cname;
      location = cloc;
      for(int i=0; i<10; i++) {
        employees[i] = emp_list[i];
      }
    }

    void display() {
      cout << "Company Name: " << name << endl;
      cout << "Company Location: " << location << endl;
      cout << "Employees:" << endl;
      for(int i=0; i<10; i++) {
        cout << "Employee " << i+1 << ":" << endl;
        employees[i].display();
      }
    }
};

int main() {
  Employee emp_list[10] = {
    Employee(101, "John Doe", 50000),
    Employee(102, "Jane Smith", 60000),
    Employee(103, "Bob Johnson", 55000),
    Employee(104, "Mary Lee", 65000),
    Employee(105, "David Kim", 70000),
    Employee(106, "Lisa Chen", 45000),
    Employee(107, "Tom Jones", 48000),
    Employee(108, "Samantha Brown", 52000),
    Employee(109, "Jake Williams", 58000),
    Employee(110, "Olivia Davis", 62000)
  };

  Company my_company("ABC Corp", "New York", emp_list);
  my_company.display();

  return 0;
}

