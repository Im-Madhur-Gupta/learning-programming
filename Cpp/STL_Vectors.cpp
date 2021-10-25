#include <iostream>
#include <vector>
using namespace std;

// a method to display the contents of the vector -
template <class T>
void display(vector<T> &v)
{
    // @ to get the capacity of the vector (Max no. of elements that can be accomodated in the vector) - vector_name.capacity().
    // @ to get the size of the vector (no. of elements in the vector) - vector_name.size().
    for (int i = 0; i < v.size(); i++)
    {
        // @ vector ke elements ko access karne ke liye simple array wala syntax he
        cout << v[i] << " ";
    }
    cout<<endl;
}
int main()
{
    // @ Vector are basically auto-resizable / dynamic arrays.

    // @ Creating a Vector -
    vector<int> vec1; // size=0, capacity=0 vector
    
    vector<char> vec2(5); // size=5 (but all the elements are blank), capacity=5 vector
    
    vector<char> vec3(vec2);
    // size=5 (but all the elements are blank), capacity=5 vector made from vec2
    
    vector<char> vec4(6,'M'); // size=6, capacity=6 vector with all elements as 'M'.
    display(vec4);
    cout<<vec4.size()<<" "<<vec4.capacity();

    vector<long long int> vec_ {1,2,3,4,5,6,7,8,9,0};

    for (int i = 0; i < 4; i++)
    {
        // @ Vector me elements append/last me add karne ke liye push_back() method use karte he.
        vec1.push_back(i+1);
    }
    display(vec1);
    
    // @ last element of vector (piche wala element) ko nikalne ke liye - pop_back(), note it doesn't return the removed element. 
    vec1.pop_back();
    display(vec1);


    // @ Creating an iterator of our vector -
    // Ye ek aisa iterator bana dega jo HAMESHA 1st element of the vector ko point karega.
    vector<int> :: iterator iter = vec1.begin();

    // @ Returns an iterator pointing to the theoretical element that follows the last element in the vector
    vector<int> :: iterator iter_end = vec1.end();

    // @ Inserting an element in vector at some specific position other than the last position -
    // using insert(iterator, value)
    // @ Iterator jis bhi element ko point kar raha hoga uske ek PEHLE insert kar diya jaega.
    vec1.insert(iter,7);
    display(vec1);
    // @ Also, if we want to insert multiple values behind an element, then we can add a 3rd (2nd in seq.) argument to insert().
    vec1.insert(iter,5,2); // ye 1st element ke piche 5 2s daldega.
    display(vec1);
    // @ As iterator is an object that points to an element (say mth element), so (iter+1) will point to (m+1)th element (using pointer arithmetic).
    // @ IMP - Agr insert() karne ke liye resizing karni pad jae to insert() karne ke baad mujhe iterator re-initialize karna padega.
    iter = vec1.begin();
    vec1.insert(iter+7,9);
    display(vec1);


    // @ Erasing/Deleting an element from vector using erase() method -
    // Note - This method invalidates iterators and references AT or AFTER the point of the erase, including the end() iterator.
    vector<int> vec5(4,1);
    vector<int> :: iterator it = vec5.begin();
    vec5.erase(it); // ek element delete karne ke liye
    
    it = vec5.begin();
    vec5.erase(it, it+2); // [first, last) element delete karne ke liye
    display(vec5);


    // @ swap() -
    // Exchanges the contents of the container with those of other. Does not invoke any move, copy, or swap operations on individual elements. All iterators and references remain valid.
    vector<int> vec6(4,10);
    vector<int> vec7(4,1);
    vec6.swap(vec7);
    display(vec6);
    display(vec7);

    // 1st element aur last element of vector ko access karne ke liye -
    // cout<<vec_[0]<<" "<<vec_[vec_.size()-1]<<endl;
    cout<<vec_.front()<<" "<<vec_.back();


    // Sorting elements of vector - 
    // sort(vector_name.begin(),vector_name.end());
    return 0;
}