package programs;
 class TV
{int id; String name;
	 TV(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
int a=10;int b=20;
void read()
{
	System.out.println("reading");
}
}

class Remote extends TV
{
	 
	Remote(int id, String name)
	{
		super(id,name);
	}
	 void print()
	 {
		 super.read();
		 System.out.println(super.a);
		 System.out.println(b+""+id+""+name);
	 }
}

public class OopsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remote r=new 
				Remote(1,"pooja");
		r.print();
		

	}

}
