using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;

namespace Sender
{
    public class BasePage : Page
    {
        public void LogOff()
        {
            Session.Clear();
            Response.Redirect(Request.RawUrl);
        }
    }
}
