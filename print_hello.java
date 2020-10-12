public class Apple{
	public int aMethod(){
	static int i=0;
	i++;
	return i;
}
public static void main(String args[])
{
	Apple app=new Apple();
	app.aMethod();
	int j=app.aMethod();
System.out.println(j);}}
