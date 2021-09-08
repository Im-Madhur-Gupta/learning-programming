import os
for i in range(1,7):
    os.system(f"python \"bat ques.py\" < input0{i}.txt > output0{i}.txt")
