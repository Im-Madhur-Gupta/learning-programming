#include <iostream>
#include <string>
using namespace std;
int main()
{
    string s = R"(<tag1 value = "HelloWorld"><tag2 name = "Name1"></tag2></tag1>)";
    int prev_start = s.find("<tag1",0); // find(sub_str,position to start search)
    cout<<prev_start<<endl;
    int prev_end = s.find("</tag1>",prev_start);
    cout<<prev_end;

    return 0;
}