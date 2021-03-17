<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]>      <html class="no-js"> <!--<![endif]-->
<%@page import="java.io.PrintWriter"%>
<%@page import="com.library.*"%>
<%@page import="java.util.Iterator"%>

<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>List Librarian</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="styles.css">
</head>

<body>
	
    
    <div class="header">
        <a href="#default" class="logo">Tom's Library</a>
                
           <div class="header-right">
        	<a  href="libhome.html">Home</a>
        	<a  href="addbook.html">Add Book</a>
        	<a  href="issuebook.html">Issue Book</a>
        	<a  href="listbook.jsp">List Book</a>
            <a 	href="listlibrarian.jsp">List Librarian</a>
            <a 	href="liststudents.jsp">List Students</a>
            <a 	href="signout">Signout</a>
        </div>
     </div>
     
     <div >
     <table class="addadmin">
     	<th>
     		<tr><td>Book ID </td> 
     			<td>Book Name </td>
     			<td>Book Author</td>
     			<td>Book Price</td>
      	</th>
     		<% 	
     		Iterator<Book> iterator= DB.bookList.iterator();
     		while(iterator.hasNext()){
     			Book bk = iterator.next(); 
     		%>
     		<tr><td><%= bk.getBookId()%></td>
     			<td><%= bk.getBookName() %></td>
     			<td><%= bk.getBookAuthor()%></td>   
     			<td><%= bk.getBookPrice()%></td>     			
     		</tr>
     		<%
     		}%>    			
     </table>
     </div>
     

</body>

</html>