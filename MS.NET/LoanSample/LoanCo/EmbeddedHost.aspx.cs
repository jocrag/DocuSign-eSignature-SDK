using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace LoanCo
{
    public partial class embeddedhost : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["EmbeddedToken"] != null)
            {
                this.hostframe.Attributes["src"] = Session["EmbeddedToken"].ToString();
            }
            else
            {
                Session["errorMessage"] = "No Embedded Token to start embedded session with.";
                Response.Redirect("error.aspx");
            }

        }
    }
}
