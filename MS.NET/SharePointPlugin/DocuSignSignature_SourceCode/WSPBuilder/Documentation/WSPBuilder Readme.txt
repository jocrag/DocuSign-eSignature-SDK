WSPBuilder
by Carsten Keutmann

The WSPbuilder is a console application that creates SharePoint Solutions files
based on a folder structure. WSPBuilder will automatically traverse a "12" folder structure
and create the SharePoint solution manifest.xml and the wsp file based on the files it finds.
Therefore knowledge of how to create a solution manifest.xml and wsp file is not needed any more.

The folder structure that WSPBuilder uses to build the wsp file is actually the same folder
stucture you will find in: "%Program Files%\Common Files\Microsoft Shared\web server extensions\12"
So all that you have to do, is the create a \12 folder in your project and add your files to
that folder matching the same structure as if you where to put them directly into the
"%Program Files%\Common Files\Microsoft Shared\web server extensions\12" folder manually.

Lets say that you have created a SharePoint feature and you want to create a SharePoint Solution
for this feature. Then you just need to create the following folder structure in you project
directory: "[MyProject]\12\Template\Features\MyCustomFeature\" and put your feature files in
the MyCustomFeature folder, that being your feature. Then run the WSPBuilder from the your project
directory and it will automatically create the manifest.xml and pack it into a wsp file using the
content of the "\12" folder.

The WSPBuilder program fully supports the SharePoint Solution Schema meaning that it is possible
to create any kind of manifest.xml just by using folders. If the Solution Schema supports it, then
WSPBuilder can build it.

WSPBuilder simply saves you for doing the following:
------------------------------------------------------
No need for manually creating the manifest.xml file.
No need for manually specifying the DDF file.
No need for using makecab.exe

The WSPBuilder comes as an open source project under the GPL license.

Please read the manual for more details on how to use the WSPBuilder program.

If you find any problems or bugs. Please do not hesitate to contact me.


Environment requirements
------------------------
ASP.NET 2.0
Windows SharePoint 3.0


Program features
---------------------
- Supports Features
- Supports SiteDefinitions
- Supports SafeControl specification.
- Supports Code Access Security Policy specification.
- Supports every SharePoint root file or Templates file.
- Supports fully the SharePoint Solution Schema.
- Auto generation of Manifest.xml file.
- Auto generation of WSP (CAB) file.
- Auto generation of DDF file if requested.
- No parameter needed to build wsp file as standard.
- A lot of parameters to control the build process.
- Optional use of app.config to specify arguments.
- Open source (GPL)



Limitations
---------------------
The size of files which are to be packed into the WSP file must not exceed 2 GB.
The resulting WSP file must not exceed 2 GB.
You cannot add files to or delete files from an existing WSP archive.


NEW!
Visual Studio Extensions have been made and can be download from codeplex. 
---------------------
- Visual Studio Project and Item templates.
- Visual Studio Add-in.
- Install package for WSPBuilder.



Versions
---------------------
0.9.8.0206
Assembly resolvement has been updated. Now if multiple assemblies found with the same name, only the newest assembly is used.
WSPBuilder.exe now returns a 0 (int) when success full, otherwise a 1 when an exception has occurred.
The argument -Install have been added.
The argument -Uninstall have been added.
The argument -deploy now uninstalls the solution before reinstalling and deploying if the solution exist in SharePoint.
Minor bug with excludedfiletypes have been fixed.
Documentation has been corrected to the new versions of WSPBuilder.


0.9.8.0109
A warning problem with features solved.


0.9.7.1227
-BuildSolution is now fixed. This enables you to build multiple projects into one WSP file.
Multiple files with the same name (location) in CAB file have been solved. 
Assembly resolve now outputs better error description - bin\debug and bin\release is now supported.
Bug fixed with ProjectDLLPath argument.
Feature warning corrected.


0.9.7.1211
Satellite assemblies is now supported for GAC and WebApplication. (Strong name your Resource.DLL when adding it to the GAC)
The -Retract argument now works again.
The -Createfolders argument have been changed and fixed.
A bug with inner exceptions looping fixed.
Build from \GAC and \80\bin fixed.



