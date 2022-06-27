package systm_web;

import Entidades.*;
import Negocios.*;


public class Web_Electrodomestico extends System.Web.UI.Page
{

  private Electrodomestico_Entidad cliente_entidad = new Electrodomestico_Entidad();

  private Electrodomestico_Neg cliente_neg = new Electrodomestico_Neg();


	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{

	}
	private void borar()
	{

		txtserie.Text = "";

		txttipo.Text = "";



		txtmarca.Text = "";
		txtmodelo.Text = "";
		txtdescripcion.Text = "";



	}
	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{
		if (txtserie.Text.equals("") || txttipo.Text.equals("") || txtmarca.Text.equals(""))
		{

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		}

		else
		{

			cliente_entidad.serie = txtserie.Text;



			cliente_entidad.tipo = txttipo.Text;

			cliente_entidad.marca = txtmarca.Text;





			cliente_entidad.modelo = txtmodelo.Text;

			cliente_entidad.descripcion = txtdescripcion.Text;


			cliente_neg.insert(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Guardado los Datos Correctamente')</script>");

			borar();




		}
	}

	protected final void Button4_Click(Object sender, tangible.EventArgs e)
	{
		Response.Redirect("Web_Consulta_Electrodomestico.aspx");
	}



	
	protected System.Web.UI.HtmlControls.HtmlForm form1;

	
	protected System.Web.UI.WebControls.TextBox txtserie;

	
	protected System.Web.UI.WebControls.TextBox txttipo;

	
	protected System.Web.UI.WebControls.TextBox txtmarca;


	protected System.Web.UI.WebControls.TextBox txtdescripcion;

	
	protected System.Web.UI.WebControls.TextBox txtmodelo;

	
	protected System.Web.UI.WebControls.Label txtsalida;

	
	protected System.Web.UI.WebControls.Button Button1;

	
	protected System.Web.UI.WebControls.Button Button4;
}