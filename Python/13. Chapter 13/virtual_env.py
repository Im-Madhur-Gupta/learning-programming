# Manlo mai kisi ek version of module pe develop kar raha hu, leking ab mujhe newer version of module pe switch karna he but I don't want to loose my current working setup, then I can make a virtual environment of Python jo ki mere actual/system environment se ekdum independent hoga, to koi software conflicts ni ayenge.

# lets say name of my virtual environment is "tempenv" then to activate it we can use following in windows -
# .\tempenv\Scripts\activate.ps1
# Iske baad jo bhi mai likhunga wo mere virtual environment me hoga

import flask
import pandas as pd
import pygame

print("Module installation verified.")


# Virtual Environment deactivate karne ke simply "deactivate" likhna he.

# Virtual Environment ko delete karne ke liye simply corresponding folder ko delete kardena he.

# To list all the packages present in system/virtual environment along with their versions, we use "pip freeze" command. 
# Ab manlo jo output aya usse requirements.txt me dump karna he to "pip freeze > requirements.txt" use karnege, ">" ye basically apne left wale command ka output right wali file (inside the same directory) me write kardega, ofc it will create a fill if its not found.
# Ab manlo kisi ko koi environment recreate karna he to, pehle us env me requirements.txt create karo phir target system me "pip install -r requirements.txt" run karenge.