package moh.sample.sample2;

import org.s2n.ddt.util.http.HttpData;
import org.s2n.ddt.util.http.NetSend;


public class GetFromWeb {

	public static void main(String[] args) {

		HttpData hDat= new HttpData();
		//hDat.setUrl("http://sel2.in.com/up6.php");
		hDat.setUrl("http://yahoo.com");
		
		try {
				String s =NetSend.send(hDat, "",null,"GET" );
				System.out.println("Got : " + s +".");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
}
