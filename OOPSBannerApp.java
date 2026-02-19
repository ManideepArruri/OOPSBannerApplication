//OOPSBannerApp UC7 - Render OOPS as Banner using static class and explains the use of static and inner classes
// This App displays a simple message on the console as OOPS using different functions enhancing modularity
// @author Developer
// @version 7

class OOPSBannerApp{
    static class CharacterPatternMap{
        char character;
        String[] pattern;
        CharacterPatternMap(char character,String[] pattern){
            this.character = character;
            this.pattern = pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps(){
        OOPSBannerApp.CharacterPatternMap[] charMaps = new OOPSBannerApp.CharacterPatternMap[26];
        charMaps[14] = new CharacterPatternMap('O',new String[]{
        "  ***   ",
		" *   *  ", 
		"*     * ",  
		" *   *  ", 
		"  ***   "   
        });
        charMaps[15] = new CharacterPatternMap('P',new String[]{
        "***  " ,
		"*  * " ,
		"***  " ,
		"*    ",
		"*    "
        });
        charMaps[18] = new CharacterPatternMap('S',new String[]{
        "  ****",
		" *",
		"****",
		"   *",
		"****"
        });
        return charMaps;
    }
    public static String[] getCharacterPattern(char ch,CharacterPatternMap[] charMaps){
        return charMaps[ch-'A'].pattern;
    }
    public static void printMessage(String message,CharacterPatternMap[] charMaps){
        int len = message.length();
        String[][] ans = new String[len][5];
        int i = 0;
        for(char ch:message.toCharArray()){
            ans[i++] = getCharacterPattern(ch,charMaps);
        }
        for(int j=0;j<5;j++){
            for(int k=0;k<len;k++){
                System.out.print(ans[k][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args){
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message,charMaps);
	}
}