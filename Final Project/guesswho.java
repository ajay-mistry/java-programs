// Ajay Mistry
// Guess Who? Final Project
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class guesswho extends Applet implements ActionListener
{
    //panel holds all cards
    Panel p_card;

    //all cards
    Panel card1, card2, card3, card4, card5, card6, card7, card8, card9, card10;
    CardLayout game = new CardLayout ();

    //row and column for 2D Button Array
    int row = 3;
    int column = 2;

    //2D Button Array to print game board
    JButton pics[] = new JButton [row * column];

    //each clue is global to change in AP if correct or incorrect
    JLabel clue1, clue2, clue3, clue4, clue5, clue6;

    //next button is global so it is true when correct and false when incorrect
    JButton next1, next2, next3, next4, next5, next6;

    JMenuBar menuBar = new JMenuBar ();
    JMenuItem menuItem;

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (game);

	JMenu menu;
	

	menu = new JMenu ("File");
	menuBar.add (menu);
	menuItem = new JMenuItem ("Close");
	menuItem.addActionListener (this);
	menuItem.setActionCommand ("Close");
	menu.add (menuItem);

	menu = new JMenu ("Navigate");
	menuBar.add (menu);

	menuItem = new JMenuItem ("Instructions");
	menuItem.addActionListener (this);
	menuItem.setActionCommand ("Instructions");
	menu.add (menuItem);

	menuItem = new JMenuItem ("Game Board");
	menuItem.addActionListener (this);
	menuItem.setActionCommand ("gb");
	menu.add (menuItem);

	menuItem = new JMenuItem ("Game");
	menuItem.addActionListener (this);
	menuItem.setActionCommand ("ge");
	menu.add (menuItem);


	//add each respective screen
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	screen6 ();
	screen7 ();
	screen8 ();
	screen9 ();
	screen10 ();

	//resizes entire Applet
	resize (800, 600);

	setLayout (new BorderLayout ());
	add ("Center", p_card);
	add ("North", menuBar);
    }


    public void screen1 ()
    {
	//adds screen
	card1 = new Panel ();
	card1.setBackground (Color.orange);

	JLabel title = new JLabel ("Guess Who?");
	title.setFont (new Font ("Ravie", Font.BOLD, 48));

	//adds picture of Guess Who? board
	JLabel titlepic = new JLabel (createImageIcon ("0.jpg"));

	//space between JLabel lines
	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 50));

	//another space
	JLabel smallspace1 = new JLabel (" ");
	smallspace1.setPreferredSize (new Dimension (800, 10));

	JButton next = new JButton ("Next");
	next.setActionCommand ("2");
	next.addActionListener (this);

	//adding widgets to screen
	card1.add (title);
	card1.add (space);
	card1.add (titlepic);
	card1.add (smallspace1);
	card1.add (next);

	//adds screen to panel that holds all screens
	p_card.add ("1", card1);
    }


    public void screen2 ()
    {
	//add new screen
	card2 = new Panel ();
	card2.setBackground (Color.orange);

	JLabel welcome = new JLabel ("Welcome To Guess Who?");
	welcome.setFont (new Font ("Berlin Sans FB", Font.PLAIN, 48));

	JLabel firstinstruct = new JLabel ("Instructions: ");
	firstinstruct.setFont (new Font ("Tahoma", Font.PLAIN, 18));

	JLabel instructions = new JLabel ("You will be given a clue and you must guess the character.");
	instructions.setFont (new Font ("Tahoma", Font.PLAIN, 18));

	JLabel secondinstruct = new JLabel ("Click on the picture of the character to guess.");
	secondinstruct.setFont (new Font ("Tahoma", Font.PLAIN, 18));

	//button to switch screens, AC is 3 for card3
	JButton next = new JButton ("Next");
	next.setActionCommand ("3");
	next.addActionListener (this);

	//space between instruction lines
	JLabel smallspace = new JLabel (" ");
	smallspace.setPreferredSize (new Dimension (800, 10));

	//more spaces with different dimensions
	JLabel smallspace1 = new JLabel (" ");
	smallspace1.setPreferredSize (new Dimension (800, 326));

	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 50));

	//add widgets to screen
	card2.add (welcome);
	card2.add (space);
	card2.add (firstinstruct);
	card2.add (instructions);
	card2.add (smallspace);
	card2.add (secondinstruct);
	card2.add (smallspace1);
	card2.add (next);

	//add screen (card2) to the panel that holds all screens
	p_card.add ("2", card2);
    }


    public void screen3 ()
    {
	//add new screen
	card3 = new Panel ();
	card3.setBackground (Color.orange);

	JLabel show = new JLabel ("This is what the game board looks like.");

	//adds game board (pictures) --> pictures from Google Images and Hasbro Inc.
	Panel board = new Panel (new GridLayout (row, column));
	for (int i = 0 ; i < pics.length ; i++)
	{
	    pics [i] = new JButton (createImageIcon ((i + 1) + ".jpg"));
	    //pics [i].setActionCommand ("pics");
	    //pics [i].addActionListener (this);
	    board.add (pics [i]);
	}

	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 15));

	//button to switch screens, AC is 4 for card4
	JButton next = new JButton ("Next");
	next.setActionCommand ("4");
	next.addActionListener (this);

	//add widgets to screen
	card3.add (show);
	card3.add (board);
	card3.add (space);
	card3.add (next);

	//add screen (card3) to the panel that holds all screens
	p_card.add ("3", card3);
    }


    public void screen4 ()
    {
	//add new screen
	card4 = new Panel ();
	card4.setBackground (Color.orange);

	clue1 = new JLabel ("I have a Ph.D in theoretical physics and I am arrogant and cynical. Who am I?");

	//add game board again
	Panel board = new Panel (new GridLayout (row, column));
	for (int i = 0 ; i < pics.length ; i++)
	{
	    pics [i] = new JButton (createImageIcon ((i + 1) + ".jpg"));
	    pics [i].setActionCommand ("pic" + i);
	    pics [i].addActionListener (this);
	    board.add (pics [i]);
	}

	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 15));

	//button to switch screens, AC is 5 for card5
	next1 = new JButton ("Next");
	next1.setActionCommand ("5");
	next1.addActionListener (this);

	//add widgets to screen
	card4.add (board);
	card4.add (clue1);
	card4.add (space);
	card4.add (next1);

	//add screen (card4) to the panel that holds all screens
	p_card.add ("4", card4);
    }


    public void screen5 ()
    {
	//add new screen
	card5 = new Panel ();
	card5.setBackground (Color.orange);

	clue2 = new JLabel ("I am the best closer New York has ever seen and I absolutely love cars.");

	//add game board again
	Panel board = new Panel (new GridLayout (row, column));
	for (int i = 0 ; i < pics.length ; i++)
	{
	    pics [i] = new JButton (createImageIcon ((i + 1) + ".jpg"));
	    pics [i].setActionCommand ("pi2" + i);
	    pics [i].addActionListener (this);
	    board.add (pics [i]);
	}

	//button to switch screens, AC is 6 for card6
	next2 = new JButton ("Next");
	next2.setActionCommand ("6");
	next2.addActionListener (this);

	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 5));

	JLabel smallspace = new JLabel (" ");
	smallspace.setPreferredSize (new Dimension (800, 5));


	//add widgets to screen
	card5.add (board);
	card5.add (space);
	card5.add (clue2);
	card5.add (smallspace);
	card5.add (next2);

	//add screen (card5) to the panel that holds all screens
	p_card.add ("5", card5);
    }


    public void screen6 ()
    {
	//add new screen
	card6 = new Panel ();
	card6.setBackground (Color.orange);

	clue3 = new JLabel ("I often star with Helena Bonham Carter in many movies and I am known for my rather comedic and arrogant roles. Who am I?");

	//add game board again
	Panel board = new Panel (new GridLayout (row, column));
	for (int i = 0 ; i < pics.length ; i++)
	{
	    pics [i] = new JButton (createImageIcon ((i + 1) + ".jpg"));
	    pics [i].setActionCommand ("pi3" + i);
	    pics [i].addActionListener (this);
	    board.add (pics [i]);
	}

	//button to switch screens, AC is 7 for card7
	next3 = new JButton ("Next");
	next3.setActionCommand ("7");
	next3.addActionListener (this);

	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 5));

	JLabel smallspace = new JLabel (" ");
	smallspace.setPreferredSize (new Dimension (800, 5));


	//add widgets to screen
	card6.add (board);
	card6.add (space);
	card6.add (clue3);
	card6.add (smallspace);
	card6.add (next3);

	//add screen (card6) to the panel that holds all screens
	p_card.add ("6", card6);
    }


    public void screen7 ()
    {
	//add new screen
	card7 = new Panel ();
	card7.setBackground (Color.orange);

	clue4 = new JLabel ("I love to wear suits and many people love my sense of humour and I set my best friend on fire...for no particular reason.");

	//add game board
	Panel board = new Panel (new GridLayout (row, column));
	for (int i = 0 ; i < pics.length ; i++)
	{
	    pics [i] = new JButton (createImageIcon ((i + 1) + ".jpg"));
	    pics [i].setActionCommand ("pi4" + i);
	    pics [i].addActionListener (this);
	    board.add (pics [i]);
	}

	//button to switch screens, AC is 8 for card8
	next4 = new JButton ("Next");
	next4.setActionCommand ("8");
	next4.addActionListener (this);

	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 5));

	JLabel smallspace = new JLabel (" ");
	smallspace.setPreferredSize (new Dimension (800, 5));

	//add widgets to screen
	card7.add (board);
	card7.add (space);
	card7.add (clue4);
	card7.add (smallspace);
	card7.add (next4);

	//add screen (card7) to the panel that holds all screens
	p_card.add ("7", card7);
    }


    public void screen8 ()
    {
	//add new screen
	card8 = new Panel ();
	card8.setBackground (Color.orange);

	clue5 = new JLabel ("My head got chopped off.");

	//add game board
	Panel board = new Panel (new GridLayout (row, column));
	for (int i = 0 ; i < pics.length ; i++)
	{
	    pics [i] = new JButton (createImageIcon ((i + 1) + ".jpg"));
	    pics [i].setActionCommand ("pi5" + i);
	    pics [i].addActionListener (this);
	    board.add (pics [i]);
	}

	//button to switch screens, AC is 9 for card9
	next5 = new JButton ("Next");
	next5.setActionCommand ("9");
	next5.addActionListener (this);

	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 5));

	JLabel smallspace = new JLabel (" ");
	smallspace.setPreferredSize (new Dimension (800, 5));

	//add widgets to screen
	card8.add (board);
	card8.add (space);
	card8.add (clue5);
	card8.add (smallspace);
	card8.add (next5);

	//add screen (card8) to the panel that holds all screens
	p_card.add ("8", card8);
    }


    public void screen9 ()
    {
	//add new screen
	card9 = new Panel ();
	card9.setBackground (Color.orange);

	clue6 = new JLabel ("I kill zombies and my fans absolutely love me. Who am I?");

	//add game board
	Panel board = new Panel (new GridLayout (row, column));
	for (int i = 0 ; i < pics.length ; i++)
	{
	    pics [i] = new JButton (createImageIcon ((i + 1) + ".jpg"));
	    pics [i].setActionCommand ("pi6" + i);
	    pics [i].addActionListener (this);
	    board.add (pics [i]);
	}

	//button to switch screens, AC is 10 for card10
	next6 = new JButton ("Next");
	next6.setActionCommand ("10");
	next6.addActionListener (this);

	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 5));

	JLabel smallspace = new JLabel (" ");
	smallspace.setPreferredSize (new Dimension (800, 5));

	//add widgets to screen
	card9.add (board);
	card9.add (space);
	card9.add (clue6);
	card9.add (smallspace);
	card9.add (next6);

	//add screen (card9) to the panel that holds all screens
	p_card.add ("9", card9);
    }


    public void screen10 ()
    {
	card10 = new Panel ();
	card10.setBackground (Color.cyan);
	
	JLabel bigspace = new JLabel (" ");
	bigspace.setPreferredSize (new Dimension (800, 250));
	
	JLabel finalmsg = new JLabel ("Thank you for playing!");
	finalmsg.setFont (new Font ("Berlin Sans FB", Font.PLAIN, 24));
	
	JLabel space = new JLabel (" ");
	space.setPreferredSize (new Dimension (800, 5));
	
	JLabel by = new JLabel ("By: Ajay Mistry, ICS2O8-C");
	by.setFont (new Font ("Berlin Sans FB", Font.PLAIN, 20));

	card10.add (bigspace);
	card10.add (finalmsg);
	card10.add (space);
	card10.add (by);

	p_card.add ("10", card10);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("Close"))
	    System.exit (0);
	else if (e.getActionCommand ().equals ("Instructions"))
	    game.show (p_card, "2");
	else if (e.getActionCommand ().equals ("gb"))
	    game.show (p_card, "3");
	else if (e.getActionCommand ().equals ("ge"))
	{
	    game.show (p_card, "4");
	    next1.setEnabled (false);
	    menuItem.setEnabled (false);
	}
	
	else if (e.getActionCommand ().equals ("1"))
	    //show first screen
	    game.show (p_card, "1");
	else if (e.getActionCommand ().equals ("2"))
	    //show second screen
	    game.show (p_card, "2");
	else if (e.getActionCommand ().equals ("3"))
	    //show third screen
	    game.show (p_card, "3");
	else if (e.getActionCommand ().equals ("4"))
	{
	    //show fourth screen
	    game.show (p_card, "4");
	    next1.setEnabled (false);
	    menuItem.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("5"))
	{
	    //show fifth screen
	    game.show (p_card, "5");
	    next2.setEnabled (false);
	}

	else if (e.getActionCommand ().equals ("6"))
	{
	    //show sixth screen
	    game.show (p_card, "6");
	    next3.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("7"))
	{
	    //show seventh screen
	    game.show (p_card, "7");
	    next4.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("8"))
	{
	    //show eighth screen
	    game.show (p_card, "8");
	    next5.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("9"))
	{
	    //show ninth screen
	    game.show (p_card, "9");
	    next6.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("10"))
	{
	    //show ninth screen
	    game.show (p_card, "10");
	    next6.setEnabled (false);
	}

	else
	{
	    //takes last 3 characters of AC to distinguish which screen
	    String s = e.getActionCommand ();
	    String whichscreen = s.substring (0, 3);
	    if (whichscreen.equals ("pic"))
	    {
		//gets last 3 characters of AC to run if statements of button selection
		int choice = (Integer.parseInt (s.substring (3, s.length ())));
		// showStatus (whichscreen + " " + choice);

		if (choice == 1)
		{
		    //shows if correct
		    clue1.setText ("                                                                Correct");
		    next1.setEnabled (true);
		}
		else
		{
		    //shows if incorrect
		    clue1.setText ("                                                                Incorrect");
		    next1.setEnabled (false);
		}
	    }
	    else if (whichscreen.equals ("pi2"))
	    {
		int choice = (Integer.parseInt (s.substring (3, s.length ())));
		// showStatus (whichscreen + " " + choice);

		if (choice == 4)
		{
		    //shows if correct
		    clue2.setText ("                                                            Correct");
		    next2.setEnabled (true);
		}
		else
		{
		    //shows if incorrect
		    clue2.setText ("                                                           Incorrect");
		    next2.setEnabled (false);
		}

	    }

	    else if (whichscreen.equals ("pi3"))
	    {
		int choice = (Integer.parseInt (s.substring (3, s.length ())));
		// showStatus (whichscreen + " " + choice);

		if (choice == 5)
		{
		    //shows if correct
		    clue3.setText ("                                                                                                            Correct");
		    next3.setEnabled (true);
		}
		else
		{
		    //shows if incorrect
		    clue3.setText ("                                                                                                            Incorrect");
		    next3.setEnabled (false);
		}

	    }
	    else if (whichscreen.equals ("pi4"))
	    {
		int choice = (Integer.parseInt (s.substring (3, s.length ())));
		// showStatus (whichscreen + " " + choice);

		if (choice == 0)
		{
		    //shows if correct
		    clue4.setText ("                                                                                                        Correct");
		    next4.setEnabled (true);
		}
		else
		{
		    //shows if incorrect
		    clue4.setText ("                                                                                                        Incorrect");
		    next4.setEnabled (false);
		}

	    }
	    else if (whichscreen.equals ("pi5"))
	    {
		int choice = (Integer.parseInt (s.substring (3, s.length ())));
		// showStatus (whichscreen + " " + choice);

		if (choice == 2)
		{
		    //shows if correct
		    clue5.setText ("                Correct");
		    next5.setEnabled (true);
		}
		else
		{
		    //shows if incorrect
		    clue5.setText ("                Incorrect");
		    next5.setEnabled (false);
		}

	    }
	    else if (whichscreen.equals ("pi6"))
	    {
		int choice = (Integer.parseInt (s.substring (3, s.length ())));
		// showStatus (whichscreen + " " + choice);

		if (choice == 3)
		{
		    //shows if correct
		    clue6.setText ("                                                Correct");
		    next6.setEnabled (true);
		}
		else
		{
		    //shows if incorrect
		    clue6.setText ("                                                Incorrect");
		    next6.setEnabled (false);
		}

	    }

	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	//add pictures
	java.net.URL imgURL = guesswho.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    //error message
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}


