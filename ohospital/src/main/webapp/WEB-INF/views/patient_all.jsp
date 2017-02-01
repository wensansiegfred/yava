<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		Patient Management
	</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="active">Patient</li>
	</ol>
</section>
<!-- Main content -->
<section class="content patient_management_sub_content">
	<div class="row">
        <div class="col-xs-12">
        	<div class="box">
        		<div class="box-header">
        			<h3 class="box-title">Patient List:</h3>
        			<div class="box-tools">
		                <div class="input-group input-group-sm" style="width: 150px;float: left;margin-right: 20px;">
		                  <input type="text" name="table_search" class="form-control" placeholder="Search">		
		                  <div class="input-group-btn">
		                    <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
		                  </div>
		                </div>
		                <div class="input-group input-group-sm">
		                	<button class="btn btn-default btn-sm manage_add_patient"><i class="fa fa-plus"></i>  Add</button>
		                </div>
		            </div>	
        		</div>
        		<div class="box-body table-responsive no-padding">
        			<table class="table table-hover">
        				<thead>
	        				<tr>
	        					<th>ID</th>
	        					<th>Title</th>
	        					<th>Name</th>
	        					<th>Birth Date</th>
	        					<th>Address</th>
	        					<th>Gender</th>
	        				</tr>
        				</thead>
        				<tbody>
        					<c:forEach var="patient" items="${patients}">
        						<tr>
        							<td>${patient.id}</td>
        							<td>${patient.title}</td>
        							<td>${patient.firstName} ${patient.lastName}</td>
        							<td>${patient.birthDay}</td>
        							<td>${patient.address}</td>
        							<td>${patient.gender}</td>
        						</tr>		
        					</c:forEach>
        				</tbody>
        			</table>
        		</div>
        	</div>
        </div>
    </div>
</section>