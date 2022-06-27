package systm_web;

import Entidades.*;
import Negocios.*;

public class Web_Editar_Cliente extends System.Web.UI.Page
{

	private Cliente_Entidad cliente_entidad = new Cliente_Entidad();

	private Cliente_Neg cliente_neg = new Cliente_Neg();

	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{
		if (!IsPostBack)
		{




			txtcodigo.Text = (String)Session["codigo"];

			txtnombre.Text = (String)Session["Cliente"];

			txtruc.Text = (String)Session["ruc"];

			txtdireccion.Text = (String)Session["direccion"];

			txttelefono.Text = (String)Session["telefono"];
			txtciudad.Text = (String)Session["ciudad"];



		}


	}


	private void borar()
	{

		txtnombre.Text = "";

		txtruc.Text = "";



		txttelefono.Text = "";
		txtdireccion.Text = "";

		txtciudad.Text = "";


	}
	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{


		if (txtnombre.Text.equals("") || txtdireccion.Text.equals("") || txtruc.Text.equals(""))
		{

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		}

		else
		{

			cliente_entidad.id = txtcodigo.Text;
			cliente_entidad.nombre = txtnombre.Text;

			cliente_entidad.ruc = txtruc.Text;





			cliente_entidad.direccion = txtdireccion.Text;

			cliente_entidad.telefono = txttelefono.Text;

			cliente_entidad.ciudad = txtciudad.Text;


			cliente_neg.modificar(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Guardado los Datos Correctamente')</script>");

			borar();

			Response.Redirect("Web_Listar_cliente.aspx");


		}
	}	
	protected System.Web.UI.HtmlControls.HtmlForm form1;

	
	protected System.Web.UI.WebControls.TextBox txtnombre;

	
	protected System.Web.UI.WebControls.TextBox txtruc;

	
	protected System.Web.UI.WebControls.TextBox txtdireccion;

	
	protected System.Web.UI.WebControls.TextBox txttelefono;

	
	protected System.Web.UI.WebControls.TextBox txtciudad;


	protected System.Web.UI.WebControls.Label txtsalida;

	
	protected System.Web.UI.WebControls.Label txtcodigo;

	
	protected System.Web.UI.WebControls.Button Button1;
}