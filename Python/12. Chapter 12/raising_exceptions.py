# Raising Exceptions - we will simply use the "raise" keyword

def increment(num):
    try:
        return int(num)+1
    except:
        raise ValueError("Wrong value entered.")
    
print(increment("12"))
print(increment("12a"))