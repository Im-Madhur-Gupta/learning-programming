class TempClass{
    int a;
    int b;
    public TempClass(int a_temp){
        a=a_temp;
    }

    public static void getB(TempClass temp_obj) {
        System.out.println(temp_obj.b);
    }

    public int getA_and_setgetB() {
        // this keyword is used when we have called some method using an object then in that called method (we again
        // want to call another method passing the previous object as arguement) or (change/access some ppt of that object)
        // then inorder to reference our original object in such situations we can use this keyword.
        this.b = 1;
        getB(this);
        return a;
    }
    public int returnsOne(){return 1;}
}
public class this_super_keyword {
    public static void main(String[] args) {
        TempClass obj = new TempClass(7);
        System.out.println(obj.getA_and_setgetB());
    }
}

// super keyword gives a reference to an object of the immediate parent class.