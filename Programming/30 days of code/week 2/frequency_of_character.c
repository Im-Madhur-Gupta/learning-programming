#include <stdio.h>
int main()
{
char string [1000];
printf("Enter a string -\n");
fgets(string,1000,stdin);

int count[52][2];
for(int i=0;i<=25;i++)
{
    count[i][0] = 65+i;
    count[i][1]=0;
}
for(int j=0;j<=25;j++)
{
    count [26+j][0]=97+j;
    count[26+j][1]=0;
}

int k=0;
while(string[k] != '\0')
{
    for(int l=0;l<=51;l++)
    {
        if(string[k] == count[l][0])
        {
            count[l][1]++;
        }
    }
    k++;
}

for(int m=0;m<=51;m++)
{
    if(count[m][1] != 0)
    {
        printf("%c (ASCII - %d) occures %d times.\n",count[m][0],count[m][0],count[m][1]);
    }
}
return 0;
}