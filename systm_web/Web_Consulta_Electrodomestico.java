package systm_web;

import Entidades.*;
import Negocios.*;

//------------------------------------------------------------------------------
// <generado automáticamente>
//     Este código fue generado por una herramienta.
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código. 
// </generado automáticamente>
//------------------------------------------------------------------------------

public class Web_Consulta_Electrodomestico extends System.Web.UI.Page
{

	private Electrodomestico_Entidad cliente_entidad = new Electrodomestico_Entidad();

	private Electrodomestico_Neg cliente_neg = new Electrodomestico_Neg();

	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{
		DataTable dt = new DataTable();

		String dato = TextBox1.Text;

		dt = cliente_neg.BUSCAR(dato);

		GridView1.DataSource = dt;
		GridView1.DataBind();
	}

	protected final void GridView1_SelectedIndexChanged(Object sender, tangible.EventArgs e)
	{

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



	/** 
	 Control form1.
	 
	 
	 Campo generado automáticamente.
	 Para modificarlo, mueva la declaración del campo del archivo del diseñador al archivo de código subyacente.
	 
	*/
	protected System.Web.UI.HtmlControls.HtmlForm form1;

	/** 
	 Control TextBox1.
	 
	 
	 Campo generado automáticamente.
	 Para modificarlo, mueva la declaración del campo del archivo del diseñador al archivo de código subyacente.
	 
	*/
	protected System.Web.UI.WebControls.TextBox TextBox1;

	/** 
	 Control Button2.
	 
	 
	 Campo generado automáticamente.
	 Para modificarlo, mueva la declaración del campo del archivo del diseñador al archivo de código subyacente.
	 
	*/
	protected System.Web.UI.WebControls.Button Button2;

	/** 
	 Control GridView1.
	 
	 
	 Campo generado automáticamente.
	 Para modificarlo, mueva la declaración del campo del archivo del diseñador al archivo de código subyacente.
	 
	*/
	protected System.Web.UI.WebControls.GridView GridView1;
}