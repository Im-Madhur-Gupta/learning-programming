def sumOfEven(arr):
    sum = 0
    for i in range(len(arr)):
        if i%2==0:
            sum += arr[i]
    return sum

arr = [1,2,3,4]
print(sumOfEven(arr))

# Abviously, jaha function use karna he uske upar kahi apko function define karna padega. (POP type me)