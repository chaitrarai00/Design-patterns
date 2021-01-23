package structural;

public class WebpageImpl implements WebPage{

	@Override
	public void renderPage(String url) throws Exception {
		System.out.println(url+" Page rendered successfully");
		
	}

}
