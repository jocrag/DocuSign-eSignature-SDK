using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace InsuranceCo
{
    public partial class AutoAppStatus : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["Envelope"] != null)
            {
                Signing.Envelope env = (Signing.Envelope)Session["Envelope"];
                Signing.DocuSignWeb.EnvelopeStatus stat = env.RetrieveFullStatus();
                lblApplicationType.Text = "Auto Insurance Agreement";
                lblEnvelopeId.Text = env.EnvelopeId;
                lblStatus.Text = stat.Status.ToString();
            }

        }
    }
}
