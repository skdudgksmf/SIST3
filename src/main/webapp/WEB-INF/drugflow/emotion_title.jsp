<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
/* $(function(){
	$('.movie_name').click(function(){
		var p=$(this).attr("img");
		//alert(p);
		$('#poster').attr("src",p);
		// 제목
		var title=$(this).text();
		$('#movie_title').text(title);
		$('#res_title').val(title);
		var param="mno="+$(this).attr("id");
		sendMessage("POST", "theater_info.do", param, theaterInfo)
	});
});
function titleInfo()
{
	if(httpRequest.readyState==4)
	{
		if(httpRequest.status==200)
		{
			$('#egtitle').html(httpRequest.responseText);
		}
	}
} */

$(this).on("click","#artist_tab",function(){
    if($("#jb-tab-2").html()==""){
    $("#jb-tab-2").html(" <div class='container' data-behaviour='search-on-list'> "+
               " <input type='text' class='input-query' id='artist_search'  data-search-on-list='search' placeholder='Search In Artist'/>"+
               " <span class='counter' data-search-on-list='counter'></span>"+
               " <div class='list-wrap'>"+
               "<ul class='alist leftbox' id='artist_left' data-search-on-list='list'>가수</ul>"+
               "<ul class='alist rightbox' id='artist_right' data-search-on-list='list'>노래명</ul></div></div>");
    }
      $("#artist_search").keypress(function (e) {
         if ((e.which && e.which == 13) || (e.keyCode && e.keyCode == 13)) {
             $('.alist').html("");
             var artist_Name = $('#artist_search').val();
              $.ajax({
                    url:'search_artist.do',
                    type:'post',
                    contentType: "application/x-www-form-urlencoded; charset=UTF-8", 
                    dataType:"json",
                    data:{"artist_Name" : artist_Name.trim()},
                    success:function(data){
                          $('.alist').html("");
                       for (var i = 0;i<30;i++) {
                         
                         if(data[i]!=null){
                            var sdata = data[i].split("|");
                          $('ul#artist_left').append("<li class='list-item' data-search-on-list='list-item'>"+sdata[1]+"</li>");
                          $('ul#artist_right').append("<li class='list-item' data-search-on-list='list-item'>"+sdata[0]+"</li>");
                          
                         }
                       }
             /*        var ajaxName = decodeURIComponent(data.title+".."+data.poster+".."+data.artist);
                    $('#search_Panel').append("<div id='music_pan'><b>제목:"+data.title[0]+"</br>가수:"+data.artist+"</b></br></div>"); */
                    },
                   error:function(request,status,error){
                      alert(error);
                  }
              });
         } else {
             return true;
         }
       });
 
 });
</script>
</head>
<body>
  <center>
    <div>
    	<c:forEach var="vo" items="${elist }" varStatus="status">
			<a>${title }</a>
		</c:forEach>
		
	
    </div>
    </center>
</body>
</html>