class Vector:
    def __init__(self, amps) -> None:
        self.amps = amps
        # IMPORTANT - Python ke liye list is its primitive so primitive = primitive karne par value copy ho gai list ki.

    def __add__(vec1, vec2):
        if len(vec1) != len(vec2):
            print("Not Possible")
            return []
        add_res = []
        for i in range(len(vec1.amps)):
            add_res.append(vec1.amps[i]+vec2.amps[i])
        return add_res

    def __mul__(vec1, vec2):
        if len(vec1) != len(vec2):
            print("Not Possible")
            return -1
        mul_res = 0
        for i in range(len(vec1.amps)):
            mul_res += vec1.amps[i]*vec2.amps[i]
        return mul_res

    def __len__(self):
        return len(self.amps)

vec1 = Vector([1, 2, 3])
vec2 = Vector([3, 2, 1])
print(vec1+vec2)
print(vec1*vec2)


# revise - List aur Strings ko concatenate karne ke liye mai + operator ka use karta hu.