#include <iostream>
#include <fstream>

/* 
    Useful classes in fstream that we use for dealing with files -
    1. fstreambase
    2. ifstream - i stands for input
    3. ofstream - o stands for output
    
    both ifstream and ofstream are derived from fstreambase 
*/

using namespace std;

int main()
{
    string str1;
    // OPENING a file and READING from it -
    ifstream in("input.txt"); // classname objectname(path_to_file)
    // in >> str1; --> Isme problem ye ho rahi he ki jab apn ifstream class ke obj se read karne ki koshish karte he to wo newline('\n') ya space(' ') ko dekhkar read karna band kar deta he.
    // Note - Same behaviour in reading strings is shown by cin (goto general.cpp).

    // So, we use getline() function -
    getline(in,str1);
    // getline() function sirf 1 line ko ek baar me read karta he, meaning it stops reading once it encounters a newline character('\n') or enter key. successive getline() calls se mai successive lines read kar sakta hu.

    // MULTIPLE LINES from a file read karni he to while(in.eof() == 0){getline();} karke kar sakte ho, matlab jab tak file ka eof 1/true ni ho jata tab tak getline karte raho.


    // OPENING a file and WRITING in it -
    // Do note that once you open the file using object of the ofstream class its previous content would be deleted. 
    ofstream out("output.txt"); // classname objectname(path_to_file)
    out << str1;
    out << "\n\n\t\tJust checking for append.";
    // ofstream class ka object string ko file me write kardega. \n,\t etc process hoke write honge. IMP - Successive out<< would append on the file.

    // File OPEN karne ke liye aisa bhi kar sakte he -
    // ofstream out;
    // out.open("output.txt");
    // Same for opening a file using ifstream.

    // Kyoki mera read/write complete hogaya he to maine dono objs out, in ko destroy kardiya aur memory free kardi.
    out.close();
    in.close();
    return 0;
}