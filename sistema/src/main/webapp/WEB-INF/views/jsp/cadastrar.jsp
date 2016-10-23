<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<center><h1>Cadastro de produtos</h1></center><br/>
	<form class="form-horizontal" action="salvaProduto">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Descrição</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" placeholder="Descrição do produto"><br/>
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">Código de barras</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" placeholder="Código de barras"><br/>
    </div>
    <label for="inputEmail3" class="col-sm-2 control-label">Valor</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" placeholder="Valor">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Cadastrar</button>
    </div>
  </div>
</form>
  </div>
</body>
</html>