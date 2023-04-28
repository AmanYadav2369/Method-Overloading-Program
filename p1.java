//waoojp to implement method overloading..

class demo
{

void add(int a, int b){
int res=a+b;
System.out.println("Addition of two no = "+res);
}
void add(int a, int b, int c){
int res=a+b+c;
System.out.println("addition of three no = "+res);
}

}
class p1
{
public static void main(String args[])
{
demo d=new demo();
d.add(15,10);
d.add(20,30,40);

}
}