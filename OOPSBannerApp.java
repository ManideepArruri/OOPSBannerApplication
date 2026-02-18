// This App displays a simple message on the console as OOPS using String.join() method and storing them in a String array
// @author Developer
// @version 4

class OOPSBannerApp{
	public static void main(String[] args){
		String[] lines = new String[5];
		lines[0] = String.join(" ","  ***   "    ,"  ***    "  ,"***  " ,"  ****");
		lines[1] = String.join(" "," *   *  "    ," *   *   "  ,"*  * " ," *");
		lines[2] = String.join(" ","*     * "    ,"*     *  "  ,"***  " ,"****");
		lines[3] = String.join(" "," *   *  "    ," *   *   "  ,"*    " ,"   *");
		lines[4] = String.join(" ","  ***   "    ,"  ***    "  ,"*    " ,"****");
		
		for(String x:lines){
			System.out.println(x);
		}
	}
}