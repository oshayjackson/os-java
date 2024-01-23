# dsa-java-review

The goal of this 1-day lab is to review and exercise basic yet  
essential Java concepts and features for the DS&A students. 

-  [Lab step 1 - Java class and objects and Testing](#lab-step-1---java-class-and-objects-and-testing-45-minutes)
-  [Lab Step 2 - Composition and Inheritance](#lab-step-2---composition-and-inheritance-30-minutes)
-  [Lab Step 3 - Overloading and Polymorphism](#lab-step-3---overloading-and-polymorphism-30-minutes)
-  [Lab Step 4 - Abstract class](#lab-step-4---abstract-class-20-minutes)
-  [Lab Step 5 - Interface](#lab-step-5---interface-45-minutes)
-  [Lab Step 6 - Default method](#lab-step-6---default-method-20-minutes)
-  [Lab Step 7 - Exception handling](#lab-step-7---exception-handling-20-minutes)
-  [Lab Step 8 - Custom exception](#lab-step-8---custom-exception-20-minutes)
-  [Lab Step 9 - Collection classes](#lab-step-9---collection-classes-20-minutes)
-  [Lab Step 10 - Singleton](#lab-step-10---singleton-20-minutes)
-  [Lab Step 11 - Constant class](#lab-step-11---constant-class-20-minutes)
-  [Lab Step 12 - Simple JSON](#lab-step-12---simple-json-30-minutes)
-  [Lab Step 13 - Composition, Enum](#lab-step-13---composition-enum-30-minutes)
-  [Lab Step 14 (Optional) - DAO (Data Access Object) layer](#lab-step-14-optional---dao-data-access-object-layer)
-  [Lab Step 15 (Optional) - Unit testing with Mockito](#lab-step-15-optional---unit-testing-with-mockito)


## Essential Java concepts covered 

- **Java classes and Java objects**
- **Encapsulation**
- **Composition and Inheritance**
- **Polymorphism**
- **Java abstraction class**
- **Java interfaces**
- **Collection classes**
- **Unit Testing**
- **Enum**
- Singleton
- Constants class
- JSON utility (Simple JSON)

## Java Knowledge questions

- When do you want to use Java interface? 
- What is encapsulation? What is abstraction? 
- What is Polymorphism? What are the examples of polymorphism? 
- What is difference between "protected" vs "package private or default" access modifier? 
- What is "Single responsibility principle of SOLID"? Why should we use it? 
- What is "Open for extension Closed for modification of SOLID" design principle? 
- What is dependency injection and why it is such an important software design concept? 
- What are the major differences between Set vs List? 
- When is a static method? Why do you want to create a method as a static method? 
- Is it a good idea to create a static method which maintains a state? 
- What is Lambda expression (or Lambda in short)? Where do you want use it? 
- What is a functional interface in Java (in the context of Lambda)? 
- What is Generics and why you want to use it in your code? 
- What is the difference between Java Collection vs Java Streams? 
  (We are NOT talking about Java I/O Stream.) 
- What is Optional class for in Java? 
- What is a design pattern? What is "Strategy" pattern? 
- What is dependency management in your project? 

## Solution code

The solution code (up to lab step #9) is available from [here](https://github.com/sashinpivotal/dsa-java-review-code)

## Lab step 1 - Java class and objects and Testing (45 minutes)

### Concepts that are exercised 

- Classes, References, and Instantiation (slides #44-#48 of Java Part1 presentation)
- Data and Methods in a class (slides #49-#56 of Java Part1 presentation)
- Unit Testing (slides #180-#203 of Java Part2 presentation)
- Git/GitHub

### High-level steps to take

- Create a new Java Maven project
- Create *Employee* class with some fields and methods
- Write client code that creates and accesses objects of *Employee* class
- Write test code testing *Employee* class
- Check in the code to GitHub repo

### Concrete steps to take

- Create Maven project
  - Take a look at *pom.xml* file
  - Exercise some Maven commands
  
- Create *com.hr.personnel* package
- Create *Employee* class under the *com.hr.personnel* 
  package with the following fields
  - *String name*
  - *LocalDate hireDate*
- Add the following methods to the *Employee* class with proper
  access modifiers
  - *String getEmployeeInfo()* method which returns *String* 
    type of something like "name = Mike, hireDate = 2020-02-03"
  - *String work()* method that just returns *String*
    type of something like "Mike worked"

- Create *com.hr.personnel.client* sub-package
- Write *HRClient* class under *com.hr.personnel.client* sub-package 
  - Create "main(..)" method
  - Create two *com.hr.personnel.Employee** objects 
    and call *getEmployeeInfo* method of those objects
  - For creating "LocalDate" object, you can use "LocalDate.of(YYYY, MM, DD)"
  - Display the result in the console
  
- Add JUnit 4 dependency to the *pom.xml* as as shown below:
  Make sure to refresh Maven (click the Maven refresh icon
  in the top-right corner of the editor window of IntelliJ)
  so that IntelliJ download and install the *junit* dependency
  into local Maven repository.

```xml
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

</project>
```

- If you want to use JUnit 5 (instead of JUnit 4), add the following
  dependency

```xml
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.9.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

</project>
```  

- Write Unit testing code of *com.hr.personnel.Employee* class
  - Verify that *getEmployeeInfo* and *work* methods work as expected

- If you want use AssertJ assertions (instead of JUnit assertions),
  add the following dependency

```xml
<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.23.0</version>
    <scope>test</scope>
</dependency>
```

- Check in your code to the Github repo
  - Step 1: Under the local project directory
    - "git init"
    - create **.gitignore** file under the root project directory
      with the following contents:

      ```
      target/

      ### IntelliJ IDEA ###
      .idea
      *.iws
      *.iml
      *.ipr

      ### VS Code ###
      .vscode/
      ```

    - "git add ."
    - "git commit -m "initial commit"
  - Step 2: In your GitHub webpage
    - Create a new repository called "java-review-project" with
      default values of all the other options
      - DO NOT select "Add a README file"
      - DO NOT add **.gitignore** file
    - Once you create a repository, copy the  
     \<your-github-repo\> (using HTTPS)
      - It should look like something like **https://github.com/sashinpivotal/java-review-project.git**
  - Step 3: Under the local project directory again
    (These are the same steps mentioned in the repository page under 
    **…or push an existing repository from the command line** 
    section)
    - "git remote add origin \<your-github-repo\>"
    - "git branch -M main" (if your main branch is not "main")
    - "git push -u origin main"
  - Step 4: In your GitHub webpage
    - Verify your code is now in your remote GitHub project

### Optional exercise (do this only if you have extra time)

- Add another method below to the *Employee* class

```java
// If current year is 2022 and the year of hireDate is
// 2020, it returns 2
public int computeNumberOfYearsWorkedSinceHired() {
    // add code here 
}
```

- Write test code of the above method

### Quiz

- What are the differences among the following access modifiers?
  - private 
  - default (package-private) 
  - protected 
  - public 
- Why do you want to make your fields private?
- What is *@Before* annotation (in JUnit 4) for in your testing code?
  
## Lab Step 2 - Composition and Inheritance (30 minutes)

### Concepts that are exercised

- Composition 
- Inheritance
- Java array 

### High-level steps to take

- Write sub-classes of *Employee* class: *SalariedEmployee* and *HourlyEmployee* 
- Write *Department* class that contains an array of *Employee* objects

### Concrete steps to take

- Create *SalariedEmployee* and *HourlyEmployee* classes 
  under *com.hr.personnel* package
  extending *com.hr.personnel.Employee* class

  - Add the following fields and appropriate accessor 
    methods to the *SalariedEmployee* class
    - double monthlySalary;
  
  - Add the following fields and appropriate accessor 
    methods to the *HourlyEmployee* class
    - int hoursWorkedPerMonth;
    - double hourlyRate;

- Refactor *HRClient* class
  - Remove code that create *Employee* objects
  - Create two *SalariedEmployee*
    objects and one *HourlyEmployee* object 
  
- Create *Department* class under the *com.hr.personnel*
  package with the following fields:
  - String name
  - String location
  - com.hr.personnel.Employee[] employees // array with size of 100 
  - int currentIndex // - set to 0 for now - represents
                     // - represents a number of valid Employee objects
                     //   in the array
  
- Add and implement the following methods to the *Department* class
  - void addEmployee(Employee employee)
  - int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked()
    - This method should return number of *Employee* objects
      in the *employees* array whose *work()* method returns "\<name\> worked"
      response

- Refactor *HRClient* class to use *Department* class
  - Add employee objects to the *Department* object
  - Invoke *letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked()*
    method of the *Department* object

- Write test code for the *Department* class
  - Test *addEmployee* method
  - Test *letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked* method

### Quiz

- Can a sub-class access private fields or methods of a parent class?
- Is the following code going to work?
  If no, can compiler detect the problem? (In other words,
  Is this compile time exception or runtime exception?)
- Note that *getMonthlySalary()* method is defined in the 
  *SalaryEmployee* class not in the *Employee* class

```java
Employee employee = new SalariedEmployee(..);
String name = employee.getName();
double salary = employee.getMonthlySalary(); 
```

## Lab Step 3 - Overloading and Polymorphism (30 minutes)

### Concepts that are exercised

- Overriding methods and Polymorphism 

### High-level steps to take

- Add different behavior to sub-classes, in other words, 
  the sub-classes override methods of a parent class 
- Observe polymorphic behavior of Java
  
### Concrete steps to take

- Add the following method to the *Employee* class with 
  proper access modifier 

```java
    public double computeMonthlyCompensation() {
        return 0.0;
    }
```

- Implement *computeMonthlyCompensation()* method 
  in the *SalariedEmployee* class using *monthlySalary* field
  - The *computeMonthlyCompensation()* method just
    returns the value of the *monthlySalary* field

- Implement *computeMonthlyCompensation()* method 
  in the *HourlyEmployee* class using *hourlyRate* 
  and *hoursWorkedPerMonth* fields
  - The *computeMonthlyCompensation()* method return
    the value of "hourlyRate * hoursWorkedPerMonth"

- Add and implement the following method to the *Department* class

```java
    // Compute total monthly compensation of all 
    // employees in that department
    public double computeDepartmentMonthlyTotalCompensation() {
        // add code here
        return 0.0;
    }
```
  
- Add code in the *HRClient* class to display the result of
  calling *computeDepartmentMonthlyTotalCompensation()* method
  - Refactor *HRClient* class to create *SalariedEmployee* 
    and *HourlyEmployee* objects with *monthlySalary* 
    and *hourlyRate*/*hoursWorkedPerMonth* as constructor 
    arguments respectively (if it is not done already)
  - Or you can use setter methods to set the values of these fields

- Write testing code testing
  *computeMonthlyCompensation()* method for both *SalariedEmployee*
  and *HourlyEmployee* classes 

- Write testing code testing
  *computeDepartmentMonthlyTotalCompensation()* method of
  the *Department* class

### Optional exercise (do this only if you have extra time)

- Add *CommissionedEmployee* sub-class with the following fields
  - private double commissionRate
  - private ArrayList\<Double\> monthlySales
  
- Implement *computeMonthlyCompensation()* method for the
  *CommissionedEmployee* as following:
  - The monthly compensation for the *CommissionedEmployee*
    is total of "commissionRate * \<each-sale-amount\>"
  
- Write testing code for *CommissionedEmployee* class
  testing *computeMonthlyCompensation()* method

### Quiz

- Is it mandatory to use *@Override* annotation onto 
  an "overriding method"?
- If not, why is the usage of it still recommended?
- What is the difference between "overriding" vs.
  "overloading" in Java code?

## Lab Step 4 - Abstract class (20 minutes)

### Concepts that are exercised

- Abstract class 

### High-level steps to take

- Convert *Employee* class into an abstract class 
- Let subclasses override the abstract methods

### Concrete steps to take

- Convert *Employee* class into an abstract class
  - Convert *computeMonthlyCompensation()* into an abstract method
  
- Refactor other code accordingly
  - You don't need *EmployeeTest* anymore

- Convert *getEmployeeInfo()* of the *Employee* class
  into an abstract method as well
  -  *getEmployeeInfo()* method of the *HourlyEmployee* 
     class should
     return *hoursWorkedPerMonth* and *hourlyRate* along with
     *name* and *hireDate*
  -  *getEmployeeInfo()* method of the *SalariedEmployee* class
     should return *monthlySalary* along with
     *name* and *hireDate*

- Write test methods of *getEmployeeInfo()* method in both
  *SalariedEmployee* and *HourlyEmployee" classes

### Quiz

- All abstract methods of an abstract class need to be 
  implemented in a class that extends that abstract class:
  true or false?

## Lab Step 5 - Interface (45 minutes)

### Concepts that are exercised

- Interface Basics 

### High-level steps to take

- Create a Java interface called *TaxPayer*
- Refactor/Write implementation classes that implement *TaxPayer* interface
  
### Concrete steps to take

- Create *gov.irs* package
- Create *TaxPayer* interface under *gov.irs* package with 
  the following methods
  - double computeMonthlyTaxToPay(); 
  
- Add the following constants to the interface - these are tax rates

```java
public static final double HOURLY_TAX_RATE = 0.25;
public static final double SALARIED_TAX_RATE = 0.30;
```

- Make *com.hr.personnel.Employee* abstract class to 
  implement *TaxPayer* interface
- Refactor *SalariedEmployee* and *HourlyEmployee* classes accordingly
  - Add "monthly-tax computing" logic to the *computeMonthlyTaxToPay()*   
    method using tax rates defined above 
- Add testing code in the *SalariedEmployeeTest* and *HourlyEmployeeTest* 
  classes accordingly

- Create *com.hr.corp* package
- Create *Corporation* class under *com.hr.corp* package with 
  the following fields
  - String name;
  - double monthlyIncome;
- Add the following to the *TaxPayer* interface
  - public static final double CORP_TAX_RATE = 0.10;
- Make *Corporation* class implement *TaxPayer* interface
  - Corp tax can be computed as *monthlyIncome * CORP_TAX_RATE*
- Write *CorporationTest* class testing *computeMonthlyTaxToPay()*

- Create *IRS* class under *gov.irs* package with the following fields 
  - private TaxPayer[] taxPayers = new TaxPayer[100];
  - private int currentIndex = 0;  // for dealing with the array
- Add and implement the following methods to the *IRS* class

```java
    public void register(TaxPayer taxPayer) {
       // add code here
    }

    public double computeTotalMonthlyTaxToCollect() {
       // add code here
    }
```
  
- Write *IRSTest* class testing *computeTotalMonthlyTaxToCollect()* method
  - Make sure the IRS object to test has at least 1 SalariedEmployee,
    1 HourlyEmployee, and 1 Corporation as TaxPayer objects

### Optional exercise (do this only if have extra time)

- We would like to add natural ordering to the *Employee* objects
  as following:
  - Compare them based on *hireDate* first
  - If multiple employees have the same *hireDate*, 
    use their *name* next

- Add *Comparable* interface to the *Employee* class
- Refactor code accordingly

### Quiz

- You have to use *abstract* keyword in each of the methods defined in 
  a Java interface, true or false?
- A class can implement multiple Java interfaces, true or false?
- An abstract class cannot implement Java interfaces, true or false?

### Resources on Java Interface

- [Java Interface presentation](https://github.com/sashinpivotal/java-presentations/blob/main/javase_interface.pdf)
  

## Lab Step 6 - Default method (20 minutes)

### Concepts that are exercised

- Default method in a Java interface 

### Concrete steps to take

- Add the following code to the *TaxPayer* interface

```java
public static final double DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION = 250.0;

default double computeStandardEmployeeMonthlyDeduction() {
    return DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION;
}
```

- Refactor *computeMonthlyTaxToPay* method of *HourlyEmployee* 
  and *SalariedEmployee* classes as following
  - Apply *DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION* when
    computing monthly tax to pay  
  - When the monthly tax to pay is less than or equal to 
    the *DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION*, 
    return 0.0
  
- Refactor *HourlyEmployeeTest* and *SalariedEmployeeTest* 
  code accordingly
  - Make sure you test the case in which the monthly tax  
    to pay is less than or equal to the 
    *DEFAULT_STANDARD_EMPLOYEE_MONTHLY_DEDUCTION*
  
- Refactor *IRSTest* testing code accordingly

### Optional exercise

- Add another default method to the *TaxPayer* interface

```java
    default String getCurrentDayAndTime() {
        // return String in the format of "yyyy/MM/dd HH:mm:ss"
    }
```

### Resources

- [Static and Default Methods in Interfaces in Java](https://www.baeldung.com/java-static-default-methods)

### Quizzes

- A Java interface can have only a single default method,
  true or false?
- You cannot override the default methods of an interface
  in the implementation classes, true or false?

## Lab Step 7 - Exception handling (20 minutes)

### Concepts that are exercised

- Exceptions 

### Concrete steps to take
  
- Add the following to the *HourlyEmployee* class

```java
public static final double FEDERAL_MINIMUM_HOURLY_WAGE = 7.0;
```

- Refactor *HourlyEmployee* class so that, when *hourlyRate*
  is set to a value that is smaller than 
  *FEDERAL_MINIMUM_HOURLY_WAGE*, throw an *IllegalArgumentException*

- Add testing code to the *HourlyEmployeeTest* accordingly

### Optional exercise

- When throwing *IllegalArgumentException*, use the following
  message

```java
"Illegal wage: " + hourlyRate + "." +
" Federal minimum wage is " + FEDERAL_MINIMUM_HOURLY_WAGE + "."
```

- Refactor *HourlyEmployeeTest* test to verify that the
  exception is thrown with an expected message

## Lab Step 8 - Custom exception (20 minutes)

In the previous step, you used a Java-provided exception
to handle abnormal situation.  In this step, you
are going to create a custom exception.

### Concepts that are exercised

- Custom exception

### Concrete steps to take

- If monthly salary for *SalariedEmployee* is set with 
  more than 1 million dollars, throw *TooMuchSalaryException* with "too much salary" as an exception message

- Refactor *SalariedEmployeeTest*
  accordingly


### Quizzes

- What is the root class of the Unchecked exception?


## Lab Step 9 - Collection classes (20 minutes)

So far, we used an array for maintaining *Employee*
objects inside *Department* and *TaxPayer* objects inside 
*IRS*. In this step, we are going to use proper
Collection object instead of an array.

### Concepts that are exercised

- Collections

### Concrete steps to take

- Refactor *Department* class to use a proper collection object 
  of *Employee* rather than an array
- Remove *currentIndex* field from the *Department* class

- Refactor *IRS* class to use a proper collection object of
  *TaxPayer* rather than an array
- Remove *currentIndex* field from the *IRS* class

- Refactor any code that need to be refactored accordingly


## Lab Step 10 - Singleton (20 minutes)

In this step, you are going to create a singleton object.

### Concepts that are exercised

- What is a singleton object?
- When do you want to use singleton object?
- What are the possible downside of using singleton object?

### Concrete steps to take

- Refactor *IRS* class as a singleton class as following
  - Make the constructor *private*
  - Create a static field that refers to the singleton object
  - If the singleton object has not been created, create one

```java
    private static IRS instance;

    // Make the constructor private
    private IRS() {
    }

    // If singleton instance has not been created yet,
    // create one.  Otherwise, return the same instance.
    public static IRS getInstance() {
        if (instance == null) {
            instance = new IRS();
        }
        return instance;
    }
```

- Refactor *IRSTest* accordingly

### Resources

- [Singletons in Java](https://www.baeldung.com/java-singleton)

### Quiz

- What happens when multiple threads access/change the
  internal state of a singleton object?

## Lab Step 11 - Constant class (20 minutes)

In this step, you are going to create a class where
all constants are maintained.

### Concepts that are exercised

- Constant classes

### Concrete steps to take

- Create *com.hr.personnel.EmployeeConstants* class
- Move all constants used in the same package to this class
- Create *gov.irs.TaxConstants* class
- Move all constants used in the same package to this class

- Refactor other codes accordingly
- Run all tests and make sure they all succeed

## Lab Step 12 - Simple JSON (30 minutes)

In this step, you are going to use "Simple JSON"
library and read data from external JSON file
into Java objects.

### Concepts that are exercised

- What is JSON?
- Using JSON utility class to read JSON data from a file

### Concrete steps to take

- Add "Simple JSON" dependency specified below to the *pom.xml* 
  (In order to find it yourself, you can just Google search 
   with "maven simple json".)
- Make sure to refresh "Maven" in IntelliJ so that
  IntelliJ downloads the *json-simple* dependency

```xml
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
```

- Create *utilities* package
- Create *SimpleJSONUtility* class under the *utilities* package 
  with the following code

```java
package utilities;

import com.hr.personnel.Employee;
import com.hr.personnel.SalariedEmployee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class SimpleJSONUtility {

    private static JSONArray salariedEmployeesJSONArray;

    public static JSONArray readSalariedEmployeesJSON(String filePath)  {
        JSONParser jsonParser = new JSONParser();

        try (FileReader fileReader = new FileReader(filePath)) {

            Object object = jsonParser.parse(fileReader);
            salariedEmployeesJSONArray = (JSONArray) object;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return salariedEmployeesJSONArray;
    }

    public static Employee parseEmployeeObject(JSONObject salariedEmployeeJSONObject) {
        JSONObject employeeObject = (JSONObject) salariedEmployeeJSONObject.get("employee");
        String name = (String) employeeObject.get("name");
        String hireDate = (String) employeeObject.get("hireDate");
        String salary = (String) employeeObject.get("salary");
        return new SalariedEmployee(name, LocalDate.parse(hireDate), Double.valueOf(salary));
    }

}
```

- Create *salariedEmployees.json* file under the project root
  with the following contents

```json
[
  {
    "employee": {
      "name": "charles",
      "hireDate": "2020-01-03",
      "salary": "20000"
    }
  },
  {
    "employee": {
      "name": "kane",
      "hireDate": "2010-04-03",
      "salary": "10000"
    }
  }
]
```

- Modify *HRClient* to read JSON SalariedEmployee data from
  *salariedEmployees.json* file and then register 
  them to the *Department* object (instead of creating Employee
  objects directly inside the *HRClient*).  You can leverage 
  the following code fragment:

```java
String jsonFilePath = "salariedEmployees.json";

JSONArray salariedEmployeesJSON
        = SimpleJSONUtility.readSalariedEmployeesJSON(jsonFilePath);
        
salariedEmployeesJSON.forEach(employeeJSON -> {
    Employee employee = SimpleJSONUtility.parseEmployeeObject((JSONObject) employeeJSON);
    department.addEmployee(employee);
});
```

## Lab Step 13 - Composition, Enum (30 minutes)

In this step, you are going to add Java Enum class.

### Concepts that are exercised

- Composition
- Enum 

### Concrete steps to take

- Create *CompanyHealth* enum under *com.hr.corp* package
  with the following values
  - HEALTHY
  - OK
  - SICK

- Create *Auditor* class under the same package with the
  *computeMonthlyProfit* method as following

```java
public double computeMonthlyProfit(double monthlyIncome,
                                   double monthlyFixedCost,
                                   double monthlyTaxToPay ) {
    return monthlyIncome - (monthlyFixedCost + monthlyTaxToPay);
}
```

- Create and run *AuditorTest*

- In the *Corporation* class, create a new constructor, through
  which *Auditor* object gets injected
- Implement *performMonthlyAudit* method in the *Corporation* 
  class leveraging code below

```java
public static final double MONTHLY_FIXED_COST = 10000.0;
public static final double MINIMUM_PROFIT_TO_MAKE_TO_BE_HEALTHY = 10000.0;
public static final double MINIMUM_PROFIT_TO_MAKE_TO_BE_OK = 0.0;

public CompanyHealth performMonthlyAudit() {

    double monthlyProfit
            = auditor.computeMonthlyProfit(monthlyIncome, MONTHLY_FIXED_COST, computeMonthlyTaxToPay());

    CompanyHealth companyHealth = CompanyHealth.SICK;

    if (monthlyProfit >= MINIMUM_PROFIT_TO_MAKE_TO_BE_HEALTHY) {
        companyHealth = CompanyHealth.HEALTHY;
    } else if (monthlyProfit >= MINIMUM_PROFIT_TO_MAKE_TO_BE_OK) {
        companyHealth = CompanyHealth.OK;
    }

    return companyHealth;

}
```

- Write *CorporationTest* class testing *performMonthlyAudit* method

## Lab Step 14 (Optional) - DAO (Data Access Object) layer

In this step, you are going to use DAO class through
which data access logic (or persistence logic) gets
separated out from business logic.

### Concepts that are exercised

- Right now, the *Department* class is responsible for the
  following two concerns - violation of Single Responsibility Principle
  - Business logic
  - Managing Employee objects
  
- We want to separate these two concerns by delegating
  the 2nd responsibility to *DepartmentDAO* class
  - We can change how Employee objects get managed later on,
    for example maintaining them in the database, without
    affecting the business logic

### Concrete steps to take

- Create *DepartmentDAO* class under the same package where
  *Department* class is located with the following code 

```java
public class DepartmentDAO {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
```

- Refactor *Department* class
  - In the *Department* class, create a new constructor, 
    through which the *DepartmentDAO* object gets injected
  - Use *DepartmentDAO* object for adding an employee
    or getting all employees

- Refactor and run *DepartmentTest* class accordingly

## Lab Step 15 (Optional) - Unit testing with Mockito

It is very common to see a Java class have dependency
classes - for example, the *Corporation* class 
has *Auditor* class delegating some task - this is
an example of composition.

Now you want to write unit testing code for the
*Corporation* class, you want to test if the
business logic of *Corporation* class works as
expected NOT the behavior of its dependency
classes, in this case the *Auditor* class.

One way to achieve this is to "mock" the behavior
of the dependencies so that if there is a test
failure it should be because a wrong behavior
of the unit-test-target not from the dependency.

### Concepts that are exercised

- Unit testing with Mockito

### Concrete steps to take

- Add Mockito dependency to *pom.xml*
- Make sure to refresh "Maven" in IntelliJ so that
  IntelliJ downloads the *mockito-core* dependency

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>4.5.1</version>
    <scope>test</scope>
</dependency>
```

- Refactor *CorporationTest* as following

```java
package com.hr.corp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.hr.corp.Corporation.MINIMUM_PROFIT_TO_MAKE_TO_BE_HEALTHY;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CorporationTest {

    private Corporation myCorporation;

    @Mock
    private Auditor auditor;

    @Before
    public void setUp() throws Exception {
        myCorporation = new Corporation("myCompany", 1000000.0, auditor);
    }

    @Test
    public void computeMonthlyTaxToPay_computes_monthly_tax_correctly() {

        double monthlyTaxToPay = myCorporation.computeMonthlyTaxToPay();
        assertEquals(100000.0, monthlyTaxToPay, 0.01);
    }

    @Test
    public void performMonthlyAudit_should_return_HEALTHY_when_profit_is_greater_than_threshold() {

        // arrange
        when(auditor.computeMonthlyProfit(anyDouble(), anyDouble(), anyDouble()))
                .thenReturn(MINIMUM_PROFIT_TO_MAKE_TO_BE_HEALTHY);

        // act and assert
        CompanyHealth companyHealth = myCorporation.performMonthlyAudit();
        Assert.assertEquals(CompanyHealth.HEALTHY, companyHealth);

        // verify
        verify(auditor).computeMonthlyProfit(anyDouble(), anyDouble(), anyDouble());
    }
}
```

- Run all tests and verify success


