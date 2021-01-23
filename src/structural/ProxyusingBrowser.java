package structural;

public class ProxyusingBrowser {

	public static void main(String[] args) {
		try{
			WebPageProxy proxy=new WebPageProxy();
			proxy.renderPage("www.notallowed.com");
		}
		catch(Exception e) {
			System.out.println("Exception caught"+e.getMessage());
			e.printStackTrace();
		}

	}

}
