#include <iostream>
#include <vector>
using namespace std;
template <class T>
void display(vector<T> &v)
{
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << " ";
    }
    cout << endl;
}
int main()
{
    vector<int> v;
    int temp;
    while(true)
    {
        cin >> temp;
        v.push_back(temp);
        if(cin.peek()=='\n'){
            break;
        }
    }
    display(v);

    return 0;
}