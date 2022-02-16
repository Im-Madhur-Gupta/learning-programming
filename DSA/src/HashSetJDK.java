import java.util.HashSet;

class OrdPair{
    int x;
    int y;
    public OrdPair(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        if (!(o instanceof OrdPair)) {
            return false;
        }

        OrdPair c = (OrdPair) o;

        return Integer.compare(this.x, c.x) == 0 && Integer.compare(this.y, c.y) == 0;
    }
}

public class HashSetJDK {
    public static void main(String[] args) {
        HashSet<OrdPair> hs = new HashSet<>();
        hs.add(new OrdPair(1,2));
        hs.add(new OrdPair(2,3));

        System.out.println(hs.remove(new OrdPair(1,2)));
        System.out.println(hs.contains(new OrdPair(1,4)));

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("str1");
        hs1.add("str2");
        System.out.println(hs1.contains("str1"));
        System.out.println(hs1.contains("str3"));

        char c1='a';
//        String test = ""+'0'+'2'+'3'+'4';
        String test = ""+1;
        String test1 = c1+"";
        System.out.println(test);
        System.out.println(test1);
    }
}