//OOPSBannerApp UC8 - Render OOPS as Banner using HashMap Data Structure in Java Collections Framework, enhanching it's use in real world
// This App displays a simple message on the console as OOPS using different functions enhancing modularity
// @author Developer
// @version 8



import java.util.HashMap;

public class OOPSBannerApp {
    private static HashMap<Character,String[]> createCharacterMap(){
        HashMap<Character,String[]> charMap = new HashMap<>();
        charMap.put('O',new String[]{
        "  ***   ",
		" *   *  ", 
		"*     * ",  
		" *   *  ", 
		"  ***   "   
        });
        charMap.put('P',new String[]{
        "***  " ,
		"*  * " ,
		"***  " ,
		"*    ",
		"*    "
        });
        charMap.put('S',new String[]{
        "  ****",
		" *",
		"****",
		"   *",
		"****"
        });
        return charMap;
    }

    private static void displayBanner(String message,HashMap<Character,String[]> charMap){
        int patternHeight = charMap.get('O').length;
        for(int line = 0;line < patternHeight; line++){
            StringBuilder sb = new StringBuilder();
            for(char ch:message.toCharArray()){
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character,String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message,charMap);
    }
}
