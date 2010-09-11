<% @Import Namespace="System" %>
<% @Import Namespace="System.Xml" %>
<% @Import Namespace="System.Text" %>
<% @Import Namespace="System.IO" %>
<% @Import Namespace="System.Net" %>
<script language="C#" runat="server">
   void Page_Load(Object Src, EventArgs E) {
      PingServer("https://demo.docusign.net/API/3.0/Credential.asmx");
	  TestLogin("https://demo.docusign.net/API/3.0/Credential.asmx");
	  //WriteLog();
   }
   private void PingServer(string url)
   {
      String result = "";
      String strPost = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><Ping xmlns=\"http://www.docusign.net/API/Credential\" /></soap:Body></soap:Envelope>";
      StreamWriter myWriter = null;

      HttpWebRequest objRequest = (HttpWebRequest)WebRequest.Create(url);
      objRequest.Method = "POST";
      objRequest.ContentLength = strPost.Length;
      objRequest.ContentType = "text/xml; charset=utf-8";
	  objRequest.Headers.Add("SOAPAction","\"http://www.docusign.net/API/Credential/Ping\"");

      try
      {
         myWriter = new StreamWriter(objRequest.GetRequestStream());
         myWriter.Write(strPost);
      }
      catch (Exception e) 
      {
         //return e.Message;
		 Response.Redirect("error.aspx");
      }
      finally {
         myWriter.Close();
      }

      HttpWebResponse objResponse = (HttpWebResponse)objRequest.GetResponse();
      using (StreamReader sr = 
         new StreamReader(objResponse.GetResponseStream()) )
      {
         result = sr.ReadToEnd();
         // Close and clean up the StreamReader
         sr.Close();
      }
	  
	  
      	XmlDocument xDoc = new XmlDocument();
        xDoc.LoadXml(result);
        XmlNodeList name = xDoc.GetElementsByTagName("PingResult");
		if (name[0].InnerText=="true") Response.Write("1");
        //return name[0].InnerText;
   }
   
   private void TestLogin(string url) {
	   String Email = 	ConfigurationManager.AppSettings["APIUserEmail"];
	   String PassWord = ConfigurationManager.AppSettings["Password"];
	   
	   String result = "";
	   String strPost = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><Login xmlns=\"http://www.docusign.net/API/Credential\"><Email>"+Email+"</Email><Password>"+PassWord+"</Password></Login></soap:Body></soap:Envelope>";
	   
	   StreamWriter myWriter = null;

      HttpWebRequest objRequest = (HttpWebRequest)WebRequest.Create(url);
      objRequest.Method = "POST";
      objRequest.ContentLength = strPost.Length;
      objRequest.ContentType = "text/xml; charset=utf-8";
	  objRequest.Headers.Add("SOAPAction","\"http://www.docusign.net/API/Credential/Login\"");

      try
      {
         myWriter = new StreamWriter(objRequest.GetRequestStream());
         myWriter.Write(strPost);
      }
      catch (Exception e) 
      {
         //return e.Message;
		 Response.Redirect("error.aspx");
      }
      finally {
         myWriter.Close();
      }

      HttpWebResponse objResponse = (HttpWebResponse)objRequest.GetResponse();
      using (StreamReader sr = 
         new StreamReader(objResponse.GetResponseStream()) )
      {
         result = sr.ReadToEnd();
         // Close and clean up the StreamReader
         sr.Close();
      }
	  	  
      	XmlDocument xDoc = new XmlDocument();
        xDoc.LoadXml(result);
        XmlNodeList name = xDoc.GetElementsByTagName("Success");
		if (name[0].InnerText=="true") Response.Write("1");
		//Response.Write(name[0].InnerText);	   
   }
   
   private void WriteLog() {
	   
	   ////tw.Append("["+Request.ServerVariables["REMOTE_ADDR"]+"]");
	   //HttpCookie cookie = Request.Cookies["StartLoanCo1"];
	   //if (null == cookie) {
		//TextWriter tw = new StreamWriter(Request.ServerVariables["APPL_PHYSICAL_PATH"]+"Loan.log", true);
	   //HttpCookie cookie1 = new HttpCookie("StartLoanCo1");
	   //cookie1.Value = "1";
	   //Response.Cookies.Add(cookie1);
	   //tw.WriteLine("["+Request.ServerVariables["REMOTE_ADDR"]+"] - "+DateTime.Now.ToString()+" - Open Site");
	   //tw.Close();
	   //}
   }
   
</script>
<asp:literal id="myPage" runat="server"/>