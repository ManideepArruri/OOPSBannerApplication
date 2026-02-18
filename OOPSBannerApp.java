//OOPSBannerApp UC6 - Render OOPS as Banner using functions
//This use case extends UC4 by defining the array inline
// This App displays a simple message on the console as OOPS using different functions enhancing modularity
// @author Developer
// @version 6

class OOPSBannerApp{
	public static void main(String[] args){
		String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        for(int i=0;i<oPattern.length;i++){
            System.out.println(oPattern[i]+" "+oPattern[i]+" "+pPattern[i]+" "+sPattern[i]);
        }
	}
    private static String[] getOPattern(){
        return new String[]{
        "  ***   ",
		" *   *  ", 
		"*     * ",  
		" *   *  ", 
		"  ***   "   
        };
    }
    private static String[] getPPattern(){
        return new String[]{
        "***  " ,
		"*  * " ,
		"***  " ,
		"*    ",
		"*    "
        };
    }
    private static String[] getSPattern(){
        return new String[]{
        "  ****",
		" *",
		"****",
		"   *",
		"****"
        };
    }
}