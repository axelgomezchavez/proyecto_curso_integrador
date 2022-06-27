package systm_web;

import Entidades.*;
import Negocios.*;

public class Web_Editar_Horario extends System.Web.UI.Page
{

	private Horario_Entidad cliente_entidad = new Horario_Entidad();

	private Horario_Neg cliente_neg = new Horario_Neg();


	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{
		if (!IsPostBack)
		{

			entrenador();


			txtcodigo.Text = (String)Session["codigo"];

			txtinicio.Text = (String)Session["hora_inicio"];

			txtfinal.Text = (String)Session["hora_final"];

			cborutina.Text = (String)Session["rutina"];




		}




	}

	protected final void Button4_Click(Object sender, tangible.EventArgs e)
	{
		Response.Redirect("Web_Listado_Horario.aspx");
	}
	private void entrenador()
	{

		DataTable dt = new DataTable();
		dt = cliente_neg.LISTAR();

		cborutina.DataSource = dt;

		this.cborutina.DataTextField = "rutina";

		this.cborutina.DataValueField = "id_rutina";

		this.cborutina.DataBind();

		//cborutina.Items.Insert(0, new ListItem("[Seleccionar]", "0"));
	}
	private void borar()
	{




		txtinicio.Text = "";
		txtfinal.Text = "";

		//cborutina.Items.Insert(0, new ListItem("[Seleccionar]", "0"));



	}
	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{
		if (txtfinal.Text.equals("") || txtinicio.Text.equals(""))
		{

			this.Response.Write("<script language='JavaScript'>window.alert('Ingrese los Datos Correctamente')</script>");
		}

		else
		{


			cliente_entidad.id = txtcodigo.Text;

			cliente_entidad.inicio = txtinicio.Text;

			cliente_entidad.final_Keyword = txtfinal.Text;






			cliente_entidad.rutina = cborutina.SelectedValue.toString();







			cliente_neg.modificar(cliente_entidad);

			this.Response.Write("<script language='JavaScript'>window.alert('Asido Guardado los Datos Correctamente')</script>");

			borar();

			Response.Redirect("Web_Listado_Horario.aspx");


		}
	}



	
	protected System.Web.UI.HtmlControls.HtmlForm form1;

	
	protected System.Web.UI.WebControls.TextBox txtinicio;

	
	protected System.Web.UI.WebControls.TextBox txtfinal;

	
	protected System.Web.UI.WebControls.DropDownList cborutina;

	
	protected System.Web.UI.WebControls.Label txtcodigo;

	
	protected System.Web.UI.WebControls.Label txtsalida;

	
	protected System.Web.UI.WebControls.Button Button1;

	
	protected System.Web.UI.WebControls.Button Button4;
}