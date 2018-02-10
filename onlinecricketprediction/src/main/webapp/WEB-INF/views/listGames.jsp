<div class="container">

		<div class="row">
		
		<!-- Display sidebar -->
		<div class= col-md-3">
		
			<%@include file="./shared/sidebar.jsp" %>
		
		</div>
		
		<!-- Display games -->
		<div class= col-md-9">
		
			<!--  Added breadcrumb component -->
			<div class="row">
			
				<div class="col-lg-12">
					
					<c:if test= "${userClickAllGames == true}">
						<ol class="breadcrumb">
						
							<li><a href="${contextRoot}/home">Home</a>
							<li class="active">All Games</li>
						</ol>
					</c:if>
									
				</div>
			</div>
			
			
		
		</div>
		
		</div>