package systm_web;

import java.util.*;

public class SiteMaster extends MasterPage
{
	private static final String AntiXsrfTokenKey = "__AntiXsrfToken";
	private static final String AntiXsrfUserNameKey = "__AntiXsrfUserName";
	private String _antiXsrfTokenValue;

	protected final void Page_Init(Object sender, tangible.EventArgs e)
	{

		var requestCookie = Request.Cookies[AntiXsrfTokenKey];
		UUID requestCookieGuidValue;
		tangible.OutObject<UUID> tempOut_requestCookieGuidValue = new tangible.OutObject<UUID>();
		if (requestCookie != null && System.Guid.TryParse(requestCookie.Value, tempOut_requestCookieGuidValue))
		{
		requestCookieGuidValue = tempOut_requestCookieGuidValue.outArgValue;

			_antiXsrfTokenValue = requestCookie.Value;
			Page.ViewStateUserKey = _antiXsrfTokenValue;
		}
		else
		{
		requestCookieGuidValue = tempOut_requestCookieGuidValue.outArgValue;
			// Generate a new Anti-XSRF token and save to the cookie
			_antiXsrfTokenValue = System.Guid.NewGuid().toString("N");
			Page.ViewStateUserKey = _antiXsrfTokenValue;

			var responseCookie = new HttpCookie(AntiXsrfTokenKey);
			responseCookie.setHttpOnly(true);
			responseCookie.setValue(_antiXsrfTokenValue);
			if (FormsAuthentication.RequireSSL && Request.IsSecureConnection)
			{
				responseCookie.Secure = true;
			}
			Response.Cookies.Set(responseCookie);
		}


		Page.PreLoad += master_Page_PreLoad;
	}

	protected final void master_Page_PreLoad(Object sender, tangible.EventArgs e)
	{
		if (!IsPostBack)
		{

			ViewState[AntiXsrfTokenKey] = Page.ViewStateUserKey;
			ViewState[AntiXsrfUserNameKey] = Context.User.Identity.Name != null ? Context.User.Identity.Name : "";
		}
		else
		{

			if (!_antiXsrfTokenValue.equals((String)ViewState[AntiXsrfTokenKey]) || (String)ViewState[AntiXsrfUserNameKey] != (Context.User.Identity.Name != null ? Context.User.Identity.Name : ""))
			{
				throw new IllegalStateException("Validation of Anti-XSRF token failed.");
			}
		}
	}

	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{

	}



	
	protected System.Web.UI.WebControls.ContentPlaceHolder HeadContent;
	
	protected System.Web.UI.WebControls.ContentPlaceHolder FeaturedContent;
	protected System.Web.UI.WebControls.ContentPlaceHolder MainContent;
}