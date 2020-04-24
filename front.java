package <missing>;

public class GlobalMembers
{
	/* front.c - a lexical analyzer system for simple
	 arithmetic expressions */

	/* Global declarations */
	/* Variables */
	public static int charClass;
	public static String lexeme = new String(new char[100]);
	public static char nextChar;
	public static int lexLen;
	public static int token;
	public static int nextToken;
	public static FILE in_fp;
/******************************************************/
/* lookup - a function to look up operators and
 parentheses and return the token */

	/* Function declarations */
	public static int lookup(char ch)
	{
		 switch (ch)
		 {
			 case '(':
				 addChar();
				 nextToken = DefineConstants.LEFT_PAREN;
				 break;
			 case ')':
				 addChar();
				 nextToken = DefineConstants.RIGHT_PAREN;
				 break;
			 case '+':
				 addChar();
				 nextToken = DefineConstants.ADD_OP;
				 break;
			 case '-':
				 addChar();
				 nextToken = DefineConstants.SUB_OP;
				 break;
			 case '*':
				 addChar();
				 nextToken = DefineConstants.MULT_OP;
				 break;
			 case '/':
				 addChar();
				 nextToken = DefineConstants.DIV_OP;
				 break;
			 default:
				 addChar();
				 nextToken = EOF;
				 break;
		 }
		 return nextToken;
	}

/******************************************************/
/* addChar - a function to add nextChar to lexeme */

	public static void addChar()
	{
		if (lexLen <= 98)
		{
			lexeme = tangible.StringFunctions.changeCharacter(lexeme, lexLen++, nextChar);
			lexeme = tangible.StringFunctions.changeCharacter(lexeme, lexLen, '\0');
		}
		else
		{
		System.out.print("Error - lexeme is too long \n");
		}
	}

/******************************************************/
/* getChar - a function to get the next character of
 input and determine its character class */

	public static void getChar()
	{
		 if ((nextChar = getc(in_fp)) != EOF)
		 {
			 if (Character.isLetter(nextChar))
			 {
				 charClass = DefineConstants.LETTER;
			 }
			 else if (Character.isDigit(nextChar))
			 {
				 charClass = DefineConstants.DIGIT;
			 }
			 else
			 {
				 charClass = DefineConstants.UNKNOWN;
			 }
		 }
		 else
		 {
			 charClass = EOF;
		 }
	}

/******************************************************/
/* getNonBlank - a function to call getChar until it
 returns a non-whitespace character */

	public static void getNonBlank()
	{
		while (Character.isWhitespace(nextChar))
		{
		getChar();
		}
	}

/******************************************************/
/* lex - a simple lexical analyzer for arithmetic
 expressions */

	public static int lex()
	{
		 lexLen = 0;
		 getNonBlank();
		 switch (charClass)
		 {
			/* Identifiers */
			 case DefineConstants.LETTER:
				 addChar();
				 getChar();
				 while (charClass == DefineConstants.LETTER || charClass == DefineConstants.DIGIT)
				 {
					 addChar();
					 getChar();
				 }
				 nextToken = DefineConstants.IDENT;
				 break;
			/* Integer literals */
			 case DefineConstants.DIGIT:
				 addChar();
				 getChar();
				 while (charClass == DefineConstants.DIGIT)
				 {
					 addChar();
					 getChar();
				 }
				 nextToken = DefineConstants.INT_LIT;
				 break;
			/* Parentheses and operators */
			 case DefineConstants.UNKNOWN:
				 lookup(nextChar);
				 getChar();
				 break;
				/* EOF */
			case EOF:
				 nextToken = EOF;
				 lexeme = tangible.StringFunctions.changeCharacter(lexeme, 0, 'E');
				 lexeme = tangible.StringFunctions.changeCharacter(lexeme, 1, 'O');
				 lexeme = tangible.StringFunctions.changeCharacter(lexeme, 2, 'F');
				 lexeme = tangible.StringFunctions.changeCharacter(lexeme, 3, '\0');
				 break;
		 } // End of switch
		 System.out.printf("Next token is: %d, Next lexeme is %s\n", nextToken, lexeme);
		 return nextToken;
	} // End of function lex

