#include <iostream>
using namespace std;

// Structure - they are programmer defined datatypes which we use to store dissimilar data.
typedef struct emp_creds
{
    int id;
    int age;
    long long int sal;
} emp; // --> ye wala ; lagana na bhoolo.
// typedef basically mujhe is structure ke liye ek allias name de raha he, to mujhe pura struct emp_creds ni likhna padega sirf emp would work.


// Union - Ye bhi ek custom datatype hi he but yaha aisa hota he ki ek baar mai sirf ek field (called "active" field) ko use kiya ja sakta he. For below ex - yato source_1 OR source_2 OR source_3, ek baar mai 3 mese ek.
// Union memory ko efficiently assign karta he, ek variable of a union ke liye max sized datatype jitna memory assign kiya jata he. Yani money union ke ek varaible ko total 8 bytes (long long int) diya jaega ab isme apn yato source_1 dal sakte he yato source_2 yato source_3.  
union money
{
    int source_1;
    long long int source_2;
    float source_3;
};

int main()
{
    // Creating some variables of our structure emp_creds -
    struct emp_creds harry = {1, 25, 2000000};
    struct emp_creds maddy;
    maddy.age = 20;
    maddy.id = 2;
    maddy.sal = 1500000;
    // using allias name of struct emp_creds -
    emp jay = {3, 18, 40000000};


    // Creating variable of a union -
    union money income;
    // income.source_1 = 100;
    // cout<<income.source_1<<endl;
    // cout<<income.source_2<<endl;
    // cout<<income.source_3<<endl<<endl;

    // income.source_2 = 100000;
    // cout<<income.source_1<<endl;
    // cout<<income.source_2<<endl;
    // cout<<income.source_3<<endl<<endl;
 
    // income.source_3 = 100.9;
    // cout<<income.source_1<<endl;
    // cout<<income.source_2<<endl;
    // cout<<income.source_3<<endl<<endl;
    // IMP OBSERVATION - Union me non-active fields me garbage value mill rahi he. (kinda)
    
    
    // Enum - set of constants that are serially ordered from 0, 1, ....
    enum meal{breakfast, lunch, dinner};
    cout<<breakfast<<endl<<lunch<<endl<<dinner<<"\n\n";
    // a special thing regarding enum only present in C++ -
    // enum's name can be used as a datatype storing the index value of corresponding constants.
    meal m1 = breakfast;
    meal m2 = lunch;
    meal m3 = dinner;
    cout<<m1<<endl<<m2<<endl<<m3;

    return 0;
}