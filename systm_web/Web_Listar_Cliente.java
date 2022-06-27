package systm_web;

import Entidades.*;
import Negocios.*;

public class Web_Listar_Cliente extends System.Web.UI.Page
{

	private Cliente_Entidad cliente_entidad = new Cliente_Entidad();

	private Cliente_Neg cliente_neg = new Cliente_Neg();



	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{
		DataTable dt = new DataTable();

		String dato = TextBox1.Text;

		dt = cliente_neg.BUSCAR(dato);

		GridView1.DataSource = dt;
		GridView1.DataBind();
	}

	protected final void Button1_Click(Object sender, tangible.EventArgs e)
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

	protected final void GridView1_SelectedIndexChanged(Object sender, tangible.EventArgs e)
	{
		Session["codigo"] = GridView1.SelectedRow.Cells[1].Text;

		Session["cliente"] = GridView1.SelectedRow.Cells[2].Text;

		Session["ruc"] = GridView1.SelectedRow.Cells[3].Text;

		Session["direccion"] = GridView1.SelectedRow.Cells[4].Text;

		Session["telefono"] = GridView1.SelectedRow.Cells[5].Text;

		Session["ciudad"] = GridView1.SelectedRow.Cells[6].Text;





		Response.Redirect("Web_Editar_Cliente.aspx");
	}	
	protected System.Web.UI.HtmlControls.HtmlForm form1;

	
	protected System.Web.UI.WebControls.TextBox TextBox1;

	
	protected System.Web.UI.WebControls.Button Button2;

	protected System.Web.UI.WebControls.GridView GridView1;
}