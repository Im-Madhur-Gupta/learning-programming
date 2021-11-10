def greet(name):
    print("Hello,",name)

# __name__ se mujhe ye pata chalta he ki koi given file (here file1.py) kaha se execute hona start hui he, kya wo directly execute hui he (is case me __name__ me "__main__" hota he) ya phir kisi doosre file me as a module import hoke run hui he (is case me __name__ me "file_name" -> "file1" hota he).
# print(__name__)

# Python me agr koi file import karo (file1.py) kisi doosri file (file2.py) me as a module to imported file ka sara ka sara content us doosri file me aa jata he, aur jab doosri file ko run karenge to copy-pasted code bhi run hojata he, is wajah se jo code imported file me maine kisi function ke andar ni likha wo execute ho jata he automatically.

# Is cheez se bachne ke liye mai file me __name__ == "__main__" ka check lagadeta hu jisse ye check ke andar ka sirf tabhi run hoga jab file direct execute hui ho, agr import karke execute ho rahi hogi to check ke andar ka code ni chalega.
if __name__ == "__main__":
    print("File direct run hui he.")
    greet("Madhur")