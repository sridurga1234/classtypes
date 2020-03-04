package anonymousdemo;
interface Age
{
	static final int x = 21;
	public abstract void getAge();
}
class Anonymous {
	public static void main(String args[]){
		
	Age obj = new Age(){
		public void getAge()
		{
			System.out.print("age is"+x);
			}
		};
		obj.getAge();

}
}