	/* Character classes */

	/* Token codes */

	/******************************************************/
	/* main driver */
	public static int Main()
	{
		/* Open the input data file and process its contents */
		 if ((in_fp = fopen("front.in", "r")) == null)
		 {
			 System.out.print("ERROR - cannot open front.in \n");
		 }
		 else
		 {
			 getChar();
		 do
		 {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

//Helper class added by C++ to Java Converter:

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2020 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to replicate various classic C string functions
//	which don't have exact equivalents in the Java framework.
//----------------------------------------------------------------------------------------
public final class StringFunctions
{
	//------------------------------------------------------------------------------------
	//	This method allows replacing a single character in a string, to help convert
	//	C++ code where a single character in a character array is replaced.
	//------------------------------------------------------------------------------------
	public static String changeCharacter(String sourceString, int charIndex, char newChar)
	{
		return (charIndex > 0 ? sourceString.substring(0, charIndex) : "")
			+ Character.toString(newChar) + (charIndex < sourceString.length() - 1 ? sourceString.substring(charIndex + 1) : "");
	}

	//------------------------------------------------------------------------------------
	//	This method replicates the classic C string function 'isxdigit' (and 'iswxdigit').
	//------------------------------------------------------------------------------------
	public static boolean isXDigit(char character)
	{
		if (Character.isDigit(character))
			return true;
		else if ("ABCDEFabcdef".indexOf(character) > -1)
			return true;
		else
			return false;
	}

	//------------------------------------------------------------------------------------
	//	This method replicates the classic C string function 'strchr' (and 'wcschr').
	//------------------------------------------------------------------------------------
	public static String strChr(String stringToSearch, char charToFind)
	{
		int index = stringToSearch.indexOf(charToFind);
		if (index > -1)
			return stringToSearch.substring(index);
		else
			return null;
	}

	//------------------------------------------------------------------------------------
	//	This method replicates the classic C string function 'strrchr' (and 'wcsrchr').
	//------------------------------------------------------------------------------------
	public static String strRChr(String stringToSearch, char charToFind)
	{
		int index = stringToSearch.lastIndexOf(charToFind);
		if (index > -1)
			return stringToSearch.substring(index);
		else
			return null;
	}

	//------------------------------------------------------------------------------------
	//	This method replicates the classic C string function 'strstr' (and 'wcsstr').
	//------------------------------------------------------------------------------------
	public static String strStr(String stringToSearch, String stringToFind)
	{
		int index = stringToSearch.indexOf(stringToFind);
		if (index > -1)
			return stringToSearch.substring(index);
		else
			return null;
	}

	//------------------------------------------------------------------------------------
	//	This method replicates the classic C string function 'strtok' (and 'wcstok').
	//------------------------------------------------------------------------------------
	private static String activeString;
	private static int activePosition;
	public static String strTok(String stringToTokenize, String delimiters)
	{
		if (stringToTokenize != null)
		{
			activeString = stringToTokenize;
			activePosition = -1;
		}

		//the stringToTokenize was never set:
		if (activeString == null)
			return null;

		//all tokens have already been extracted:
		if (activePosition == activeString.length())
			return null;

		//bypass delimiters:
		activePosition++;
		while (activePosition < activeString.length() && delimiters.indexOf(activeString.charAt(activePosition)) > -1)
		{
			activePosition++;
		}

		//only delimiters were left, so return null:
		if (activePosition == activeString.length())
			return null;

		//get starting position of string to return:
		int startingPosition = activePosition;

		//read until next delimiter:
		do
		{
			activePosition++;
		} while (activePosition < activeString.length() && delimiters.indexOf(activeString.charAt(activePosition)) == -1);

		return activeString.substring(startingPosition, activePosition);
	}
}
