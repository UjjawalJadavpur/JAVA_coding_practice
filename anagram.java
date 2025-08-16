import java.util.HashMap;

public class anagram {
    public static void main(String[] args) 
    {
      // Input: "listen", "silent"
      // Output: true
      
      String str1 = "listen";
      String str2 = "silent";
      int flag =1;
      
      HashMap<Character,Integer>hash = new HashMap<>();
      
      for(Character ch : str1.toCharArray())
      {
        
        hash.put(ch,hash.getOrDefault(ch,0)+1);
      }
      System.out.println(hash);
      for(Character ch : str2.toCharArray())
      {
        if(!hash.containsKey(ch) || hash.get(ch) == 0)
        {
          flag = 0;
          break;
        }
        else 
        hash.put(ch,hash.get(ch)-1);
      }
      
      if(flag == 1)
      System.out.println("anagram");
      else 
      System.out.println("Not");
      
    }
}
