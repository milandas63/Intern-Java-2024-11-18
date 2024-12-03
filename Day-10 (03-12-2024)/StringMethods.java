
public class StringMethods {

	public static void main(String[] args) {
		String word = "hallucination";
		System.out.println(word.substring(0, 4));
		System.out.println(word.substring(9));

		System.out.println(word.startsWith("Hall"));
		System.out.println(word.endsWith("tion"));

		String name = "Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.getBytes());
		char[] array2 = name.toCharArray();
		for(int i=array2.length-1; i>=0; i--) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		name = "Suraj Samal";

        StringBuffer classmate = new StringBuffer("Sonali Das");
        System.out.println(classmate);
        classmate.replace(7,10,"David");
        System.out.println(classmate);

        StringBuffer text = new StringBuffer("Milan Das");
        text.append(",").append("Sonali Das").append(",").append("Suraj Samal");
        System.out.println(text);
        text.append(",").append("Java Programmers");
        System.out.println(text);
	}
}