0.9.7.1205
The WSPDeploy.exe has now been implementet into the WSPBuilder.exe, this means that deployment is now done from the WSPBuilder.exe. However this means that you properly can not build from a non SharePoint environment.
The argument -CustomCAS have been added. This enables you to specify a custom CAS for the solution. See the manual.txt.
The argument -Deploy and -Retract have been added to support deployment.
The argument -projectpath and -solutionpath have been added. This enables you define a path to where the project i located.
The argument -BuildCAB have been added. If set to true then a WSP 'Cab' file will be generated. If false the manifest.xml and DDF can still be created.
UnmanagedDLL support added. It is now possible to include unmanaged DLL's to the WSP package. Will always be added to the WebApplication bin folder.
Build from bin\debug and bin\release fixed.
Problem with assembly resolment fixed. Thanks to Alex Henderson.
Problem with some files not been excluded fixed. Thanks to Alex Henderson.
Trace bug fixed. Tracing now works properly.
Minor bugs fixed.



0.9.7.1011
Building from the bin\debug and bin\release are now supported without any configuration needed.
Multi project build are now possible. You can create a number of projects and then build all of them into one WSP package. Just go one level directory up from the projects and run the WSPBuilder.
The argument -CreateWSPFileList have been added. Creates text file, where every file added to the WSP package are specified. 
The argument -Includefiles have been added. Uses the file created from the -CreateWSPFileList argument.
The argument -Excludefiles have been added. Uses the file created from the -CreateWSPFileList argument.
The argument -TraceLevel have been added. This controls the level of console output from the program. The -silence argument is now obsolete.
The argument -Cleanup have been added. Deletes any temporary file like the manifest.xml.
The argument -BuildMode have been added. This helps to determine where to get the DLL's when build a solution.
Assembly resolvment should not be affected by Global Assembly Cache any more and resolve the specified folders before default.
Minor bugs fixed.
CABLIB.DLL x64 have been created. This is to be used on the Windows Server 2003 x64. (Not for the IA64).



0.9.7.0912
All new project structure.
CABLIB.DLL is now strong named and therefore can go into the Global Assembly Cache.
The autodetection for PermissionAttributes settings in the Assemblies, Classes and methods has been fixed.
Files and directories is exluded if they are hidden.
Files from the 12/Template folder are now included. (if any)



0.9.7.0815
A major bug with DLL resource files not being included have been fixed. Please read manual for how to include resources for a DLL.

0.9.7.0731
The argument -DeploymentServerType have been added. 
The argument -Excludepaths have been added. 
A bug with reading the feature.xml files that did not contain a ElementManifest tag solved. 

Thanks to bvanburen for helping out on this release.


0.9.7.0718
Bug fixed when the types in the DLL's do not have any namespace.  

0.9.7.0704
The argument -DLLReferencePath, it specifies where to look for reference DLL's used by the types in the solution. These reference DLL's are not included in the WSP package.

0.9.7.0703
The argument -BuildDDF is now supported. It builds a Diamond Directive File, that enables you to call makecab.exe.
The argument -ResetWebServer now works properly.
The argument -IncludeAssemblies have been added.
The argument -BuildSafeControls have been added.
Feature resouces and ElementFiles definition fixed.
SolutionBase have been removed and the wss.cs generated insted.
Resolving DLL references fixed.
Bug with Solutionid.txt file being readonly fixed.

Thanks to Mark Seward (Convergence) for helping out on this release.


0.9.7.0614
-wspname argument fixed.


0.9.7.0613
Minor bug with the Layouts folder fixed.
The wspbuilder can now run on environments other than Windows Server 2003. No more need for SharePoint, just .NET 2.0.
Issues with multiple dll's with same name solved.
Extra arguments added to control the 12, 80, GAC and bin folders.


0.9.7.0612
The wspbuilder can run on environment that supports .NET 2.0.
Issues with multiple dll's with same name solved.
Extra arguments added to control the 12, 80, GAC and bin folders.


0.9.7.0607
SiteDefinitions refactored to support more configurations.
WebApplication Assembly deployment has been corrected.


0.9.7.0604
Bug fix of Createfolders.

0.9.7.0603
Supports fully the SharePoint Solution Schema.
Auto generation of Manifest.xml file.
Auto generation of WSP (CAB) file.


Author
Carsten Keutmann
Independent SharePoint Consultant.

www.keutmann.dk
carsten@keutmann.dk

