//OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
//This use case extends UC4 by defining the array inline
// This App displays a simple message on the console as OOPS using String.join() method and storing them in a String array
// @author Developer
// @version 5

class OOPSBannerApp{
	public static void main(String[] args){
		String[] lines = {
		String.join(" ","  ***   "    ,"  ***    "  ,"***  " ,"  ****"),
		String.join(" "," *   *  "    ," *   *   "  ,"*  * " ," *"),
		String.join(" ","*     * "    ,"*     *  "  ,"***  " ,"****"),
		String.join(" "," *   *  "    ," *   *   "  ,"*    " ,"   *"),
		String.join(" ","  ***   "    ,"  ***    "  ,"*    " ,"****")
        };
		
		for(String x:lines){
			System.out.println(x);
		}
	}
}