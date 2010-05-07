<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <title>Signing Status - DocuSign, Inc. ESIGN Sample</title>
  </head>
  <body>
    <form id="form1" action="viewPdf.do">
      <input name="envelopeId" type="hidden" value="<c:out value="${model.envelopeId}" />" />
      <div style="margin: 10px; font-size: 10pt;">
        The integrated signing has returned to the LoanCo.com.
        <br />
        <c:out value="${model.statusMessage}" />
        <br/>
        <br/>
        <span>Completed Information</span>
        <br/>
        <c:forEach var="tab" items="${model.tabs}">
          <span><c:out value="${tab.tabLabel}" />: <c:out value="${tab.tabValue}" /></span>
          <br/>
        </c:forEach>
        <br/>
        <input name="submit" type="submit" value="Download Pdf" />
      </div>
    </form>
  </body>
</html>
