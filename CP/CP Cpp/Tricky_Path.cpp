#include <iostream>
#include <vector>
#define ll long long int
using namespace std;

vector<int> v[50000]; // mere graph ki adjacency list
vector<bool> vis(50000, 0);

void dfs(int index){
    vis[index] = 1; // current node ko visited mark kardiya. 
    for(auto &i:v[index]){
        if(vis[i]==0){
            dfs(i);
        }
    }
}

int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
        cin >> a[i];
    int start;
    cin >> start;

    // Constructing Adjacency List
    for (int i = 0; i < n; i++)
    {
        if (a[i] != 0)
        { // 0 value ke corresponding jo list ayegi wo empty hogi
            if (0 <= (i - a[i]) && (i - a[i]) < n)
            {
                v[i].push_back(i - a[i]);
            }
            if (0 <= (i + a[i]) && (i + a[i]) < n)
            {
                v[i].push_back(i + a[i]);
            }
        }
    }
    dfs(start);
    string ans = "false";
    for(int j=0;j<n;j++){
        if(a[j]==0 && vis[j]==1){
            ans = "true";
            break;
        }
    }
    cout << ans;
}