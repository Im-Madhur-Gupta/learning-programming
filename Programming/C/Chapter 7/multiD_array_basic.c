#include<stdio.h>
int main()
{
    int n_students = 3;
    int n_subjects = 4;

    int marks[3][4];

// ye maine ek 2-D array banaya he with total 12 elements / ordered pairs ( , ) type ke
// 2-D array is capable of folding 2 coordiantes only like (student,marks) 
// ex. int M[3][2] = {{2,4},{3,5},{5,7}};
// above could be written as int M[3][2] = 2,4,3,5,5,7; --> bad practice but will work
// each value can be accessed as M[0][0] = 2 , M[2][1] = 7
// remember indexing will start from 0
    
// so a 3-D array is like -
// 3-D array can store 3 coordinates like (student,subject,place of study)
// int marks[2][3][4] = {{{1,2,3,4},{5,6,7,3},{3,4,7,2}},{{2,4,1,5},{2,3,5,6},{22,4,1,3}}}
// 2 students come to study, they have 3 subjects, mode is online / offline
// int marks[2][3][2] = {   { { , } , { , } , { , } }   ,   { { , } , { , } , { , } }   };

// nth dim array will have n square brackets
// 2 dim me 2 square brackets
// 3 dim me 3 square brackets

    return 0;
}