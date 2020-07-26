public class CodingIsCool {

	public static void main (String[] args){
		//Creating different methods for each challenge
		challenge1();
		challenge2();
		challenge3();
		challenge4();
		challenge5();
		challenge6();
		challenge7();
		challenge8();
	}

	private static void challenge8() { //replace all 'a' to 'A' in the string
		String s = "apple computers ar+"
				+ "-*e an awesome way to program an awesome game!";
		s = s.replaceAll("a","A");
		System.out.println(s);
	}

	private static void challenge7() { //Using the substring, convert "William is cool" to "liam is cool". 
		String s = "William is cool";
		String r = "Liam ";
		String a = s.substring(8, 15);		
		System.out.println(r + a);
	}
	
	private static void challenge6() { //finding the position of 'walrus' in a sentence
		String s = "Blah blah blah blah blah blah blah l;kasdfj;laskdfj l;askdfjl;askjdflaskjdfl;k walrus";
		int i = s.indexOf("walrus");
		System.out.println(i);
	}
	
	private static void challenge5() {
		//im guessing output for this one. The output of problem 1 will be: "true"
	}

	private static void challenge4() { //trim "     Hello World" 
		String s = "     Hello World";
		s= s.trim();
		System.out.println(s);
	}

	private static void challenge3() { //replacing all the "L"s int the passage with "O"s
		String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc fringilla neque lectus, sed pharetra neque commodo id. Sed hendrerit sapien quis lorem efficitur gravida. Aliquam varius lorem ullamcorper, auctor augue eu, consectetur mi. Donec magna nulla, pellentesque ultrices pellentesque ut, mattis et turpis. Sed turpis nisi, pulvinar nec volutpat eget, porttitor in erat. Suspendisse in leo accumsan, viverra ex ac, vehicula nisl. Donec id sagittis lorem. Cras volutpat pretium aliquet. Quisque dolor arcu, tincidunt eget molestie sed, iaculis et lacus. Curabitur et elementum nunc. Nunc eu mollis nisi.";
		s = s.toLowerCase().replace('l', 'o');
		System.out.println(s);
	}

	public static void challenge2() { //Challenge is to convert your name from uppercase to lowercase, only using chars.
		char c = 'C';
		char h = 'H';
		char r = 'R';
		char i = 'I';
		char s = 'S';
		
		System.out.printf("%c%c%c%c%c%s", c, h, r, i,s ," converted to lowercase is ");
		
		c = Character.toLowerCase(c); 
		h = Character.toLowerCase(h);
		r = Character.toLowerCase(r);
		i = Character.toLowerCase(i);
		s = Character.toLowerCase(s);
		
		System.out.printf("%c%c%c%c%c\n", c, h, r, i,s);
	}

	public static void challenge1() { //challenge is to convert a lowercase letter to uppercase using this method
		String s = "cool";
		System.out.println(s + " converted to upper case is " + (s.toUpperCase()));
	}
}
