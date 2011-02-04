public class EchoText
{
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("Introduce el texto:");
		int ch;
		while ((ch=System.in.read())!=13)
			System.out.print((char) ch);
		System.out.println();
	}
}