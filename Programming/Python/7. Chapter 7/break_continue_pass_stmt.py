# break - instructs the loop to exit right away

# continue - instructs the loop to end the particular iteration which is currently running
#            and jump to the next iteration

for item in range(1,11,2):
    if (item==5):
        break
    print(item)
else:
    print("Loop has exhausted/exited.")

# C language me kuch ni karane ke liye mai {} aisa likh sakta thabut python me bracketing
# ki jagah indentation use hota he so I want a null statement that does NOTHING.

# pass - It's a general purpose NULL statement.
#        it instructs to do NOTHING.
# it can be used in if, loops , function etc.