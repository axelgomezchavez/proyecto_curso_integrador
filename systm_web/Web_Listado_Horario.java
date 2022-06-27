package systm_web;

import Entidades.*;
import Negocios.*;


public class Web_Listado_Horario extends System.Web.UI.Page
{

	private Horario_Entidad cliente_entidad = new Horario_Entidad();

	private Horario_Neg cliente_neg = new Horario_Neg();


	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{
		DataTable dt = new DataTable();

		String dato = TextBox1.Text;

		dt = cliente_neg.BUSCAR(dato);

		GridView1.DataSource = dt;
		GridView1.DataBind();
	}

	protected final void TextBox1_TextChanged(Object sender, tangible.EventArgs e)
	{

	}

	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{
		DataTable dt = new DataTable();

		String dato = TextBox1.Text;

		dt = cliente_neg.BUSCAR(dato);

		GridView1.DataSource = dt;
		GridView1.DataBind();
	}

	protected final void GridView1_SelectedIndexChanged(Object sender, tangible.EventArgs e)
	{
		Session["codigo"] = GridView1.SelectedRow.Cells[1].Text;



		Session["hora_inicio"] = GridView1.SelectedRow.Cells[2].Text;


		Session["hora_final"] = GridView1.SelectedRow.Cells[3].Text;

		Session["rutina"] = GridView1.SelectedRow.Cells[4].Text;







		Response.Redirect("Web_Editar_Horario.aspx");
	}




	protected System.Web.UI.HtmlControls.HtmlForm form1;


	protected System.Web.UI.WebControls.TextBox TextBox1;

	
	protected System.Web.UI.WebControls.Button Button2;

	
	protected System.Web.UI.WebControls.GridView GridView1;
}