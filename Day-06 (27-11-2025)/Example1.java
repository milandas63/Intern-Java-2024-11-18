import java.awt.*;

public class Example1 {

	public static void main(String[] args) {
        byte[] ascii = {65,66,67,68,69,70,71,72,73,74,75};
        String name = new String(ascii);
        char[] c = {'M','i','l','a','n'};
        System.out.println(name);
        System.out.println(c);
        
        String title = new String("Hello World");
        Frame f = new Frame(title);
        Frame ff = new Frame("Java Batch-11");
        System.out.println(f);
        System.out.println(ff);

        
        String pm = "Narendra Modi";
        System.out.println(pm.charAt(11));
        
        String desig = "Prime Minister";
        String high = pm + ", " + desig;
        System.out.println(high);
        
        System.out.println(pm.concat(", ").concat(desig).concat(", India"));
        
	}

}
