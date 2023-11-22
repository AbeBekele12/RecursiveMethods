package One;

public class Driver {

    private static void Stars(int n) {
    	if (n == 0)
    		return;
    	for(int i = 0; i< n; i++)
    		System.out.print("*");
    	System.out.println();
    	Stars(n -1);
    	for(int i = 0; i< n; i++)
    		System.out.print("*");
    	System.out.println();
    }
    
    public static void main(String[] args) {
       Stars(4);
    }
}
