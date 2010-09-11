<%@ Page Title="" Language="C#" MasterPageFile="~/DefaultPage.Master" AutoEventWireup="true"
    CodeBehind="AutoAppApply.aspx.cs" Inherits="InsuranceCo.AutoAppApply" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">

        <script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
        <script type="text/javascript" src="scripts/webservice-status.js"></script>
        <script type="text/javascript" src="scripts/util.js"></script>

</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div class="col1">
            <h1>
                Automobile Insurance Application</h1>
            <form class="applicationForm" id="applicationForm" method="post" action="AutoAppApply.aspx" runat="server">
            <fieldset>
                <legend class="heading">Insured Motorist Details</legend>
                <p>
                    Please fill in all fields:</p>
                <label for="firstName">
                    
                    <asp:TextBox Name="firstName" ID="firstName" Columns="50" TabIndex="1" runat="server"/>
                    First Name:<asp:Label ID="lblFirstNameError" ForeColor="Red" runat="server" Text="*" Visible="false"></asp:Label>
                </label>
                <label for="lastName">
                    <asp:TextBox Name="lastName" ID="lastName" Columns="50" TabIndex="2" runat="server"/>
                    Last Name:<asp:Label ID="lblLastNameRequired" ForeColor="Red" runat="server" Text="*" Visible="false"></asp:Label></label></fieldset>
            <br>
            <fieldset>
                <legend class="heading">Car Details</legend><p>
                    Please fill in all fields:</p>
                    <label for="carMake">
                        <asp:TextBox Name="carMake" ID="carMake" TabIndex="3" Columns="50" runat="server"/>
                        Car Make:<asp:Label ID="lblCarMakeRequired" ForeColor="Red" runat="server" Text="*" Visible="false"></asp:Label>
                    </label>
                    <label for="carModel">
                        <asp:TextBox Name="carModel" ID="carModel" TabIndex="4" Columns="50" runat="server"/>
                        Car Model:<asp:Label ID="lblCarModelRequired" ForeColor="Red" runat="server" Text="*" Visible="false"></asp:Label>
                    </label>
                    <label for="carVIN">
                        <asp:TextBox Name="carVIN" ID="carVIN" TabIndex="5" Columns="50" runat="server"/>
                        Car VIN #:<asp:Label ID="lblCarVINRequired" ForeColor="Red" runat="server" Text="*" Visible="false"></asp:Label>
                    </label>
                    <div id="embeddedSigningFieldSection">
                    <label for="embeddedSigning">
                        <asp:CheckBox runat="server" Name="embeddedSigning" ID="embeddedSigning" 
                        tabindex="6"  AutoPostBack="true" 
                        oncheckedchanged="embeddedSigning_CheckedChanged"/>
                        <span>Complete Application now? (Embedded Signing)</span>
                    </label>
                </div>
                <div id="embeddedSendingFieldSection">
                    <label for="embeddedSending">
                        <asp:CheckBox runat="server" Name="embeddedSending" ID="embeddedSending" 
                        tabindex="7"  AutoPostBack="true" 
                        oncheckedchanged="embeddedSending_CheckedChanged"/>
                        <span>Customize Insurance Application? (Embedded Sending)</span>
                    </label>
                </div>
                <div id="emailDestinationFieldSection">
                    <label for="emailDestination">
                        <asp:TextBox Name="emailDestination" ID="emailDestination" TabIndex="8" Columns="50" runat="server"/>
                        What email address should receive the application?<asp:Label ID="lblEmailDestinationRequired" ForeColor="Red" runat="server" Text="*" Visible="false"></asp:Label></label><label for="emailDestinationCC"><asp:TextBox Name="emailDestinationCC" ID="emailDestinationCC" TabIndex="8" Columns="50" runat="server"/>
                        <span>What is the email address of the carbon copied recipient?</span>
                    </label>
                </div>
            </fieldset>
            &nbsp;&nbsp;&nbsp;&nbsp;<br />
            <fieldset>
                <legend class="heading">Authorization Options</legend><span>Extra Authentication?</span><br />
                <label for="AuthenticationMethod">
                   
                    <asp:RadioButton GroupName="AuthenticationMethod" 
                    ID="AuthenticationMethod_None" Text="None" runat="server" 
                    AutoPostBack="true" Checked="true" oncheckedchanged="AuthenticationMethod_None_CheckedChanged" 
                     />
                    <asp:RadioButton GroupName="AuthenticationMethod" 
                    ID="AuthenticationMethod_IDLookup" AutoPostBack="true" 
                    Text="IDLookup" runat="server" oncheckedchanged="AuthenticationMethod_IDLookup_CheckedChanged" 
                     />
                    <asp:RadioButton GroupName="AuthenticationMethod" 
                    ID="AuthenticationMethod_Phone" AutoPostBack="True" 
                    Text="Phone" runat="server" oncheckedchanged="AuthenticationMethod_Phone_CheckedChanged"  
                    />
                </label>
                <asp:Panel ID="authPhoneNumberContainer" runat="server" Visible="false">
                    <label for="authPhoneNumber">Authentication Phone Number:<asp:Label ID="lblAuthPhoneNumberRequired" ForeColor="Red" runat="server" Text="*" Visible="false"></asp:Label><asp:TextBox Name="authPhoneNumber" ID="authPhoneNumber" TabIndex="12" Columns="15" runat="server"/>
                    </label>
                </asp:Panel>
                <label for="accessCode">
                    <asp:TextBox Name="accessCode" ID="accessCode" TabIndex="13" Columns="50" runat="server"/>
                    <span>Application Access Code</span>
                </label>
            </fieldset>
            &nbsp;&nbsp;&nbsp;&nbsp;<asp:Button runat="server" text="Submit"  name="submit" ID="submit" TabIndex="15" 
                OnClientClick="return ValidateInput();" onclick="submit_Click" 
                />
            </form>
    </div>


</asp:Content>
