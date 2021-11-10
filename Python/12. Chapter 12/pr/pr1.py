def readFile(filename):
    try:
        with open(f"12. Chapter 12/pr/{filename}.txt", "r") as f:
            pass
        except FileNotFoundError:
        print(f"File {filename}.txt doesnt exist.")


readFile(1)
readFile(2)
readFile(3)
