public class reverseWordInString {
    public static void main(String[] args) {
        String str1 = "  hello   world  ";
        
        str1 = str1.trim();
        StringBuilder result = new StringBuilder();
        StringBuilder curr = new StringBuilder();
        
        int i = str1.length() - 1;
        while (i >= 0) 
        {
            char ch = str1.charAt(i);
            
            if (ch != ' ') 
            {
              curr.append(ch);
            } 
            else if (curr.length() > 0) 
            {
                result.append(curr.reverse()).append(" ");
                curr.setLength(0); // reset curr
            }
            i--;
        }
        
       
        if (curr.length() > 0) {
            result.append(curr.reverse());
        }
        
        System.out.println(result.toString());
    }
}
