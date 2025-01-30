// Include the System namespace for basic functionality like Console.WriteLine.
using System;

// Include the System.Collections.Generic namespace for generic collections like List<T>.
using System.Collections.Generic;

// Define a namespace to organize the code and avoid naming conflicts.
namespace DerivedDataTypesExample
{
    // Define an enum called Department to represent different departments in a company.
    public enum Department
    {
        HR,       // Human Resources
        IT,       // Information Technology
        Finance,  // Finance Department
        Marketing // Marketing Department
    }

    // Define a struct called Address to represent an employee's address.
    public struct Address
    {
        // Properties for Street, City, and ZipCode.
        public string Street { get; set; }
        public string City { get; set; }
        public string ZipCode { get; set; }

        // Override the ToString() method to display the address in a readable format.
        public override string ToString()
        {
            return $"{Street}, {City}, {ZipCode}";
        }
    }

    // Define a class called Employee to represent an employee.
    public class Employee
    {
        // Properties for Name, Age, Department, and Address.
        public string Name { get; set; }
        public int Age { get; set; }
        public Department Department { get; set; }
        public Address Address { get; set; }

        // Method to display employee details.
        public void DisplayEmployeeDetails()
        {
            Console.WriteLine($"Name: {Name}");
            Console.WriteLine($"Age: {Age}");
            Console.WriteLine($"Department: {Department}");
            Console.WriteLine($"Address: {Address}");
            Console.WriteLine();
        }
    }

    // Define the main Program class.
    class Program
    {
        // Main method, the entry point of the program.
        static void Main(string[] args)
        {
            // Create an array of Employee objects with a fixed size of 3.
            Employee[] employees = new Employee[3];

            // Initialize the first employee in the array.
            employees[0] = new Employee
            {
                Name = "John Doe",
                Age = 30,
                Department = Department.IT,
                Address = new Address { Street = "123 Tech St", City = "San Francisco", ZipCode = "94107" }
            };

            // Initialize the second employee in the array.
            employees[1] = new Employee
            {
                Name = "Jane Smith",
                Age = 25,
                Department = Department.HR,
                Address = new Address { Street = "456 HR Ave", City = "New York", ZipCode = "10001" }
            };

            // Initialize the third employee in the array.
            employees[2] = new Employee
            {
                Name = "Alice Johnson",
                Age = 35,
                Department = Department.Finance,
                Address = new Address { Street = "789 Finance Blvd", City = "Chicago", ZipCode = "60601" }
            };

            // Display details of all employees in the array.
            Console.WriteLine("Employee Details:");
            foreach (var employee in employees)
            {
                employee.DisplayEmployeeDetails();
            }

            // Create a List of Employee objects (a dynamic collection).
            List<Employee> employeeList = new List<Employee>
            {
                // Initialize the first employee in the list.
                new Employee
                {
                    Name = "Bob Brown",
                    Age = 40,
                    Department = Department.Marketing,
                    Address = new Address { Street = "321 Marketing Rd", City = "Los Angeles", ZipCode = "90001" }
                }
            };

            // Add a new employee to the list.
            employeeList.Add(new Employee
            {
                Name = "Charlie Davis",
                Age = 28,
                Department = Department.IT,
                Address = new Address { Street = "654 Dev Lane", City = "Seattle", ZipCode = "98101" }
            });

            // Display details of all employees in the list.
            Console.WriteLine("Employees in List:");
            foreach (var employee in employeeList)
            {
                employee.DisplayEmployeeDetails();
            }
        }
    }
}