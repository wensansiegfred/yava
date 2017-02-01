<style>
	.row:not(:first-child) {
		padding-top: 3px;	
	}
	.row:last-child {
		padding-top: 15px;
	}
</style>
<div class="row">
	<div class="col-xs-2 back_to_patient_management"><i class="fa fa-fw fa-arrow-circle-left"></i> Back</div>
</div>
<div class="row">
	<div class="col-xs-12">
		<div class="box">
			<div class="box-header">
  				<h3 class="box-title">Register Patient:</h3>
  			</div>
  			<div class="box-body">
  				<form id="register_patient">
	  				<div class="row">
	  					<div class="col-xs-1">Title:</div>
	  					<div class="col-xs-1">
	  						<select class="form-control" name="title">
	  							<option value="mr">Mr</option>
	  							<option value="ms">Ms</option>
	  							<option value="mrs">Mrs</option>
	  							<option value="other">Other</option>
	  						</select>
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">Last Name:</div>
	  					<div class="col-xs-3">
	  						<input type="text" class="form-control" name="lastName" />
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">First Name:</div>
	  					<div class="col-xs-3">
	  						<input type="text" class="form-control" name="firstName" />
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">Middle Name:</div>
	  					<div class="col-xs-3">
	  						<input type="text" class="form-control" name="middleName" />
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">Address:</div>
	  					<div class="col-xs-4">
	  						<input type="text" class="form-control" name="address" />
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">Birth Date:</div>
	  					<div class="col-xs-1">
	  						<input type="text" class="form-control" name="birthDay" />
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">Birth Place:</div>
	  					<div class="col-xs-4">
	  						<input type="text" class="form-control" name="birthPlace" />
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">Gender:</div>
	  					<div class="col-xs-1">
	  						<select class="form-control" name="gender">
	  							<option value="male">Male</option>
	  							<option value="female">Female</option>
	  							<option value="other">Other</option>
	  						</select>
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">Civil Status:</div>
	  					<div class="col-xs-1">
	  						<select class="form-control" name="civilStatus">
	  							<option value="single">Single</option>
	  							<option value="married">Married</option>
	  							<option value="widow">Window</option>
	  							<option value="divorce">Divorce</option>
	  							<option value="other">Other</option>
	  						</select>
	  					</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-xs-1">&nbsp;</div>
	  					<div class="col-xs-3">
		  					<button class="btn btn-default cancel"><i class="fa fa-fw fa-close"></i> Cancel</button>
		  					<button class="btn btn-primary save"><i class="fa fa-fw fa-save"></i> Save</button>
	  					</div>
	  				</div>
  				</form>
  			</div>
		</div>
	</div>
</div>