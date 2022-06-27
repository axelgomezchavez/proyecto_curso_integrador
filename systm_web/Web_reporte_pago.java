package systm_web;

import CrystalDecisions.CrystalReports.Engine.*;
import CrystalDecisions.Shared.*;
import Entidades.*;
import Negocios.*;


public class Web_reporte_pago extends System.Web.UI.Page
{



	//Servicio_Entidad cliente_entidad = new Servicio_Entidad();

	//Servicio_Neg cliente_neg = new Servicio_Neg();


	protected final void Page_Load(Object sender, tangible.EventArgs e)
	{

	}

	protected final void Button1_Click(Object sender, tangible.EventArgs e)
	{


		//String dato = TextBox1.Text;



		//DataSet dset = new DataSet();

		//DataTable dt = new DataTable();

		//dt = cliente_neg.BUSCAR_PAGO(dato);

		//Web_reporte_pago_cliente reportar = new Web_reporte_pago_cliente();

		//reportar.SetDataSource(dt);

		//CrystalReportViewer1.ReportSource = reportar;
	}




	protected System.Web.UI.HtmlControls.HtmlForm form1;

	protected System.Web.UI.WebControls.Label txtcodigo;

	protected System.Web.UI.WebControls.Label Label1;

	
	protected System.Web.UI.WebControls.TextBox TextBox1;

	
	protected System.Web.UI.WebControls.Button Button1;

	
	protected CrystalDecisions.Web.CrystalReportViewer CrystalReportViewer1;
}