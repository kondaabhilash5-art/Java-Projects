import java.util.*; 

 class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String str1 = sc.nextLine(); 
        String str2 = sc.nextLine(); 
        int count = 0; 
        int[] freq1 = new int[26]; 
        
         for (int i = 0; i < str1.length(); i++) { 
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                freq1[str1.charAt(i) - 'a']++; 
            }
        } 
        
        for (int i = 0; i < str2.length(); i++) { 
            if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') {
                freq1[str2.charAt(i) - 'a']--; 
            }
        } 
        
        for (int i = 0; i < 26; i++) { 
            count += Math.abs(freq1[i]);
        } 
        
        HashMap<Character, String> map = new HashMap<>(); 
        map.put('f', "Friends"); 
        map.put('l', "Love"); 
        map.put('a', "Affection"); 
        map.put('m', "Marriage"); 
        map.put('e', "Enemy"); 
        map.put('s', "Sister"); 
        
        StringBuilder str = new StringBuilder("flames"); 
        int startPointer = 0; 

        
        if (count == 0) {
            count = 1; 
        }

        
        while (str.length() > 1) {
            int stepsNeeded = (count - 1) % str.length(); 
            int removeIndex = (startPointer + stepsNeeded) % str.length(); 
            
            str.deleteCharAt(removeIndex); 
            
            startPointer = removeIndex; 
            if (startPointer >= str.length()) { 
                startPointer = 0; 
            } 
        } 

        
        System.out.println(map.get(str.charAt(0))); 
        sc.close();
    } 
}

    

