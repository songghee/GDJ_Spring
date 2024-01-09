<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Countries List</h1>
	
	<nav aria-label="Page navigation example">
  <ul class="pagination">
  <c:if test="${!pager.start}">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    </c:if>
    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i" >
    <li class="page-item"><a class="page-link" href="./list?page=${i}">1</a></li>
	</c:forEach>
	
	<c:if test="${!pager.last}">
    <li class="page-item">
      <a class="page-link" href="./list?page=${pager.lastNum+1}" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
    </c:if>
  </ul>
</nav>

</body>
</html>