/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener
{
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];
	OnlineTest(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);add(b2);
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);
		jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);
		jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();
			if(current==50)
			{
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();
			if(current==50)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		if(e.getActionCommand().equals("Bookmark"+y))
		{
			if(check())
				count=count+1;
			now=current;
			current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		}
		}

		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this,"correct ans="+count);
			System.exit(0);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Qno1: Which one among these is not a datatype?");
			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==1)
		{
			l.setText("Qno2: Which class is available to all the class automatically?");
			jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");
		}
		if(current==2)
		{
			l.setText("Qno3: Which package is directly available to our class without importing it?");
			jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");
		}
		if(current==3)
		{
			l.setText("Qno4: String class is defined in which package?");
			jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");
		}
		if(current==4)
		{
			l.setText("Qno5: Which institute is best for java coaching?");
			jb[0].setText("Utek");jb[1].setText("Aptech");jb[2].setText("SSS IT");jb[3].setText("jtek");
		}
		if(current==5)
		{
			l.setText("Qno6: Which one among these is not a keyword?");
			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
		}
		if(current==6)
		{
			l.setText("Qno7: Which one among these is not a class? ");
			jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");jb[3].setText("Button");
		}
		if(current==7)
		{
			l.setText("Qno8: which one among these is not a function of Object class?");
			jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");jb[3].setText("getDocumentBase");
		}
		if(current==8)
		{
			l.setText("Qno9: which function is not present in Applet class?");
			jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");
		}
		if(current==9)
		{
			l.setText("Qno10: Which one among these is not a valid component?");
			jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");jb[3].setText("JTextArea");
		}
		if(current==10)
				{
					l.setText("Qno11: Which of the following option leads to the portability and security of Java?");
					jb[0].setText("Bytecode is executed by JVM");jb[1].setText("The applet makes the Java code secure and portable");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==11)
				{
					l.setText(" Qno12: What should be the execution order, if a class has a method, static block, instance block, and constructor, as shown below?");
					jb[0].setText("Instance block, method, static block, and constructor");jb[1].setText("Method, constructor, instance block, and static block");jb[2].setText("Static block, method, instance block, and constructor");jb[3].setText("Static block, instance block, constructor, and method");
		}
		if(current==12)
				{
					l.setText("Qno13: Which of the following is not a Java features? ");
					jb[0].setText("Dynamic");jb[1].setText("Architecture Neutral");jb[2].setText("Use of pointers");jb[3].setText("Object-oriented");
		}
		if(current==13)
				{
					l.setText("Qno14: _____ is used to find and fix bugs in the Java programs");
					jb[0].setText("JVM");jb[1].setText("JRE");jb[2].setText("JDK");jb[3].setText("JDB");
		}
		if(current==14)
				{
					l.setText("Qno15: Which of the following is a valid declaration of a char?");
					jb[0].setText("int");jb[1].setText("char ca = 'tea';");jb[2].setText("char cr = \u0223;");jb[3].setText("char");
		}
		if(current==15)
				{
					l.setText("Qno16:  What is the return type of the hashCode() method in the Object class?");
					jb[0].setText("while");jb[1].setText("int");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==16)
				{
					l.setText("Qno17: What does the expression float a = 35 / 0 return?");
					jb[0].setText("infinity");jb[1].setText("0");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==17)
				{
					l.setText("Qno18: Which of the following tool is used to generate API documentation in HTML format from doc comments in source code ");
					jb[0].setText("Javadoc tool");jb[1].setText("javap tool");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==18)
				{
					l.setText("Qno19:Which of the following creates a List of 3 visible items and multiple selections abled? ");
					jb[0].setText("new List(3, true)");jb[1].setText("new List(3, false)");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==19)
				{
					l.setText("Qno20: Which of the following for loop declaration is not valid?");
					jb[0].setText("for ( int i = 99; i >= 0; i / 9 )");jb[1].setText("for ( int i = 7; i <= 77; i += 7 )");jb[2].setText("for ( int i = 20; i >= 2; - -i )");jb[3].setText("for ( int i = 2; i <= 20; i = 2* i )");
		}
		if(current==20)
				{
					l.setText("Qno21: Which method of the Class.class is used to determine the name of a class represented by the class object as a String?");
					jb[0].setText("getName()");jb[1].setText("toString()");jb[2].setText("getClass()");jb[3].setText("char");
		}
		if(current==21)
				{
					l.setText("Qno22: In which process, a local variable has the same name as one of the instance variables? ");
					jb[0].setText("Variable Shadowing");jb[1].setText("Abstraction");jb[2].setText("Multi-threading");jb[3].setText("Serialization");
		}
		if(current==22)
				{
					l.setText("Qno23: Which of the following is true about the anonymous inner class?");
					jb[0].setText("It has no class name");jb[1].setText("Objects can't be created");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==23)
				{
					l.setText("Qno24:  Which package contains the Random class?");
					jb[0].setText("java.util package");jb[1].setText("java.lang package");jb[2].setText("java.awt package");jb[3].setText("java.io package");
		}
		if(current==24)
				{
					l.setText("Qno25:  What do you mean by nameless objects?");
					jb[0].setText("An object that has no reference");jb[1].setText("string");jb[2].setText("both of these");jb[3].setText("non of these");
		}
		if(current==25)
				{
					l.setText("Qno26:  An interface with no fields or methods is known as a ______.");
					jb[0].setText("Marker Interface");jb[1].setText("Abstract Interface");jb[2].setText("CharSequence Interface");jb[3].setText("char");
		}
		if(current==26)
				{
					l.setText("Qno27: Which of the following is an immediate subclass of the Panel class? ");
					jb[0].setText("Applet class");jb[1].setText("Window class");jb[2].setText("Frame class");jb[3].setText("Dialog class");
		}
		if(current==27)
				{
					l.setText("Qno28: Which option is false about the final keyword?");
					jb[0].setText("A final class cannot extend other classes.");jb[1].setText("A final method can be inherited.");jb[2].setText("both of these");jb[3].setText("char");
		}
		if(current==28)
				{
					l.setText("Qno29: Which of these classes are the direct subclasses of the Throwable class?");
					jb[0].setText("Error and Exception class");jb[1].setText("RuntimeException and Error class");jb[2].setText("Exception and VirtualMachineError class");jb[3].setText("non of these");
		}
		if(current==29)
				{
					l.setText("Qno30: What do you mean by chained exceptions in Java?");
					jb[0].setText("An exception caused by other exceptions");jb[1].setText("RuntimeException and Error class");jb[2].setText("both of these");jb[3].setText("non of these");
		}
		if(current==30)
				{
					l.setText("Qno31:  In which memory a String is stored, when we create a string using new operator?");
					jb[0].setText("Heap memory");jb[1].setText("stack");jb[2].setText("string memory");jb[3].setText("non of these");
		}
		if(current==31)
				{
					l.setText("Qno32: What is the use of the intern() method?");
					jb[0].setText("It modifies the existing string in the database");jb[1].setText("It returns the existing string from memory");jb[2].setText("both a&b");jb[3].setText("char");
		}
		if(current==32)
				{
					l.setText("Qno33: Which of the following is a marker interface?");
					jb[0].setText("Runnable interface");jb[1].setText("Remote interface");jb[2].setText("Readable interface");jb[3].setText("Result interface");
		}
		if(current==33)
				{
					l.setText("Qno34:  Which of the following is a reserved keyword in Java?");
					jb[0].setText("object");jb[1].setText("strictfp");jb[2].setText("byte");jb[3].setText("char");
		}
		if(current==34)
				{
					l.setText("Qno35: Which keyword is used for accessing the features of a package?");
					jb[0].setText("package");jb[1].setText("import");jb[2].setText("export");jb[3].setText("extends");
		}
		if(current==35)
				{
					l.setText("Qno36: In java, jar stands for_____.");
					jb[0].setText("Java Archive Runner");jb[1].setText("none of these");jb[2].setText("Java Application Runner");jb[3].setText("jdk");
		}
		if(current==36)
				{
					l.setText("Qno37:  Which of the following is false?");
					jb[0].setText("The rt.jar stands for the runtime jar");jb[1].setText("It is an optional jar file");jb[2].setText("It contains all the compiled class files");jb[3].setText("non of these");
		}
		if(current==37)
				{
					l.setText("Qno38:  Which of the given methods are of Object class?");
					jb[0].setText("notify(), wait( long msecs ), and synchronized()");jb[1].setText("notify(), notifyAll(), and wait()");jb[2].setText("both a and b");jb[3].setText("sleep( long msecs ), wait(), and notify()");
		}

		if(current==38)
				{
					l.setText("Qno39: What is the initial quantity of the ArrayList list?");
					jb[0].setText("2");jb[1].setText("10");jb[2].setText("8");jb[3].setText("non of these");
		}
		if(current==39)
				{
					l.setText("Qno40: Which of the following is a mutable class in java?");
					jb[0].setText("java.lang.String");jb[1].setText("java.lang.StringBuilder");jb[2].setText("both a and b");jb[3].setText("non of these");
		}
		if(current==40)
				{
					l.setText("Qno41: What is meant by the classes and objects that dependents on each other?");
					jb[0].setText("Cohesion");jb[1].setText("Tight Coupling");jb[2].setText("Loose Coupling");jb[3].setText("non of these");
		}
		if(current==41)
				{
					l.setText("Qno42: How many threads can be executed at a time?");
					jb[0].setText("Only one thread");jb[1].setText("Multiple threads");jb[2].setText("Only main (main() method) thread");jb[3].setText("non of these");
		}
		if(current==42)
				{
					l.setText("Qno43:   If a thread goes to sleep");
					jb[0].setText("It releases all the locks it has.");jb[1].setText("It does not release any locks.");jb[2].setText("It releases half of its locks.");jb[3].setText("all of these");
		}
		if(current==43)
				{
					l.setText("Qno44: In character stream I/O, a single read/write operation performs _____.");
					jb[0].setText("One byte read/write at a time.");jb[1].setText("Two bytes read/write at a time.");jb[2].setText("Five bytes read/ write at a time.");jb[3].setText("non of these");
		}
		if(current==44)
				{
					l.setText("Qno45: Who invented Java Programming?");
					jb[0].setText("narender modi");jb[1].setText("James Gosling");jb[2].setText("imran khan");jb[3].setText("qaim ali shah");
		}
		if(current==45)
				{
					l.setText("Qno46:  Which of these cannot be used for a variable name in Java?");
					jb[0].setText("int");jb[1].setText("Float");jb[2].setText("keyword");jb[3].setText("identifier");
		}
		if(current==46)
				{
					l.setText("Qno47: ");
					jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");
		}
		if(current==47)
				{
					l.setText("Qno48:  What is the extension of java code files?");
					jb[0].setText(".js");jb[1].setText(".txt");jb[2].setText(" .java");jb[3].setText("c.");
		}
		if(current==48)
				{
					l.setText("Qno49:  Which of the following is not an OOPS concept in Java?");
					jb[0].setText("Polymorphism");jb[1].setText(" Inheritance");jb[2].setText("compilation");jb[3].setText("non of these");
		}
		if(current==49)
				{
					l.setText("Qno50: Which of the following is a type of polymorphism in Java Programming?");
					jb[0].setText("Multiple polymorphism");jb[1].setText("Multilevel polymorphism");jb[2].setText(" Compile time polymorphism");jb[3].setText("execution");
		}
		if(current==50)
				{
					l.setText("Qno51: . Which exception is thrown when java is out of memory?");
					jb[0].setText("both b & c");jb[1].setText("MemoryError");jb[2].setText("MemoryOutOfBoundsException");jb[3].setText("OutOfMemoryError");
		}

		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		if(current==10)
			return(jb[2].isSelected());
		if(current==11)
			return(jb[3].isSelected());
		if(current==12)
			return(jb[2].isSelected());
		if(current==13)
			return(jb[3].isSelected());
		if(current==14)
			return(jb[0].isSelected());
		if(current==15)
			return(jb[1].isSelected());
		if(current==16)
			return(jb[0].isSelected());
		if(current==17)
			return(jb[0].isSelected());
		if(current==18)
			return(jb[0].isSelected());
		if(current==19)
			return(jb[0].isSelected());
		if(current==20)
			return(jb[0].isSelected());
		if(current==21)
			return(jb[0].isSelected());
		if(current==22)
			return(jb[0].isSelected());
		if(current==23)
			return(jb[0].isSelected());
		if(current==24)
			return(jb[0].isSelected());
		if(current==25)
			return(jb[0].isSelected());
		if(current==26)
			return(jb[0].isSelected());
		if(current==27)
			return(jb[0].isSelected());
		if(current==28)
			return(jb[0].isSelected());
		if(current==29)
			return(jb[0].isSelected());
		if(current==30)
			return(jb[0].isSelected());
		if(current==31)
			return(jb[1].isSelected());
		if(current==32)
			return(jb[1].isSelected());
		if(current==33)
			return(jb[1].isSelected());
		if(current==34)
			return(jb[1].isSelected());
		if(current==35)
			return(jb[1].isSelected());
		if(current==36)
			return(jb[1].isSelected());
		if(current==37)
			return(jb[1].isSelected());
		if(current==38)
			return(jb[1].isSelected());
		if(current==39)
			return(jb[1].isSelected());
		if(current==40)
			return(jb[1].isSelected());
		if(current==41)
			return(jb[1].isSelected());
		if(current==42)
			return(jb[1].isSelected());
		if(current==43)
			return(jb[1].isSelected());
		if(current==44)
			return(jb[1].isSelected());
		if(current==45)
			return(jb[2].isSelected());
		if(current==46)
			return(jb[2].isSelected());
		if(current==47)
			return(jb[2].isSelected());
		if(current==48)
			return(jb[2].isSelected());
		if(current==49)
			return(jb[2].isSelected());
		if(current==50)
			return(jb[3].isSelected());
		return false;
	}
	public static void main(String s[])
	{
		new OnlineTest("Online Test Of Java");
	}


}
