#include "iostream"
#include "vector"
using namespace std;
class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            for(int j=100;;j*=100){
                if(nums[i]/j==0 && nums[i]/(j/10)!=0){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
};
int main(){
    Solution obj = new Solution();
    vector<int> v=[12,345,2,6,7896];
    cout << obj.findNumbers(v);
    return 0;
}