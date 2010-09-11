using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace LoanCo
{
    public partial class demooptions : BasePage
    {
        protected  void Page_Load(object sender, EventArgs e)
        {
            //base.Page_Load(sender, e);
            if (Page.IsPostBack)
            {
                Session["SigningLocation"] = SigningLocation.SelectedValue;
                Session["Authentication"] = Authentication.SelectedValue;
                Session["AccessCode"] = AccessCode.Text;

            }
            else
            {
                SigningLocation.SelectedValue = Session["SigningLocation"].ToString();
                Authentication.SelectedValue = Session["Authentication"].ToString();
                AccessCode.Text = Session["AccessCode"].ToString();
            }
        }
    }
}
