
<%@include file="../../shared/templatehead.jsp"%>

<div ng-app="myApp" ng-controller="categoryCtrl">

  <ul class="nav nav-tabs">
    <li   class="{{ tab.active ? 'active' : ''}}" ng-repeat="tab  in menuTabs">
    		<a data-toggle="tab" href="{{'#'+ tab.href }}">{{tab.name}}</a>
    </li>
<!--     <li><a data-toggle="tab" href="#edit">edit</a></li> -->
<!--     <li><a data-toggle="tab" href="#menu2">Menu 2</a></li> -->
<!--     <li><a data-toggle="tab" href="#menu3">Menu 3</a></li> -->
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>HOME</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
    </div>
    <div id="edit" class="tab-pane fade">
      <h3>EDIT CATEGORY</h3>
      	<form class="form-horizontal" action="{{'/categorymanagement/edit/' + data.id}}" method="POST">
      		 <div class="form-group">
			    <label class="control-label col-sm-2" for="id">Category ID</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="id" ng-model="data.id" placeholder="Category ID" readonly>
			    </div>
	  		</div>
	  		<div class="form-group">
			    <label class="control-label col-sm-2" for="name">Name</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="name" ng-model="data.name" placeholder="Name" >
			    </div>
	  		</div>
	  		<div class="form-group">
			    <label class="control-label col-sm-2" for="description">Description</label>
			    <div class="col-sm-10">
			       <textarea class="form-control" rows="5"  placeholder="Description" ng-model="data.description" id="comment"></textarea>
			    </div>
	  		</div>
      </form>
    </div>	
    <div id="detail" class="tab-pane fade">
      <h3>Menu 2</h3>
      <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
    </div>
  </div>

<h3>CATEGORY LIST</h3>
<table class="table table-tripped">
	<thead>
		<tr>
		<th>Category ID</th>
		<th>Name</th>
		<th>Description</th>
		<th>Parent ID</th>
		<th>Delete</th>
		<th>Edit</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${listCategories}" var="categoryVO">
		<tr>
		<td>${categoryVO.categoryID }</td>
		<td>${categoryVO.name }</td>
		<td>${categoryVO.description }</td>
		<td>${categoryVO.category_parentID }</td>
		<td><a href="/categorymanagement/delete/${categoryVO.categoryID }"><i class="fa fa-times-circle"></i></a></td>
		<td><span ng-click="activeTab('edit',{id:${categoryVO.categoryID },name:'${categoryVO.name }',description:'${categoryVO.description }',parentID:${categoryVO.category_parentID }})" ><i  class="fa fa-pencil-square-o"></i></span></td>
		</tr>
	</tbody>
	</c:forEach>
</table>
</div>
<%@include file="../../shared/templatefooter.jsp"%>

