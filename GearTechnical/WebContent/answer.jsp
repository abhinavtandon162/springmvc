<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="b" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Gear Technical Forum</h1>
	<h2>Answer the query</h2>
	<a href="index.jsp">Home</a>
	<b:form action="updated" method="post" modelAttribute="uu">
			<table>
				<tr>
					<td>Query Id :</td>
					<td><b:input path="queryId" value="${temp.queryId}"
							readonly="true" /></td>
				</tr>
				<tr>
					<td>Technology :</td>
					<td><b:input path="technology" value="${temp.technology }"
							readonly="true" /></td>
				</tr>
				<tr>
					<td>Question :</td>
					<td><b:input path="query" value="${temp.query}"
							readonly="true" /></td>
				</tr>
				<tr>
					<td>Question Raised By :</td>
					<td><b:input path="queryRaisedBy"
							value="${temp.queryRaisedBy}" readonly="true " /></td>
				</tr>
				<tr>
					<td>Solution :</td>
					<td><b:input path="solutions" /></td>
				</tr>
				<tr>
					<td>Answered By :</td>
					<td><b:select path="solutionGivenBy">
							<b:option value="">Please Select</b:option>
							<b:options items="${answered}" />
						</b:select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update Query"></td>
				</tr>
			</table>
	</b:form>
</body>
</html>