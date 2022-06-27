package systm_web;

import Entidades.*;
import Negocios.*;


public class Web_Horario extends System.Web.UI.Page
{

	private Horario_Entidad cliente_entidad = new Horario_Entidad();

	private Horario_Neg cliente_neg = new Horario_Neg();



	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{

		if (!IsPostBack)
		{


			tecnico();



		}
	}
	private void tecnico()
	{

		DataTable dt = new DataTable();
		dt = cliente_neg.LISTAR();

		cbotecnico.DataSource = dt;

		this.cbotecnico.DataTextField = "apellidos";

		this.cbotecnico.DataValueField = "id_tecnico";

		this.cbotecnico.DataBind();

		cbotecnico.Items.Insert(0, new ListItem("[Seleccionar]", "0"));
	}
	private void borar()
	{




		txtinicio.Text = "";
		txtfinal.Text = "";





	}
	protected final void Button4_Click(Object sender, tangible.EventArgs e)
	{
		Response.Redirect("Web_Listado_Horario.aspx");
	}

	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{

		if (txtfinal.Text.equals("") || txtinicio.Text.equals(""))
		{

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		}

		else
		{

			cliente_entidad.inicio = txtinicio.Text;

			cliente_entidad.final_Keyword = txtfinal.Text;






			cliente_entidad.tecnico = cbotecnico.SelectedValue.toString();


			cliente_entidad.estado = txtestado.Text;




			cliente_neg.insert(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Guardado los Datos Correctamente')</script>");

			borar();




		}
	}



	
	protected System.Web.UI.HtmlControls.HtmlForm form1;

	
	protected System.Web.UI.WebControls.TextBox txtinicio;

	
	protected System.Web.UI.WebControls.TextBox txtfinal;


	protected System.Web.UI.WebControls.DropDownList cbotecnico;

	
	protected System.Web.UI.WebControls.TextBox txtestado;


	protected System.Web.UI.WebControls.Label txtsalida;


	protected System.Web.UI.WebControls.Button Button1;

	
	protected System.Web.UI.WebControls.Button Button4;
}