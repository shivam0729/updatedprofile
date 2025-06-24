class A
{
    public int id=123;
    public void dispaly()
    {
        System.out.println( "CSIT B");
    }
}
class B
{
    public static void main (string[]args)
    {
        A obj = new A();
        System.out.println(obj.id);
        obj.dispaly();
    }
}