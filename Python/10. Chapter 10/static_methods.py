# @staticmethod --> This is called static method decorator, isko sirf mujhe function define karne ke upar likhna padta he. Static methods ki argument list me mai self NI de sakta.
class Hello:
    @staticmethod
    def greet(name):
        print(f"Hello, {name}")

temp = Hello()
temp.greet("Madhur") # OR Hello.greet("Madhur")