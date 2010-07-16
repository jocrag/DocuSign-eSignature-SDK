using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace InsuranceCo
{
    public partial class EmbeddedHost : BasePage
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["EmbeddedToken"] != null)
            {
                hostiframe.Attributes["src"] = (string)Session["EmbeddedToken"];
            }
            else
            {
                base.GoToErrorPage("EmbeddedToken not set");
            }
        }
    }
}
