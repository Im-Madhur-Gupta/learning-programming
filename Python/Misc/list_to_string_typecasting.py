sample_list=["I","m"," ","Batman","."]
# I want ot convert it to "Im Batman."

# easiest way is iterating and subsiquent concatenation -
sample_list.reverse()
converted = ""
for i in sample_list:
    converted = converted + i

print(converted)

# whereas typecasting of a string to a list is simple list_name = list(string_name)