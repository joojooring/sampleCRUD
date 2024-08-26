<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
글 수정 페이지
<form action="modify" method="post">
	<p>
		<label>글번호</label>
		<input type="text" name="no" value="${boardVO.no}" readonly="readonly" />
	</p>
	<p>
		<label>제목</label>
		<input type="text" name="title" value="${boardVO.title}" />
	</p>
	<p>
		<label>작성자</label>
		<input type="text" name="writer" value="${boardVO.writer}" />
	</p>
	<label>내용</label>
	<p>
	<textarea name="content" rows="10" cols="70" style="background-color:ivory;">${boardVO.content}
	</textarea>
	<p>
	<br />
	
	<button type="submit">저장</button>
</form>



</body>
</html>