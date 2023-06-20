# wedding_planner
This project is about Wedding planner - a java project. our webapp act asintermediator between user and vendor. where there are vendors (photographers,catering, designers....) they can add the services in the application and users can see the vendor details and can register for events according to their plan and budget.
in that I used MVC - MODEL VIEW CONTROLLER(usually it is a pattern in software design commonly used to implement user interface, data, and controlling logics)
	-in model package i used only DB connectivity classes which can be used anywhere in the project
	-view is like how project will display in frontend.
	-controller are the main business class of the project
before displayingview, it checks for the controller and then run the view
FRAMEWORK USED JAVA AWTas Frontend and MySQL as Backend.
JAVA AWT(Abstract Window Toolkit) is an API to develop Graphical User Interface (GUI) or windows-based applications in Java.
Java AWT components are platform-dependent i.e., components are displayed according to the view of operating system.
The java.awt package provides classes for AWT API suchas TextField, 
Label, TextArea,RadioButton, CheckBox, Choice, List etc
It calls the native platform (operating systems) subroutine for creating API components like TextField, ChechBox, button, etc.
In simple words, an AWT application will look like a windows application in Windows OS whereas it will look like a Mac application in the MAC OS.
