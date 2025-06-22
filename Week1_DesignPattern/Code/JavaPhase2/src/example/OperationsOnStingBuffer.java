package example;

public class OperationsOnStingBuffer {
 public static void main(String [] args) {
	 
		        // Creating a StringBuffer object
		        StringBuffer sb = new StringBuffer("Hello");

		        // 1. append(boolean b)
		        sb.append(true); // Hello true
		        System.out.println("After append(boolean): " + sb);

		        // 2. append(char c)
		        sb.append('X'); // Hello trueX
		        System.out.println("After append(char): " + sb);

		        // 3. capacity()
		        System.out.println("Capacity: " + sb.capacity());

		        // 4. charAt(int index)
		        System.out.println("Character at index 1: " + sb.charAt(1));

		        // 5. delete(int start, int end)
		        sb.delete(5, 9); // Deletes " true"
		        System.out.println("After delete: " + sb);

		        // 6. deleteCharAt(int index)
		        sb.deleteCharAt(5); // Deletes 'X'
		        System.out.println("After deleteCharAt: " + sb);

		        // 7. indexOf(String str)
		        sb.append(" World!");
		        System.out.println("Index of 'World': " + sb.indexOf("World"));

		        // 8. indexOf(String str, int fromIndex)
		        System.out.println("Index of 'o' from index 4: " + sb.indexOf("o", 4));

		        // 9. length()
		        System.out.println("Length of string: " + sb.length());

		        sb.replace(6, 11, "Java");
		        System.out.println("After replace: " + sb); // Hello Java!

		        // 11. reverse()
		        sb.reverse();
		        System.out.println("After reverse: " + sb);

		        // 12. substring(int start)
		        System.out.println("Substring from index 2: " + sb.substring(2));

		        // 13. substring(int start, int end)
		        System.out.println("Substring from index 2 to 5: " + sb.substring(2, 5));

		        // 14. toString()
		        String str = sb.toString();
		        System.out.println("To String: " + str);

		        // 15. trimToSize()
		        sb.trimToSize(); // Reduces capacity to the current length
		        System.out.println("After trimToSize, Capacity: " + sb.capacity());
		    }
		}








