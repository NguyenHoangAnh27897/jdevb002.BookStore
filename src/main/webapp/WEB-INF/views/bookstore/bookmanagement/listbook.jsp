<%@include file="../../shared/templatehead.jsp"%>
<!-- section -->
<div class="section">
	<!-- container -->
	<div class="container">
		<!-- row -->
		<div class="row">
			<!-- section title -->
			<div class="col-md-12">
				<div class="section-title">
					<h2 class="title">List book</h2>
				</div>
			</div>
			<!-- section title -->
			<c:if test="${!empty listbooks}">
			<c:forEach items="${listbooks}" var="book">
			<!-- Product Single -->
			<div class="col-md-3 col-sm-6 col-xs-6">
				<div class="product product-single">
					<div class="product-thumb">
						<a class="main-btn quick-view" href="/bookstore/book/detailbook/${book.id}"><i
							class="fa fa-search-plus"></i> View</a> <img
							src="./img/product01.jpg" alt="">
					</div>
					<div class="product-body">
						<h3 class="product-price">${book.view}</h3>
						<div class="product-rating">
							<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star-o empty"></i>
						</div>
						<h2 class="product-name">
							<a href="#">${book.title}</a>
						</h2>
					</div>
				</div>
			</div>
			<!-- /Product Single -->
			</c:forEach>
			</c:if>
		</div>
		<!-- /row -->
	</div>
	<!-- /container -->
</div>
<!-- /section -->
<%@include file="../../shared/templatefooter.jsp"%>