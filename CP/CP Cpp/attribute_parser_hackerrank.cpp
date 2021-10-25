#include <iostream>
#include <string>
#include <map>
#include <vector>
using namespace std;

// ********* Power of HASH-MAP is shown in this ques *************

map<string, string> hashed_attr;
void attrHasher(int &n, string pretag)
{
    if (n == 0)
    {
        return;
    }

    string line, tag, attr, value;
    getline(cin, line);

    int i = 1;
    if (line[i] == '/') // closing tag found
    {
        while (line[i] != '>')
        {
            i++;
        }
        if (pretag.size() > (i - 2))
        // yani pretag me se closing tag ko delete karke next iter ke liye tag me dalna padega.
        {
            tag = pretag.substr(0, pretag.size() - i + 1);
        }
        else
        {
            tag = "";
        }
    }
    else // opening tag found
    {
        while (line[i] != ' ' && line[i] != '>')
        {
            i++;
        }
        tag = line.substr(1, i - 1); // tag has been extracted
        if (pretag != "")
        {
            tag = pretag + "." + tag; // tag me pretag ko appropriately dal diya
        }
        int j;
        while (line[i] != '>') // attribute, value uthao jab tak opening tag khatam na hojae
        {
            j = ++i;
            while (line[i] != ' ')
            {
                i++;
            }
            attr = line.substr(j, i - j); // attribute leliya
            while (line[i] != '\"')
            {
                i++;
            }
            j = ++i;
            while (line[i] != '\"')
            {
                i++;
            }
            value = line.substr(j, i - j);         // value leli
            i += 1;                                // next attribute, value ke liye set kar diya
            hashed_attr[tag + "~" + attr] = value; // ek attribute, value pair hashmap me dal diya.
        }
    }
    attrHasher(--n, tag); // next line ke liye recursive call, recursion will end when n equals 0.
}
int main()
{
    int n, q;
    cin >> n >> q;
    cin.ignore(); // jo input buffer me unnecessary '\n' pada he usse hatado.
    attrHasher(n, "");

    string query, value = "";
    while (q--)
    {
        getline(cin, query);
        value = hashed_attr[query];
        if (value == "")
        {
            value = "Not Found!";
        }
        cout << value << endl;
    }
    return 0;
}