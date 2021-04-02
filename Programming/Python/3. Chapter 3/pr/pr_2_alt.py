name = input("Enter your Name : ")
date = input("Enter date in dd/mm/yyyy format : ")
letter = '''Dear <|Name|>,
    you are selected!
    Date : <|Date|>'''
letter = letter.replace("<|Name|>",name)
letter = letter.replace("<|Date|>",date)
print(letter)    