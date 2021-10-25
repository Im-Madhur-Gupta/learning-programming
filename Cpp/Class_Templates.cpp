// Here, Templates are just generic classes in C++. There can be function templates as well.
#include <iostream>
using namespace std;

// Creeating a Class Template -
template <class T1, class T2=int>
// T1, T2 need not be primitive datatypes. They can be classes as well.
// We can also give default type parameter for a template. Remember default parameters should be on the right side.
class vector
{
public:
    T1 *arr;
    T2 size;
    vector(T2 m)
    {
        size = m;
        arr = new T1[size];
    }
    T1 dotPdt(vector &v)
    {
        T1 d = 0;
        for (T2 i = 0; i < size; i++)
        {
            d += this->arr[i] * v.arr[i];

            // Dot and Arrow operator -
            // The . (dot) operator and the -> (arrow) operator are used to reference individual members of classes, structures and unions. The dot operator is applied to the actual object. The arrow operator is used with a pointer to an object.
            // (pointer_name)->(variable_name)  member of pointer - a->b
            // (object_name).(variable_name)  member of object - a.b
            // IMP - "this" is a pointer to the object which has called the method.
        }
        return d;
    }
};

int main()
{
    vector<int, int> intVec1(3);
    intVec1.arr[0] = 1;
    intVec1.arr[1] = 2;
    intVec1.arr[2] = 3;
    vector<int, int> intVec2(3);
    intVec2.arr[0] = 3;
    intVec2.arr[1] = 2;
    intVec2.arr[2] = 1;
    cout << intVec1.dotPdt(intVec2);
    return 0;
}