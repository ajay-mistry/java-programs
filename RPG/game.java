/*Ajay Mistry
Batman vs. The Riddler RPG
Due April 8th, 2013
*/

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class game
{
    //global variable to count score
    int score = 0;
    public static void main (String args[])
    {
	new game ();
    }

    protected static ImageIcon createImageIcon (String path)
    {
	//This code is for showing pictures in a dialog box
	java.net.URL imgURL = game.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }

    public game ()
    {
	//introduce char variable to stop
	char continu = 'y';

	while (continu == 'y')
	{
	    //all methods
	    pic ();
	    art ();
	    intro ();
	    initialquest ();
	    mercifulgenius ();
	    riddle1 ();
	    riddle2 ();
	    riddle3 ();
	    restriction ();
	    blank ();
	    riddle4 ();
	    riddle5 ();
	    riddle6 ();
	    riddle7 ();
	    replay ();
	}
    }

    public void printSlow (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //sleep after printing a letter
	    try
	    {
		//speed
		Thread.sleep (25);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}
	System.out.println ();
    }

    public void date ()
    {
	//access system date, print date
	Date now = new Date ();
	DateFormat df = DateFormat.getDateInstance ();
	String s = df.format (now);
	System.out.println ("Today is " + s);
    }

    public void pic ()
    {
	//picture in dialogue box
	JOptionPane.showMessageDialog (null, createImageIcon ("bmvsrid.jpg"), "Welcome to Batman vs. The Riddler!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void art ()
    {
	//ASCII Art & date
	System.out.println ("Please maximize the screen.");
	date ();
	blank ();
	//ASCII art from: http://www.chris.com/ascii/index.php?art=comics%2Fbatman
	System.out.println ("MMMMMMMMMMMMMMMMMMMMM.                             MMMMMMMMMMMMMMMMMMMMM");
	System.out.println (" MMMMMMMMMMMMMMMMMMMM           M\\  /M           MMMMMMMMMMMMMMMMMMMM");
	System.out.println ("   MMMMMMMMMMMMMMMMMMM          MMMMMM          MMMMMMMMMMMMMMMMMMM");
	System.out.println ("    MMMMMMMMMMMMMMMMMMM-_______MMMMMMMM_______-MMMMMMMMMMMMMMMMMMM");
	System.out.println ("     MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("     MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("     MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("    .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.");
	System.out.println ("   MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("                   MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("                         MMMMMMMMMMMMMMMMMM");
	System.out.println ("                              MMMMMMMMMM");
	System.out.println ("                                MMMMMM");
	System.out.println ("                                 MMMM");
	System.out.println ("                                  MM");
	blank ();
    }

    public void blank ()
    {
	//blank spacing when running program, less clutter
	System.out.println ();
    }

    public void intro ()
    {
	//introduction to game, situation explained
	printSlow ("You are Batman, trapped inside one of the rooms inside The Riddler's \nheadquarters.");
	printSlow ("In order to exit the room and apprehend The Riddler, you must answer each \nquestion the Riddler poses.");
	printSlow ("Riddler: Just a heads up, Batman, I am counting your points for fun!");
	blank ();
    }

    public void initialquest ()
    {
	//question to play with only one outcome
	String quest = IBIO.inputString ("Would you like to play? y/n ");
	{
	    if (quest.equalsIgnoreCase ("Y") || quest.equalsIgnoreCase ("YES") || quest.equalsIgnoreCase ("SURE"))
		System.out.println ("Good; now try to defeat the Riddler.");
	    else
		//user must play
		System.out.println ("Sorry, you're going to have to play.");
	}
	blank ();
	init ();
    }

    public void init ()
    {
	//picture in dialogue box
	JOptionPane.showMessageDialog (null, createImageIcon ("bane.jpg"), "Suddenly a wild Bane appears!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mercifulgenius ()
    {
	//pre-first riddle dialogue
	printSlow ("The Riddler: I finally have you now Batman, but since I am a merciful genius\n, to escape, you must answer my devious riddles!");
	printSlow ("MUAHAHAHA!");
	printSlow ("The Riddler: Here is the first riddle: ");
	blank ();
    }

    public void riddle1 ()
    {
	//first riddle asked
	printSlow ("What belongs to you, but is used by others?");
	String ans1 = IBIO.inputString ("Answer: ");
	{
	    //circumstances for progression
	    if (ans1.equalsIgnoreCase ("YOUR NAME"))
	    {
		score ++;
		printSlow ("Correct, you can now progress to the next room. You have: " + score + " point.");
		blank ();
	    }

	    else
	    {
		//answer wrong
		printSlow ("Incorrect; try again. You have " + score + " points.");
		blank ();
		riddle1 ();
	    }
	}
    }

    public void riddle2 ()
    {
	//second riddle
	printSlow ("I have 6 faces, all of which are nose and mouth free, and I \nhave 21 eyes, but still cannot see, what am I?");
	String ans2 = IBIO.inputString ("Answer: ");
	{
	    //circumstances for progression
	    if (ans2.equalsIgnoreCase ("A DIE"))
	    {
		//increase score
		score ++;
		printSlow ("Correct, you can now progress to the next room. You have: " + score + " points.");
		blank ();
	    }
	    else
	    {
		//answer wrong
		printSlow ("Try again, Batman! And you still have " + score + " point.");
		blank ();
		//gives user a second try on the riddle
		riddle2 ();
	    }
	}
    }

    public void riddle3 ()
    {
	//random number math question
	int r1 = 0;
	//getting a random number
	r1 = ((int) (Math.random () * 84)) + 3;
	int ans3 = IBIO.inputInt ("Answer this question: " + r1 + " + 103 \nAnswer: ");
	{
	    if (ans3 == (r1 + 103))
	    {
		//increase score if correct
		score ++;
		printSlow ("Darn it! You may proceed...");
		printSlow ("Oh, and you have: " + score + " points.");
		blank ();
	    }
	    else
	    {
		//what to print and do when answer is incorrect
		printSlow ("HAHAHA! Try again! And you still have " + score + " points.");
		blank ();
		riddle3 ();
	    }
	}
    }

    public void restriction ()
    {
	String h = IBIO.inputString ("Riddler: I have a surprise for you. Enter a number: ");
	int a = 0;
	while (a == 0)
	{
	    try
	    {
		//Integer.parseInt changes String variable type to Int variable type
		int n = Integer.parseInt (h);
		question (n);
		a = 7;
	    }
	    catch (java.lang.NumberFormatException nn)
	    {
		h = IBIO.inputString ("That's not a number. Try again: ");
	    }
	}
	blank ();
    }

    public void question (int n)
    {
	//user spammed with their own input with question marks, the signature of The Riddler
	int i = 0;
	do
	{
	    System.out.print ("? ");
	    i++;
	}
	while (i < n);
    }

    public String riddle4 ()
    {
	//return type
	String ret = " ";
	printSlow ("I am the beginning of the end, and the end of time and space. I am \nessential to creation, and I surround every place. What am I?");
	String ans4 = IBIO.inputString ("Answer: ");
	{
	    if (ans4.equalsIgnoreCase ("E"))
	    {
		//answer is correct
		score ++;
		printSlow ("I see you have solved this riddle, but no worries! I have more up my sleeve!");
		printSlow ("You have: " + score + " points.");
		blank ();
	    }
	    else
	    {
		//answer is incorrect
		printSlow ("NOPE! Try again! And you still have " + score + " points.");
		blank ();
		riddle4 ();
	    }
	}
	return ret;
    }

    public String riddle5 ()
    {
	//return type String
	String ter = " ";
	printSlow ("I went into the woods and got it. I sat down to seek it. I brought it home \nwith me because I couldn't find it. What is it?");
	String ans5 = IBIO.inputString ("Answer: ");
	if (ans5.equalsIgnoreCase ("A SPLINTER"))
	{
	    //answer correct
	    score ++;
	    printSlow ("You're smarter than I expected, but fear not! I have 2 more riddles; although \nyou are getting rather close, which worries me.");
	    printSlow ("You have: " + score + " points.");
	    blank ();
	}
	else
	{
	    //answer incorrect
	    printSlow ("NOPE! Try again! And you still have " + score + " points.");
	    blank ();
	    riddle5 ();
	}
	return ter;
    }

    public void riddle6 ()
    {
	printSlow ("The more you take, the more you leave behind.");
	String ans6 = IBIO.inputString ("Answer: ");
	{
	    //answer is correct
	    if (ans6.equalsIgnoreCase ("FOOTSTEPS"))
	    {
		score ++;
		printSlow ("Well, it seems you have reached my last riddle, meaning that your answer is correct.");
		printSlow ("You have: " + score + " points.");
		blank ();
	    }
	    else
	    {
		//answer is incorrect
		printSlow ("HAHA! Try again! You have " + score + " points.");
		blank ();
		//user has to answer riddle again
		riddle6 ();
	    }
	}
    }

    public void riddle7 ()
    {
	printSlow ("Riddler: This riddle is the key to my existence, if you solve it, Gotham is yours. \nBut I'm almost certain that you cannot answer it! Give it a shot!");
	printSlow ("In a street there are five houses, painted five different colors. In each house \nlives a person of different nationality.");
	printSlow ("These five homeowners each drink a different kind of beverage, smoke different \nbrand of cigar and keep a different pet.");
	printSlow ("The question is: Who owns the fish?");
	blank ();
	printSlow ("Necessary clues: ");
	printSlow ("1. The British man lives in a red house. ");
	printSlow ("2. The Swedish man keeps dogs as pets. ");
	printSlow ("3. The Danish man drinks tea. ");
	printSlow ("4. The Green house is next to, and on the left of the White house. ");
	printSlow ("5. The owner of the Green house drinks coffee. ");
	printSlow ("6. The person who smokes Pall Mall rears birds. ");
	printSlow ("7. The owner of the Yellow house smokes Dunhill. ");
	printSlow ("8. The man living in the center house drinks milk. ");
	printSlow ("9. The Norwegian lives in the first house. ");
	printSlow ("10. The man who smokes Blends lives next to the one who keeps cats. ");
	printSlow ("11. The man who keeps horses lives next to the man who smokes Dunhill. ");
	printSlow ("12. The man who smokes Blue Master drinks beer.");
	printSlow ("13. The German smokes Prince. ");
	printSlow ("14. The Norwegian lives next to the blue house. ");
	printSlow ("15. The Blends smoker lives next to the one who drinks water. ");
	String ans7 = IBIO.inputString ("Who owns the fish? ");
	if (ans7.equalsIgnoreCase ("THE GERMAN"))
	{
	    score ++;
	    printSlow ("Wow...you're a genius. No! I'm fading away! NOOOOOOO!");
	    printSlow ("Congratulations, you have successfully completed the game, liberated Gotham \nCity, and defeated The Riddler with " + score + " points.");
	    blank ();
	    //ASCII art from: http://www.chris.com/ascii/index.php?art=comics%2Fbatman 
	    System.out.println (":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	    System.out.println (":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	    System.out.println (":::::::::::::::::::::::::::::::::::::::::::::-'    `-::::::::::::::::::");
	    System.out.println ("::::::::::::::::::::::::::::::::::::::::::-'          `::::::::::::::::");
	    System.out.println (":::::::::::::::::::::::::::::::::::::::-  '   /(_M_)\\  `:::::::::::::::");
	    System.out.println (":::::::::::::::::::::::::::::::::::-'        |       |  :::::::::::::::");
	    System.out.println ("::::::::::::::::::::::::::::::::-         .   \\/~V~\\/  ,:::::::::::::::");
	    System.out.println ("::::::::::::::::::::::::::::-'             .          ,::::::::::::::::");
	    System.out.println (":::::::::::::::::::::::::-'                 `-.    .-::::::::::::::::::");
	    System.out.println (":::::::::::::::::::::-'                  _,,-::::::::::::::::::::::::::");
	    System.out.println ("::::::::::::::::::-'                _,--:::::::::::::::::::::::::::::::");
	    System.out.println ("::::::::::::::-'               _.--::::::::::::::::::::::#####:::::::::");
	    System.out.println (":::::::::::-'             _.--:::::::::::::::::::::::::::#####:::::####");
	    System.out.println ("::::::::'    ##     ###.-::::::###:::::::::::::::::::::::#####:::::####");
	    System.out.println ("::::-'       ###_.::######:::::###::::::::::::::#####:##########:::####");
	    System.out.println (":'         .:###::########:::::###::::::::::::::#####:##########:::####");
	    System.out.println ("     ...--:::###::########:::::###:::::######:::#####:##########:::####");
	    System.out.println (" _.--:::##:::###:#########:::::###:::::######:::#####:#################");
	    System.out.println ("'#########:::###:#########::#########::######:::#####:#################");
	    System.out.println (":#########:::#############::#########::######:::#######################");
	    System.out.println ("##########:::########################::################################");
	    System.out.println ("##########:::##########################################################");
	    System.out.println ("##########:::##########################################################");
	    System.out.println ("#######################################################################");
	    System.out.println ("#######################################################################");
	    System.out.println ("#######################################################################");
	    System.out.println ("#######################################################################");
	    System.out.println ("");
	    blank ();
	    char questbonus = IBIO.inputChar ("Would you like to play the bonus level? y/n ");
	    if (questbonus == 'y' || questbonus == 'Y')
		bonus ();
	}
	else
	{
	    printSlow ("You have lost the game. Gotham is still under The Riddler's power. You \nfinished the game with " + score + " points.");
	    blank ();
	}
    }

    public void bonus ()
    {
	//bonus riddle code (method)
	printSlow ("The man who invented it doesn't want it. The man who bought it doesn't need it. \nThe man who needs it doesn't know it.");
	String ansbonus = IBIO.inputString ("What is it? ");
	if (ansbonus.equalsIgnoreCase ("A COFFIN"))
	    printSlow ("Congratulations! You have completed the bonus level!");
	else
	    printSlow ("Incorrect. You cannot try again. Thank you for playing!");
    }

    public void replay ()
    {
	//option to replay
	char ans0 = IBIO.inputChar ("Do you want to play again? y/n: ");
	if (ans0 == 'y')
	    new game ();
	else
	    System.exit (0);
    }
}


