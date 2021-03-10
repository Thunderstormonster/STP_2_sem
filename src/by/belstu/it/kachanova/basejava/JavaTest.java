package by.belstu.it.kachanova.basejava;

import static java.lang.Math.*;

public class JavaTest {
        final int fint=1;
        public final int fint2=2;
        public final static int fint3=3;//инициализируются во время загрузки

    public static void main(String[] args) {
        char vchar='c';
        int vint=1;
        short vshort=11;
        byte vbyte=5;
        long vlong=123;
        boolean vboolean1=false;
        boolean vboolean2=true;
        String vstring="logo";
        double vdouble=34.909;

        System.out.println(vstring+vint);
        System.out.println(vstring+vchar);
        System.out.println(vstring+vdouble);

        //byte b2=vbyte+vint;
        //b2= (byte) (vbyte+vint);
        //int i2=vdouble+vlong;
        //i2=(int)(vdouble+vlong);
        long l2=(long)vint+2147483647;
        System.out.println(l2);
        //l2=(long)(vint+2147483647);

        System.out.println("Static: "+sint);

        boolean vboolean3=vboolean1&&vboolean2;
        System.out.println(vboolean3);
        boolean vboolean4=vboolean1^vboolean2;
        System.out.println(vboolean4);
        //boolean vboolean5=vboolean1+vboolean2;
        long vlong2=9223372036854775807L;
        long vlong3=0x7ffffffffffL;

        char vchar2='a';
        char vchar3='\u0061';
        char vchar4=97;
        System.out.println("a: "+vchar2);
        System.out.println("\u0061: "+vchar3);
        System.out.println("97: "+vchar4);
        System.out.println("result: "+vchar2+vchar3+vchar4);

        System.out.println("3.45 % 2.4 "+3.45 % 2.4);
        System.out.println("1.0/0.0 "+1.0/0.0);
        System.out.println("0.0/0.0 "+0.0/0.0);
        System.out.println("log(-345) "+log(-345));

        System.out.println("lol: "+Float.intBitsToFloat(0x7F800000));
        System.out.println("loll: "+Float.intBitsToFloat(0xFF800000));

        System.out.println("Math.PI "+ PI);
        System.out.println("Math.round(Math.PI): "+Math.round(Math.PI));
        System.out.println("Math.min(): "+Math.min(9,6));
        System.out.println("Math.random: "+Math.random());

        Boolean bool=new Boolean(vboolean1);
        Character charect=new Character(vchar);
        Integer inter=new Integer(vint);
        Byte b=new Byte(vbyte);
        Short shor=new Short(vshort);
        Long lon=new Long(vlong);
        Double dou=new Double(vdouble);
        System.out.println("+: "+inter+b);
        int i=inter<<vint;
        System.out.println("сдвиг*2: "+i);
        System.out.println("~: "+~inter);
        System.out.println("somthing: "+Long.MIN_VALUE);
        System.out.println("someting2: "+Double.MAX_VALUE);











    }
    static int sint;
}
