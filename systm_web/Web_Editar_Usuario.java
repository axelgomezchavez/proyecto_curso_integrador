package systm_web;

import Entidades.*;
import Negocios.*;



public class Web_Editar_Usuario extends System.Web.UI.Page
{

	private Usuario_Entidad cliente_entidad = new Usuario_Entidad();

	private Usuario_Neg cliente_neg = new Usuario_Neg();


	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{
		if (!IsPostBack)
		{




			txtcodigo.Text = (String)Session["codigo"];

			txtusuario.Text = (String)Session["usuario"];

			txtcontraseña.Text = (String)Session["contraseña"];

			txtcargo.Text = (String)Session["cargo"];




		}
	}
	private void borar()
	{

		txtusuario.Text = "";

		txtcargo.Text = "";



		txtcontraseña.Text = "";



	}
	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{
		if (txtusuario.Text.equals("") || txtcontraseña.Text.equals("") || txtcargo.Text.equals(""))
		{

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		}

		else
		{


			cliente_entidad.id = txtcodigo.Text;

			cliente_entidad.usuario = txtusuario.Text;

			cliente_entidad.contraseña = txtcontraseña.Text;





			cliente_entidad.cargo = txtcargo.Text;



			cliente_neg.modificar(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Guardado los Datos Correctamente')</script>");

			borar();

			//Response.Redirect("Web_Listado_Usuario.aspx");


		}
	}

	protected final void Button4_Click(Object sender, tangible.EventArgs e)
	{
		if (txtusuario.Text.equals("") || txtcontraseña.Text.equals("") || txtcargo.Text.equals(""))
		{

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		}

		else
		{


			cliente_entidad.id = txtcodigo.Text;




			cliente_neg.eliminar(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Elimiinado los Datos Correctamente')</script>");

			borar();




		}
	}


	protected System.Web.UI.HtmlControls.HtmlForm form1;

	
	protected System.Web.UI.WebControls.TextBox txtusuario;

	
	protected System.Web.UI.WebControls.TextBox txtcontraseña;


	protected System.Web.UI.WebControls.TextBox txtcargo;

	
	protected System.Web.UI.WebControls.Label txtsalida;

	
	protected System.Web.UI.WebControls.Label txtcodigo;

	
	protected System.Web.UI.WebControls.Button Button1;


	protected System.Web.UI.WebControls.Button Button4;
}