import java.io.*;
public class ASCIIconvert
{
    public static void main (String args[])
    {
	new ASCIIconvert ();
    }


    public ASCIIconvert ()
    {
	String inName = IBIO.inputString ("What is the name of the txt file with the ascii art? \n( don't include the .txt on the end)>> ");
	String outName = IBIO.inputString ("\n\nWhat is the name of the file where you wish to save the code? \n(don't include the .java on the end)>>");
	BufferedReader in;
	PrintWriter out;
	try
	{
	    in = new BufferedReader (new FileReader (inName + ".txt"));
	    out = new PrintWriter (new FileWriter (outName + ".java"));
	    String input = in.readLine ();
	    out.println ("public class " + outName + "\n{\n\tpublic static void main(String args[])\n\t{\n\t\t");
	    while (input != null)
	    {
		out.print ("\t\tSystem.out.println(\"");
		for (int i = 0 ; i < input.length () ; i++)
		{
		    if ((int) (input.charAt (i)) == 92)
			out.print ("\\\\");
		    else if ((int) (input.charAt (i)) == 34)
			out.print ("\\\"");
		    else
			out.print (input.charAt (i) + "");
		}
		out.println ("\");");
		input = in.readLine ();
	    }
	    out.println ("\t}\n}");
	    in.close ();
	    out.close ();
	}
	catch (IOException e)
	{
	    System.out.println ("Error opening file " + e);
	}
    }
}
