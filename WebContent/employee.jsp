<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>employee</title>
                 
                 <body>      
                   <h1 align="center">Employee Salary</h1><p>
                
                 <form action ="employee"  method="get"> 
                 
                    Employee Id <input type="text"   name="id" placeholder="enterid" size="10" /><p>
                    Employee Name <input type="text"  name="name" placeholder="entername" size="10"/><p>
                    Employee Basic Salary <input type="text" name= "salary" placeholder="entersalary" size="10"/><p>
                   
                     Skills <input type="checkbox" name="c1" value="programming"/>Programing
                            <input type="checkbox" name="c2" value="analytical"/>Analytical
                            <input type="checkbox" name="c3" value="communication"/>Communication
                      
                         <p><input type="submit" value="submit"/>
                 </form>
                </body>  
 
</html>