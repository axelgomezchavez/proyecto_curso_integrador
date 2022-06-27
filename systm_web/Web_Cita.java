package systm_web;

import Entidades.*;
import Negocios.*;

public class Web_Cita extends System.Web.UI.Page
{

	private Cita_Entidad cliente_entidad = new Cita_Entidad();


	private Cita_Neg cliente_neg = new Cita_Neg();


	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{

		if (!IsPostBack)
		{


			mostrar_cliente();

			mostrar_tecnico();




		}


	}
	private void mostrar_cliente()
	{

		DataTable dt = new DataTable();
		dt = cliente_neg.LISTAR_CLIENTE();

		cbocliente.DataSource = dt;

		this.cbocliente.DataTextField = "apellidos";

		this.cbocliente.DataValueField = "id_cliente";

		this.cbocliente.DataBind();

		cbocliente.Items.Insert(0, new ListItem("[Seleccionar]", "0"));
	}


	private void mostrar_tecnico()
	{

		DataTable dt = new DataTable();
		dt = cliente_neg.LISTAR_TECNICO();

		cbotecnico.DataSource = dt;

		this.cbotecnico.DataTextField = "apellidos";

		this.cbotecnico.DataValueField = "id_tecnico";

		this.cbotecnico.DataBind();

		cbotecnico.Items.Insert(0, new ListItem("[Seleccionar]", "0"));
	}
	 private void borar()
	 {




		txtlugar.Text = "";
		txthora.Text = "";




	 }



	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{
		  if (cboestado.Text.equals("") || txtfecha.Text.equals("") || cbocliente.Text.equals("") || cbotecnico.Text.equals(""))
		  {

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		  }

		else
		{

			cliente_entidad.fecha = txtfecha.Text;

			cliente_entidad.hora = txthora.Text;



				cliente_entidad.cliente = cbocliente.SelectedValue.toString();


			cliente_entidad.tecnico = cbotecnico.SelectedValue.toString();

			  cliente_entidad.lugar = txtlugar.Text;

			cliente_entidad.estado = cboestado.Text;





			cliente_neg.insert(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Guardado los Datos Correctamente')</script>");

			borar();

		}
	}

	protected final void Button4_Click(Object sender, tangible.EventArgs e)
	{
		Response.Redirect("Web_Consulta_Cita.aspx");
	}




	protected System.Web.UI.HtmlControls.HtmlForm form1;

	protected System.Web.UI.WebControls.TextBox txtfecha;
	protected System.Web.UI.WebControls.TextBox txthora;


	protected System.Web.UI.WebControls.DropDownList cboestado;

	protected System.Web.UI.WebControls.TextBox txtlugar;


	protected System.Web.UI.WebControls.DropDownList cbotecnico;


	protected System.Web.UI.WebControls.DropDownList cbocliente;

	protected System.Web.UI.WebControls.Label txtsalida;


	protected System.Web.UI.WebControls.Button Button1;


	protected System.Web.UI.WebControls.Button Button4;
}