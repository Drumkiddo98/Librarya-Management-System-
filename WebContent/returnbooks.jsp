<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]>      <html class="no-js"> <!--<![endif]-->
<%@page import="java.util.ArrayList"%>
<%@page import="com.library.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Student Home</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="styles.css">
</head>

<body>
    <div class="header">
        <a href="#default" class="logo">Tom's Library</a>
        <div class="header-right">
            <a href="viewbooks.jsp">View Books</a>
            <a href="returnbooks.jsp">Return Books</a> 
            <a href="signout">Signout</a>
        </div>
        </div>
        <div>
     <table class="addadmin">
     	<th>
     		<tr><td>Book ID </td> 
     			<td>Book Name </td>
     			<td>Book Author</td>
     			<td>Book Price</td>
     			<td>Return </td>
      	</th>
     		<% 	String stumail=(String) session.getAttribute("studmail");
     			//out.println(stumail);
     			System.out.println(stumail);
     			ArrayList<Integer> bookList1 = new ArrayList<Integer>(); 
     			int stuID=0;
     			int bID=0;
     			for(Student st: DB.studList){
     				if(st.getStudMail().equals(stumail)){
     					
     					stuID = st.getStudentId();
     					System.out.println("Student ID:"+stuID);
     					break;
     				}
     			}
     			for(IssuedBook ibk: DB.issuedBookList){     				
     				if( stuID == Integer.parseInt(ibk.getsID())){ 
     					System.out.println("Book ID:"+ibk.getbID());
     					bookList1.add(Integer.parseInt(ibk.getbID()));   						
     			}
     			}
     			for(Integer bk : bookList1){
     				for(Book bk1: DB.bookList){
     					if(bk == bk1.getBookId()){
     						%>
     						 <tr><td><%=bk1.getBookId()%></td>
     							 <td><%=bk1.getBookName() %></td>
     							 <td><%=bk1.getBookAuthor()%> </td> 
     							<td> <%= bk1.getBookPrice()%> </td>
     							
     						</tr>	
     					<% 	
     					}
     				}
     			}
     			
     		
     		%>
     		
     		    			
     </table>
     </div>

        
</body>

</html>