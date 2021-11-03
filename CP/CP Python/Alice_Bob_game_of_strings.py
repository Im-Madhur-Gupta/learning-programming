class Node:
        nxt = None
        is_end = False
        def __init__(self) -> None:
            self.nxt = [None]*26
class Trie:
    root = None
    def __init__(self) -> None:
        self.root = Node()
        
    def insert(self,s):
        curr = self.root
        for i in range(len(s)):
            if curr.nxt[ord(s[i])-ord('a')]==None:
                curr.nxt[ord(s[i])-ord('a')]=Node()
            curr = curr.nxt[ord(s[i])-ord('a')]
            curr.is_end = False
        curr.is_end = True
    
    def rec(self,curr):
        tot_Node = 0
        win = 0
        for i in range(26):
            if curr.nxt[i] != None:
                if(self.rec(curr.nxt[i])==True):
                    win+=1
                # else:
                #     win+=0
                tot_Node += 1
        if tot_Node == win:
            return False
        else:
            return True
    
    def get(self):
        curr = self.root
        return self.rec(curr)
    
for _ in range(int(input())):
    n = int(input())
    s = []
    for __ in range(n):
        s.append(input())
    trie = Trie()
    for i in range(n):
        temp = list(s[i])
        temp.reverse()
        s[i] = ""
        for c in temp:
            s[i] += c
        trie.insert(s[i])
    if trie.get():
        print("Alice")
    else:
        print("Bob")