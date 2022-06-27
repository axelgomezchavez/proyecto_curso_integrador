package systm_web;

import Entidades.*;
import Negocios.*;



public class Web_Login extends System.Web.UI.Page
{




	private Usuario_Entidad obje = new Usuario_Entidad();

	private Usuario_Neg objn = new Usuario_Neg();


	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{

	}

	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{


		DataTable dt = new DataTable();

		obje.usuario = txtusuario.Text;
		obje.contraseña = txtcontraseña.Text;



		dt = objn.N_login(obje);

		if (dt.Rows.Count > 0)
		{
			if (dt.Rows[0][3].toString().equals("Administrador"))
			{

				obje.usuario = dt.Rows[0][1].toString();
				obje.contraseña = dt.Rows[0][2].toString();






				Response.Redirect("Web_Menu_Principal.aspx");




			}

			else if (dt.Rows[0][3].toString().equals("Tecnico"))
			{

				obje.usuario = dt.Rows[0][1].toString();
				obje.contraseña = dt.Rows[0][2].toString();






				   Response.Redirect("Web_Menu_Tecnico.aspx");

			}




		}
		else
		{


			Response.Write("<script>alert('El Usuario y Contraseña es Incorrecto') </Script>");

		}



	}




	protected System.Web.UI.HtmlControls.HtmlForm form1;

	
	protected System.Web.UI.WebControls.Panel Panel2;

	
	protected System.Web.UI.WebControls.TextBox txtusuario;

	
	protected System.Web.UI.WebControls.TextBox txtcontraseña;

	
	protected System.Web.UI.WebControls.Button Button1;

	
	protected System.Web.UI.WebControls.Panel Panel1;
}