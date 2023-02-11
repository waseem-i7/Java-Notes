package JavaNotes.Oops.Abstraction;

public class InheritanceAmbiguityInCPP {
}

/*
In this example, derived class C inherited the two base classes A and B having
the same function name func(). When the object of class C is created and called
the function func() then the compiler gets confused that which base class member
function func() should be called.
// C++ program to show inheritance ambiguity
#include<iostream>
using namespace std;

// Base class A

class A {
    public:

    void func() {
        cout << " I am in class A" << endl;
    }
};

// Base class B

class B {
    public:
    void func() {
        cout << " I am in class B" << endl;
    }
};

// Derived class C

class C: public A, public B {


        };

// Driver Code

        int main() {

        // Created an object of class C

        C obj;

        // Calling function func()

        obj.func();

        return 0;
        }


        prog.cpp: In function ‘int main()’:
        prog.cpp:43:9: error: request for member ‘func’ is ambiguous
        obj.func();
         ^
       prog.cpp:21:10: note: candidates are: void B::func()
       void func() {
          ^
       prog.cpp:11:10: note:                 void A::func()
       void func() {
          ^
*/


//    Solution to  Ambiguity:
//        To solve this ambiguity scope resolution operator is used denoted by ‘ :: ‘
//
//        Syntax:
//        ObjectName.ClassName::FunctionName();
//        Below is the program to show the concept of ambiguity resolution in multiple inheritances.

// C++ program to resolve inheritance
// ambiguity

/*
#include<iostream>
using namespace std;

// Base class A

class A {
    public:

    void func() {
        cout << " I am in class A" << endl;
    }
};

// Base class B

class B {
    public:

    void func() {
        cout << " I am in class B" << endl;
    }
};

// Derived class C
class C: public A, public B {


        };

// Driver Code

        int main() {

        // Created an object of class C
        C obj;

        // Calling function func() in class A
        obj.A::func();

        // Calling function func() in class B
        obj.B::func();

        return 0;
        }


        output :  I am in class A
                  I am in class B
        */

/*
    Code Snippet:

        We have created an “A” class which consists of the public member function “func”.
        We have created a “B” class which also consists of the public member function “func”.
        We have created a “C” class that is inheriting “A” and “B” classes.
        Object “obj” is created of the derived class “C”.
        The function “func” is called by the object “obj”.
        The important thing to note here is that when the function “func” is called by the object
        “obj” first time it will invoke the function “func” of the “A” class and when the function
        “func” is called by the object “obj” second time it will invoke the function “func” of the “B” class
        because we had specified it using scope resolution operator “::” to get rid of ambiguity.
*/
