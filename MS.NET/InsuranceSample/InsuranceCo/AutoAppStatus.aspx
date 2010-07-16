<%@ Page Title="" Language="C#" MasterPageFile="~/DefaultPage.Master" AutoEventWireup="true" CodeBehind="AutoAppStatus.aspx.cs" Inherits="InsuranceCo.AutoAppStatus" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
<div class="col1"><form id="theForm" runat="server" action="AutoAppStatus.aspx" method="post">
                <h1>Status - Automobile Insurance Application</h1>
                <table class="dataTable">
                    <thead>
                        <tr>
                            <th align="left">Envelope Id</th>
                            <th align="left">Application Type</th>
                            <th align="left">Application Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                           <td align="left">
                               <asp:Label ID="lblEnvelopeId" runat="server" Text=""></asp:Label></td>
                           <td align="left"><asp:Label ID="lblApplicationType" runat="server" Text=""></asp:Label></td>
                           <td align="left"><asp:Label ID="lblStatus" runat="server" Text=""></asp:Label></td>
                       </tr>
	                 
                   </tbody>
                </table>
                </form>
</div>
</asp:Content>
