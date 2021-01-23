package structural;
/*The proxy layer class
 * This extra layer does the filtering and 
 * safeguard the service to be provided only if the conditions or requisites are sufficed
 */
public class WebPageProxy  implements WebPage{
	private WebPage webPage;
	public WebPageProxy() {
		webPage=new WebpageImpl();
	}
	@Override
	public void renderPage(String url) throws Exception {
		if(url.equalsIgnoreCase("www.notallowed.com")) {
			throw new Exception(url+" the url is blocked by service provider");
		}
		else {
			webPage.renderPage(url);
		}
	}
}
