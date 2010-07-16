<%@ Page Title="" Language="C#" MasterPageFile="~/FullNav.master" AutoEventWireup="true"
    CodeBehind="DemoOptions.aspx.cs" Inherits="LoanCo.demooptions" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div class="content-section" >
        <form  id="optionsform" runat="server">
        <div id="formErrorText" class="red">
        </div>
        <table style="width: 420px;">
            <tbody>
                <tr>
                    <td colspan="2">
                        <strong>Demo Options:</strong>
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Signing Location?
                    </td>
                    <td>
                        <asp:RadioButtonList ID="SigningLocation" runat="server">
                            <asp:ListItem>Embedded</asp:ListItem>
                            <asp:ListItem>Remote</asp:ListItem>
                        </asp:RadioButtonList>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        &nbsp;
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Extra Authentication?
                    </td>
                    <td>
                        <asp:RadioButtonList ID="Authentication" runat="server">
                            <asp:ListItem>None</asp:ListItem>
                            <asp:ListItem>IDLookup</asp:ListItem>
                            <asp:ListItem>Phone</asp:ListItem>
                        </asp:RadioButtonList>
                </tr>
                <tr>
                    <td colspan="2">
                        &nbsp;
                    </td>
                </tr>
                <tr>
                    <td>
                        Access Code<br />
                    </td>
                    <td>
                        <asp:TextBox ID="AccessCode" CssClass="form" runat="server" />
                    </td>
                </tr>
                <tr>
                    <td>
                        &nbsp;
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                        <asp:Button ID="submit" CssClass="border: 0px; margin-right: 52px;" Text="Save Options"
                            runat="server" />
                </tr>
            </tbody>
        </table>
        </form>
    </div>
</asp:Content>
