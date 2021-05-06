#include <stdio.h>
int main()
{
FILE *ptr; // 'FILE' ek structure ka name he
// koi bhi file access karne ke liye mai uska pointer banaunga FILE sturcture wala
ptr=fopen("sample.txt","r");
// r for reading (rb for binary reading)
// w for writing (wb for binary writing) (overwrite, yani pehle ke contents hata ke dusra naya dal diya)
// a for append yani file ke end me kuch add kar diya, the are the modes

// binary files ko hum ache se text editors me ni khol sakta / wo display dhang se ni hoti
// ex. jpg,dat

// jabki text files ko ache se text editors me khol sakte he ex. txt,bat,html,.c

// ek bat ye bhi he ki hum kisi bhi file ka extension change karke usko
// dusre extension me hamesha convert ni kar sakte
// matlab ek txt ko bat me asani se convert kiya ja sakta he 
// but jpg ko txt bana doge iska ye matlab ni he ki photo ab text ho gai

return 0;
}