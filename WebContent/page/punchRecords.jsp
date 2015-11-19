<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript">
 
 var url;
function save(){
	url="${pageContext.request.contextPath}/punchRecords/save.do";
	 alert($("#place").val());
	$("#fm").form("submit",{
		url:url,
		onSubmit:function(){
			return $(this);
		},
		success:function(result){
			var result=eval('('+result+')');
			if(result.success){
				$.messager.alert("系统提示","保存成功！");
			}else{
				$.messager.alert("系统提示","保存失败！");
				return;
			}
		}
	 });
 }
 </script>
<title>打卡</title>
</head>
<body>
   <form id="fm" method="post">
    <div id="tb" >
 		&nbsp;地点：&nbsp;<input type="text" id="place" name="place" size="20" class="easyui-validatebox" required="true"/>
 		<input type="text" id="id" name="id" class="easyui-numberbox" data-options="min:0,max:100" required="true"/>
 		&nbsp;状态：&nbsp;<select class="easyui-combobox" id="s_state" editable="false" panelHeight="auto" >
 								<option value="">请选择...</option>	
 								<option value="0">未分配</option>
 								<option value="1">已分配</option>					
 		                    </select>
 		<a href="javascript:save()" class="easyui-linkbutton" iconCls="icon-search" plain="true">搜索</a>
 	</div>
 </form>
</body>
</html>