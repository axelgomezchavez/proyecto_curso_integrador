package systm_web;

import Entidades.*;
import Negocios.*;



public class Web_Repuesto extends System.Web.UI.Page
{

	private Repuesto_Entidad cliente_entidad = new Repuesto_Entidad();

	private Repuesto_Neg cliente_neg = new Repuesto_Neg();


	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{

	}

	private void borar()
	{

		txtnombre.Text = "";


		txtserie.Text = "";





		txtcantidad.Text = "";
		txtcosto.Text = "";



	}


	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{
		if (txtnombre.Text.equals("") || txtserie.Text.equals("") || txtcantidad.Text.equals(""))
		{

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		}

		else
		{

			cliente_entidad.serie = txtserie.Text;



			cliente_entidad.nombre = txtnombre.Text;

			cliente_entidad.cantidad = txtcantidad.Text;





			cliente_entidad.costo = txtcosto.Text;



			cliente_neg.insert(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Guardado los Datos Correctamente')</script>");

			borar();




		}
	}

	protected final void Button4_Click(Object sender, tangible.EventArgs e)
	{
		Response.Redirect("Web_Consulta_Repuesto.aspx");
	}

	protected final void txtserie_TextChanged(Object sender, tangible.EventArgs e)
	{

	}

	protected final void txtnombre_TextChanged(Object sender, tangible.EventArgs e)
	{

	}

	protected final void txtcosto_TextChanged(Object sender, tangible.EventArgs e)
	{

	}

	protected final void txtcantidad_TextChanged(Object sender, tangible.EventArgs e)
	{

	}

	protected System.Web.UI.HtmlControls.HtmlForm form1;

		protected System.Web.UI.WebControls.TextBox txtserie;

	
	protected System.Web.UI.WebControls.TextBox txtnombre;

	
	protected System.Web.UI.WebControls.TextBox txtcosto;

	
	protected System.Web.UI.WebControls.TextBox txtcantidad;

	protected System.Web.UI.WebControls.Label txtsalida;

	protected System.Web.UI.WebControls.Button Button1;

	
	protected System.Web.UI.WebControls.Button Button4;
}