l1 = [1, 2, 3, 4]
l2 = [1, 2, 3, 4, 5]

l2 = l1
l2[0] = 7  # or l1[0] = 7
print(l1, l2)

if l1 is l2:
    print(True)

# Python ka memory management is different as compared to C
# AGR MAINE KINHI BHI 2 VARIABLES KO EQUATE KARWA DIYA TO WO AB SAME MEMORY LOCATION KO POINT
# KARENGE, MATLAB KISI BHI EK VARIABLE ME CHANGE KARNE SE DUSRE VARIABLE ME BHI CHANGE AYEGA

a = 1
b = 2
a = b # a aur b ka memory address same ho chuka he
if(a is b):
    print("yes")