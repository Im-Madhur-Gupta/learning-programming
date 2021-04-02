// multiword string lene ka ek aur tareka --> scanf("%[^\n]%*c",e1.name);
    // Here, [] is the scanset character. ^\n tells to take input until newline
    // doesn’t get encountered. Then, with this %*c, it reads newline character
    // and here used * indicates that this newline character is discarded.