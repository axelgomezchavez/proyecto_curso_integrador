package systm_web;

import systm_web.*;

public class Global extends HttpApplication
{
	private void Application_Start(Object sender, tangible.EventArgs e)
	{
		BundleConfig.RegisterBundles(BundleTable.Bundles);
		AuthConfig.RegisterOpenAuth();
	}

	private void Application_End(Object sender, tangible.EventArgs e)
	{

	}

	private void Application_Error(Object sender, tangible.EventArgs e)
	{

	}
}