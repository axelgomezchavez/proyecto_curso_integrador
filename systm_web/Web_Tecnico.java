package systm_web;

import Entidades.*;
import Negocios.*;



public class Web_Tecnico extends System.Web.UI.Page
{

	private Tecnico_Entidad cliente_entidad = new Tecnico_Entidad();

	private Tecnico_Neg cliente_neg = new Tecnico_Neg();

	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{

	}
	private void borar()
	{

		txtnombres.Text = "";

		txtapellidos.Text = "";



		txttelefono.Text = "";
		txtdireccion.Text = "";

		txtdni.Text = "";


	}
	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{
		if (txtnombres.Text.equals("") || txtdireccion.Text.equals("") || txtdni.Text.equals(""))
		{

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		}

		else
		{

			cliente_entidad.nombre = txtnombres.Text;



			cliente_entidad.ciudad = txtapellidos.Text;

			cliente_entidad.ruc = txtdni.Text;





			cliente_entidad.direccion = txtdireccion.Text;

			cliente_entidad.telefono = txttelefono.Text;




			cliente_neg.insert(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Guardado los Datos Correctamente')</script>");

			borar();




		}
	}

	protected final void Button4_Click(Object sender, tangible.EventArgs e)
	{
		Response.Redirect("Web_Consulta_Tecnicos.aspx");
	}



	
	protected System.Web.UI.HtmlControls.HtmlForm form1;

	
	protected System.Web.UI.WebControls.TextBox txtdni;

	
	protected System.Web.UI.WebControls.TextBox txtnombres;

	
	protected System.Web.UI.WebControls.TextBox txtapellidos;

	
	protected System.Web.UI.WebControls.TextBox txttelefono;

	
	protected System.Web.UI.WebControls.TextBox txtdireccion;

	protected System.Web.UI.WebControls.Label txtsalida;

	protected System.Web.UI.WebControls.Button Button1;

	protected System.Web.UI.WebControls.Button Button4;
}