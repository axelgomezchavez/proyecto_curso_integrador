package systm_web;

import Entidades.*;
import Negocios.*;

public class Web_Consulta_Repuesto extends System.Web.UI.Page
{

	private Repuesto_Entidad cliente_entidad = new Repuesto_Entidad();

	private Repuesto_Neg cliente_neg = new Repuesto_Neg();

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

	}

	protected System.Web.UI.HtmlControls.HtmlForm form1;
	protected System.Web.UI.WebControls.TextBox TextBox1;

	
	
	protected System.Web.UI.WebControls.Button Button2;

	
	protected System.Web.UI.WebControls.GridView GridView1;
}