using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace LoanCo
{
    public partial class error : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["errorMessage"] != null)
            {
                if (Session["errorMessage"].ToString().Equals("ENTERCREDS"))
                {
                    pnlGetCreds.Visible = true;
                }
                else
                {
                    errorText.InnerText = Session["errorMessage"].ToString();
                }
            }
            else
            {
                errorText.InnerText = "No Error Message provided";
            }
        }
    }
}
